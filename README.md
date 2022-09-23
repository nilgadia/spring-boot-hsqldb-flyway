## Database Initialization 

**There are two leading open source-based tools for database version control:<br>
Liquibase and Flyway.**<br>


https://www.liquibase.com/liquibase-vs-flyway
https://www.baeldung.com/liquibase-vs-flyway

## Database

**Leading open source database written in Java for testing purpose is HSQLDB & H2**

https://hsqldb.org/ <br>
https://hsqldb.org/web/hsqlDocsFrame.html

Running Database Access Tools

java -cp ../lib/hsqldb.jar org.hsqldb.util.DatabaseManagerSwing
java -cp hsqldb.jar org.hsqldb.util.DatabaseManagerSwing

A HyperSQL Database

Types of catalog data
• mem: stored entirely in RAM - without any persistence beyond the JVM process's life
• file: stored in file system
• res: stored in a Java resource, such as a Jar and always read-only

Running database access tool
C:\Users\shiqbal\.m2\repository\org\hsqldb\hsqldb\2.7.0>java -cp hsqldb-2.7.0.jar org.hsqldb.util.DatabaseManagerSwing

url
mem  - jdbc:hsqldb:hsql://<Ip Address>:<port>/<dbname> <br>
file - jdbc:hsqldb:hsql://<Ip Address>/<dbname>;file:<database/path>