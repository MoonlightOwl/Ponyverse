# Ponyverse

Message broker for OpenComputers. WIP.

## Scope

The main part of Ponyverse is the bridge server, preferably up as much as
possible. It transmits messages between clients.

The clients establish a connection with the server to be able to send message
packets. These messages are grouped by channels. Other clients can subscribe to
the channel to receive the messages sent to it.

Any device that has access to the internet can act as a client, such as
a computer, a phone, a web site or ingame OC device.

## Software

 - **Server (Scala, Akka)**. Acts as a bridge connecting clients. Also
   serves the statistics webpage.
 - **OC client (Lua)**. A small library for OC computers running OpenOS.
 - **Android client (Kotlin/Java/Scala?)**. An application that allows to use
   the bridge on mobile devices. It should feature a simple framework for
   building GUIs via Ponyverse messages.
 - **Desktop client (Scala?)**. The same for a personal computer.
 - **Web client (ScalaJS?)**. A web client for the lazy ones.

The software packages are independent. Ponyverse uses its own low-level network
protocol (based on TCP sockets) for communication between the parts.

Protocol details are available on [Google.Docs](https://docs.google.com/document/d/1RYuytEaUmkomfjNSeNSq1BnJu0rWJfIbcIZYIQ_A2qI/edit?usp=sharing).

## License
This work is licensed under the MIT License. See [LICENSE](LICENSE) for information.
