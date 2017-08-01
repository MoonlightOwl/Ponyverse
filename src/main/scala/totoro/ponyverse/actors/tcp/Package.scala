package totoro.ponyverse.actors.tcp

import akka.util.ByteString

object Package {
  def Ping(key: ByteString): Package = Package(ByteString(PackageHeader.Ping) ++ key)
  def Pong(key: ByteString): Package = Package(ByteString(PackageHeader.Pong) ++ key)
}

case class Package private (data: ByteString = ByteString())
