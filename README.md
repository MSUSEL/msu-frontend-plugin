# sonar-msufront-plugin

A Ruby on Rails plugin for SonarQube(TM). This plugin provides the following widgets for use in SonarQube version 5.6.5 or greater:

* Quality Bullet Chart
* Developer Progress
* RMF Bullet Chart
* Quality and TD Summary
* TD Charts
* Testing Display

## Installing Maven

This project uses the Maven wrapper so that you do not need to install maven manually.
The first time you go to build this project, simply execute the following command:

```
./mvnw clean install -Dmaven.test.skip=true
```
or for windows:
```
.\mvnw.cmd clean package -Dmaven.test.skip=true
```

## Building

This project can be built using the following command:

```
./mvnw clean package -Dmaven.test.skip=true
```

This project can be compile, tested, or packaged with the following commands:

```
./mvnw clean compile
./mvnw clean test
./mvnw clean package
```

## Upcoming Features