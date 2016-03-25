#!/bin/sh

mvn package -Dmaven.test.skip=true org.codehaus.sonar:sonar-packaging-maven-plugin:1.12.1:sonar-plugin

cp ./target/msufront-plugin-1.0.jar /opt/sonarqube-5.1.2/extensions/plugins
