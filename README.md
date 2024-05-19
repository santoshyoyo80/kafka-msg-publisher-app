# kafka-msg-producer-app
This application just to show how to send an event payload to kafka's topic.
# Pre-requisite
Make sure kafka zookeeper and kafka brokers are running on your local machine as application uses the local broker url see <b>application.yml</b> file
If you don't have kafka environment set up on your machine then do the following..<br>
<b>cd project<br></b>
<b>docker-compose up -d</b>
# To display running kafka brokers use following
<b>docker ps | grep kafka</b> 
### JAVA Version(1.8)
# Event Request Payload
### URL: http://localhost:8761/events
{
    "name" : "click",
    "ipv4" : "192.168.1.0",
    "ipv6": "192.6.56.6.5",
    "agentString":"Google chrome mac Os"
}
