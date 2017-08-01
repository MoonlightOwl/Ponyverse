package totoro.ponyverse

import akka.actor.{ActorSystem, Props}
import totoro.ponyverse.actors.tcp.TCPServerActor

object Ponyverse {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("ponyverse")
    system.actorOf(Props[TCPServerActor], "tcp-server")
  }
}
