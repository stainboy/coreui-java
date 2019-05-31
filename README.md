# Java backend for CoreUI
`coreui-java` is a tiny application serves as the start point of Micro-service developed in Java.

## How to use this project?
Just clone it to where your project starts with. Change the project name and other parameters and then use it as the start point of your application.

## What is the capability of this project?
- Serves data services via REST API
- Persist data in postgres
- Form authentication
- Redis based session management
- SpringBoot application
- Full featured CI support

## Prerequsites
- [JDK 8+](http://sapjvm.wdf.sap.corp:1080/downloads)
- [Gradle 5+](https://gradle.org/install/#manually)
- [Docker (optional for running postgres locally)](https://docs.docker.com/install/)
- [Compose (optional for running postgres locally)](https://docs.docker.com/compose/install/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)
- [Spring Tool Suite (STS)](https://spring.io/tools3/sts/all)

Note: Choose a preferred IDE as you wish, either `IDEA` or `STS`

## How to start backing services?
Refer [./mock/README.md](./mock/)

## How to run locally?
```bash
$ gradle bootRun
```
Then open browser and visit http://localhost:8080

## How to run test?
```bash
$ gradle test
```

## How to build?
```bash
$ gradle build
```