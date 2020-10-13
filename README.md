## Installation
Start MySQL Database by running the following command:
```shell script
$vagrant up
```
Test the database connection using the following parameters:
```properties
url:127.0.0.1
db_name:pressure_measurements
username:root
password:password 
```
Run the project by running the following command:
```shell script
$mvn spring-boot:run
```
Test the endpoints using Swagger:

http://localhost:8080/swagger-ui.html