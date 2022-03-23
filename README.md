# SpringDataMongoDB

A basic project to understand the SpringData MongoDB

This is a n-tier application , which consists of api layer , service layer and the data layer

StudentController acts as the Api layer - which receives the request and passes it to the service layer

StudentService acts as the service layer - which handles the main business logic 

StudentRepository is the data layer - which communicates with the mongodb instance and returns the data via service to the user

In this project , I have just created an api to fetch the records from the database .
