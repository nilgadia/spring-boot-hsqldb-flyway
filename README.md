## Initializing in memory database HSQLDB using flyway & connect to database using inbuilt HSQLDB access tool & play 

### Database Initialization 

#### There are two leading open source-based tools for database version control:
* Liquibase and Flyway
[https://www.liquibase.com/liquibase-vs-flyway]()

### Database

* Leading open source inmemory database written in Java for testing purpose is HSQLDB & H2

* For more details in HSQLDB refer below link

[https://hsqldb.org/]()
[https://hsqldb.org/web/hsqlDocsFrame.html]()

### Prerequisite

* Java 11
* Gradle
* IDE (Eclipse & IntelliJ)

###### Import project to IDE
###### Run the application
###### Go to installed directory of HSQLDB jar
`C:\..\..\.m2\repository\org\hsqldb\hsqldb\2.7.0>` <br>
###### Run below command to start HSQLDB inbuilt database access tool
`java -cp hsqldb.jar org.hsqldb.util.DatabaseManagerSwing`<br>

###### A window will appear, enter username, password and url
* Username - SA
* Password 
* url
  * mem  - jdbc:hsqldb:hsql://<Ip Address>:<port>/<dbname> jdbc:hsqldb:hsql://localhost:9001/testdb
  * file - jdbc:hsqldb:hsql://<Ip Address>/<dbname>;file:<database/path>


## Enjoy !!!  _Happy Learning_  ~~Play with database, practice ORM~~