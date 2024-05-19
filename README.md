
# kafka-msg-producer-app
This application just to show how to send an event payload to kafka's topic.
### JAVA Version(1.8)
# Pre-requisite
Make sure <b>kafka zookeeper</b> and <b>kafka brokers</b> are running on your local machine as application uses the local broker url see <b>application.yml</b> file
If you don't have kafka environment set up on your machine then do the following..<br>
- <b>git clone https://github.com/santoshyoyo80/kafka-msg-publisher-app</b><br>
- <b>cd kafka-msg-publisher-app</b><br>
- <b>docker-compose up -d</b>
## To display running kafka brokers use following
- <b>docker ps | grep kafka</b>
## To display running kafka brokers use following
- <b>docker ps | grep zoo</b>
## Event Request Payload 
- ### URL: http://localhost:8761/events
- ### Http Method:: POST
- ### Payload::
    {
        "name" : "click",
        "ipv4" : "192.168.1.0",
        "ipv6": "192.6.56.6.5",
        "agentString":"Google chrome mac Os"
    }
