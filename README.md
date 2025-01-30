## Spring Multiple Database
In this blog we will see about connecting to multiple Data sources from Spring Boot Application.
Refer below Datasource diagram for different component of Spring Data source related components.

There are 2 ways to obtain connection to Database in Spring Architecture:
1) Obtaining Connection directly through DataSource object
2) Having managed connection through Entity Manager, Transaction Manager beans where you can define the repositories
configured for each of the Database you would be having in case of multiple Data sources

    Refer to the classes PrimaryDatabaseConnection.java and SecondaryDatabaseConnection.java for more details

### Swagger Link to test the endpoints
http://localhost:8081/swagger-ui/index.html

### Takeaway

GenerationType.IDENTITY is mainly used for MySQL DB. The IDENTITY strategy relies on an auto-incremented database column. 
This is commonly used in MySQL and SQL Server.
In MySQL we cannot create sequence explicitly
```
CREATE TABLE currency (
id INT UNSIGNED NOT NULL AUTO_INCREMENT,
currency_name VARCHAR(30) NOT NULL,
description VARCHAR(30) NOT NULL,
PRIMARY KEY (id),
UNIQUE (id)
);

```
When using GenerationType.IDENTITY, the database generates a new value with each insert operation. This strategy is simple but can lead to performance issues with batch inserts.

https://medium.com/@bytewise010/spring-boot-identifiers-30454276449a

#### Spring Datasource

![img.png](img.png)

