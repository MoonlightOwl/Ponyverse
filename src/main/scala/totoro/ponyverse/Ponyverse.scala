package totoro.ponyverse

import akka.actor.{ActorSystem, Props}
import totoro.ponyverse.actors.MasterActor

object Ponyverse {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("ponyverse")
    val master = system.actorOf(Props[MasterActor], "master")
    master ! "Hello World!"
  }
}
