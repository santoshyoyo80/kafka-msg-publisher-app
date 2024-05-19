# Pre-requisite
Make sure zookeeper and kafka broker is stated or not if not started then start it.
# kafka-producer-app
This application intended to the send message to the kafka server/broker to the specific topic,
whatever we are sending to the kafka server called as payload

# JAVA Version(1.8)

# Event Request Payload
### URL: http://localhost:8761/events
{
    "name" : "click",
    "ipv4" : "192.168.1.0",
    "ipv6": "192.6.56.6.5",
    "agentString":"Google chrome mac Os"
}


