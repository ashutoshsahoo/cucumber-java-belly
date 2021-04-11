# cucumber-java-belly
Run cucumber tests from java executable jar

## Build project

```shell

mvn clean package

```

## Run tests from jar file

```shell

java -jar ./target/cucumber-java-belly-0.0.1.jar

```
## Run tests with cucumber options

```shell

java -jar ./target/cucumber-java-belly-0.0.1.jar --plugin json:reports/cucumber-report.json

```