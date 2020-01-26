# Spring-boot Sandbox
A simple spring-boot sandbox with two modules:

* app module - your main application
* mock module - all your mocked external services

Run from root directory
`mvn clean install`

## Liquibase
Liquibase dependency is integrated to spring-boot app module.

See resources/db

## Docker
A docker-compose.yaml file to run mysql database locally.

`docker-compose up`

See docker-compose.yaml file for default database credentials.