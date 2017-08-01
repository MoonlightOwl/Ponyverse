package totoro.ponyverse.actors.tcp

import java.net.InetSocketAddress

import akka.actor.{Actor, ActorLogging, Props}
import akka.io.{IO, Tcp}
import totoro.ponyverse.Const


class TCPServerActor extends Actor with ActorLogging {
  import Tcp._
  import context.system

  IO(Tcp) ! Bind(self, new InetSocketAddress("localhost", Const.Port))

  override def receive: Receive = {
    case b @ Bound(localAddress) =>
      log.info(s"Successfully bound to: ${localAddress.toString}")
      context.parent ! b

    case CommandFailed(_: Connect) =>
      context stop self

    case c @ Connected(_, _) =>
      val handler = context.actorOf(Props[ChannelHandler])
      val connection = sender()
      connection ! Register(handler)
  }
}
