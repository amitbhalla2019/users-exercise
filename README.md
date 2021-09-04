# users-exercise
A learning exercise just to have rest API calls the users from MongoDB 

In order to have the users being managed through RESTful APIs, we have developed two microservices to deal with the details of the USERs stored in MongoDB

We basically have simple operations to do here - Post, Update, Delete, Get/GetAll

http://localhost:8090/users/all - would give all the users without the need of any REST Client

http://localhost:8080/gateway/users/all - we have even introduced the gateway Zuul Proxy into the process to have the gateway design

The other operations are also like that and I can even a complete OpenAPI/Swagger Specification yaml files for the same

We have here ID - as long for all of the Users

User (Entity) is comprised of firstname, lastname, DOB, and title

http://localhost:8090/users/111

http://localhost:8090/users/123

http://localhost:8090/users/999

These all are get API calls to get a particular user whose id is 111 or 123 or 999

http://localhost:8090/users/?ids=111,123,999

This makes use of finding the list of users as through request param options

In the next phase we can even think of paginating the response we get for GetAll Rest API response
