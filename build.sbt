
name := "Ponyverse"
version := "0.1.1"

scalaVersion := "2.12.2"

mainClass in assembly := Some("totoro.ponyverse.Ponyverse")

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.5.3"
