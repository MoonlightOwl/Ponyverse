# Ponyverse

(WIP) Message broker for OpenComputers.

Design document: [Google.Docs](https://docs.google.com/document/d/1RYuytEaUmkomfjNSeNSq1BnJu0rWJfIbcIZYIQ_A2qI/edit?usp=sharing).

## Scope

Ponyverse main part is online 24/7 server, which plays a role of `bridge`,
transmitting messages from one client to another.

Clients can establish a connection with this server and send message packages. 
This packages are grouped by channels. Any other client can subscribe to the channel
(by channel’s ID) to receive the transmission.

A client may be anything - a computer, a phone, a web site or ingame OC device.

## Software

**Main parts:**
 - **Server (Scala, Akka)**. Plays a role of bridge, connecting clients.
   Also hosts the statistics web page.
 - **OC client (Lua)**. OpenComputers client in form of small OpenOS library.
 - **Android client (Kotlin/Java/Scala?)**. Mobile application to work with the bridge.
   Simple UI framework included.
 - **Desktop client (Scala?)**. The same for a personal computer.
 - **Web client (ScalaJS?)**. Web client for lazy ones.
 
These parts are independent software packages. Ponyverse uses a special low-level network
protocol via TCP to communication between different parts.

## License
[MIT License](LICENSE)
