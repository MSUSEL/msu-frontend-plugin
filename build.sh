#!/bin/sh

mvn clean
mvn package -Dmaven.test.skip=true org.sonarsource.sonar-packaging-maven-plugin:sonar-packaging-maven-plugin:1.17:sonar-plugin
