package totoro.ponyverse.actors

import akka.actor.Actor

class MasterActor extends Actor {
  override def receive: Receive = {
    case message =>
      println(message)
      context stop self
  }
}
