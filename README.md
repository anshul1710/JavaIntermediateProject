

##  APIs Application for Leave  Management

####``Technologies used``

1. Java JDK 1.8
2. Maven 3
3. Hibernate
4. MySQL
5. Spring Boot

####``How to run application application ``
To run the application excecute  AnshulApplication.java 
and the open http://localhost:1710/swagger-ui.html 
click on show/hide.

####``Dependencies used``

1.  log4j-core
2.  log4j-api
3.  spring-boot-starter-data-jdbc
4.  spring-boot-starter-data-jpa
5.  spring-boot-starter-web
6.  spring-boot-starter-test
7.  mysql-connector-java
8.  springfox-swagger2
10. springfox-swagger-ui

####``How to open Java Documentation``

1. Open javadoc package
2.Open index.html file
3. Right click inside index.html and click on OPEN IN BROWSER
4. Choose the browser where you want to open the javadoc

####``Functianlities``
These services can perform following functionality,

   1. Employee CRUD operations.
   
     > GET Method 
       Api -  /leave
       Discription - It returns all leaves
      
     > POST Method
       Api - /leave
       Discription - use to add a new leave
       Demo json - [
                       { 
                            "appliedDate": "string",
                            "endDate": "string",
                            "halfDay": true,
                            "leaveType": "string",
                            "reason": "string",
                            "startDate": "string",
                            "status": "string",
                            "updatedDate": "string"
                          
                       }
                   ] 
                   
      > GET Method
        Api - /leave/{type}
        Discription - returns the list of all leaves of partilar leaveType
        
      > DELETE Method
        Api - /leave/{leaveId}
        Description - deletes the leave with the particular leaveId
        
      > PUT Method
        Api - /leave/{leaveId}
        Description - update the leave of particular id
        Demo json - [
                          
                          
                          
                          
                              {
                                "appliedDate": "string",
                                "endDate": "string",
                                "halfDay": true,
                                "leaveType": "string",
                                "reason": "string",
                                "startDate": "string",
                                "status": "string",
                                "updatedDate": "string"
                              }
                          
                     ] 
      
   




