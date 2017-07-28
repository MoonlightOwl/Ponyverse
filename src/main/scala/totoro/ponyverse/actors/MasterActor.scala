package totoro.ponyverse.actors

import akka.actor.{Actor, ActorLogging}

class MasterActor extends Actor with ActorLogging {
  override def receive: Receive = {
    case message =>
      log.info(message.toString)
      context stop self
  }
}
