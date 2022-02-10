# camel-example-rest
Restfull web service using Apache Camel, Apache CXF and Spring Data JPA

  - camel-rest-handler  :   Camel based crud route to handle request (Spring repositories, Pojo)
  - camel-rest-server   :   Rest server routes
  - camel-rest-client   :   A sample project to request Rest Server

Change rest server binding port and api endpoint in file present in this location [camel-example-rest/camel-rest-server/src/main/resources/rest-server.properties](https://github.com/chittaranjanpanda/camel-example-rest/blob/master/camel-rest-server/src/main/resources/rest-server.properties)

Change rest client port, api endpoint and interval to request in file present in this location [camel-example-rest/camel-rest-client/src/main/resources/rest-client.properties](https://github.com/chittaranjanpanda/camel-example-rest/blob/master/camel-rest-client/src/main/resources/rest-client.properties)

Change h2-database server port in file present in this location [camel-example-rest/camel-rest-handler/src/main/resources/rest-handler.properties](https://github.com/chittaranjanpanda/camel-example-rest/blob/master/camel-rest-handler/src/main/resources/rest-handler.properties)

Open terminal move to root folder i.e. camel-example-rest
```sh
$ cd camel-example-rest
```
Execute [Maven](https://maven.apache.org/) commands to run the project
```sh
$ mvn clean install
$ mvn camel:run -pl camel-rest-server
```
To access h2-database which contains dummy data. Goto: 
```sh
http://localhost:8082 or http://localhost:[configured port]
```

From another terminal run the client to get sample response
```sh
$ mvn camel:run -pl camel-rest-client
```
