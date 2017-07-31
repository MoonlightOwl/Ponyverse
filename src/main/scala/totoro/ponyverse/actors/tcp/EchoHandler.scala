package totoro.ponyverse.actors.tcp

import akka.actor.Actor

class EchoHandler extends Actor {
  import akka.io.Tcp._

  override def receive: Receive = {
    case Received(data) => sender() ! Write(data)
    case PeerClosed     => context stop self
  }
}
