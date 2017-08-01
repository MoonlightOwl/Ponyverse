package totoro.ponyverse.actors.tcp

import akka.actor.{Actor, ActorRef}
import akka.util.ByteString

class ChannelHandler extends Actor {
  import akka.io.Tcp._

  override def receive: Receive = {
    case Received(data) => process(data, sender())
    case PeerClosed     => context stop self
  }

  private def process(data: ByteString, sender: ActorRef): Unit = {
    data.head match {
      case PackageHeader.Ping =>
        sender ! Write(Package.Pong(data.tail).data)
      case _ =>
        sender ! Write(data)
    }
  }
}
