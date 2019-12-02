# Spring Boot Application, itext, xlsx and csv file
 ![](https://i.imgur.com/qgRaRlub.jpg)
 
## Built With
* [Maven](https://maven.apache.org/) - Dependency Management
* [JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java™ Platform, Standard       Edition Development Kit 
* [Spring Boot](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring   A pplications
* [MySQL](https://dev.mysql.com/) - Open-Source Relational Database Management System
* [Git](https://git-scm.com/) - Free and Open-Source distributed version control system  
* [Itext](https://itextpdf.com/en) - PDF Toolkit for PDF generation, PDF programming, handling & manipulation.
* [Poi-ooxml](https://poi.apache.org/) - Java API To Access Microsoft Excel Format Files
* [Super-csv](http://super-csv.github.io/super-csv/index.html) - Java API To CSV Format Files

## Packages
- [x] Spring Boot
- [x] MySQL(Database)
- [x] Itext
- [x] Spring Data
- [x] Spring Web
- [x] Spring devtools
- [x] Apache Poi
- [X] Super CSV

```
.
├── Spring Elements
├── src
│   └── main
│       └── java
│           ├── com.springformat     
            ├── com.springformat.config
│           ├── com.springformat.controller
            ├── com.springformat.controller.rest
│           ├── com.springformat.entity
│           ├── com.springformat.util
│           ├── com.springformat.repository
│           └── com.springformat.service
            ├── com.springformat.view
            ├── com.springformat.view.Resolver
├── src
│   └── main
│       └── resources
│           └── static              
│           ├── templates            
│           ├── application.properties
│            
├── src
│   └── test
│       └── java
├── JRE System Library
├── Maven Dependencies
├── bin
├── logs
│   └── application.log
├── src
├── target
│   └──application-0.0.1-SNAPSHOT
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Packages
- `entity` — to hold our entities;
- `repositories` — to communicate with the database;
- `services` — to hold our business logic;
- `controllers` — to listen to the user;
- `resources/` - Contains all the static resources, templates and property files.
- `resources/static` - contains static resources such as css, js and images.
- `resources/templates` - contains server-side templates which are rendered by Spring.
- `resources/application.properties` - It contains application-wide properties. 
  Spring reads the properties defined in this file to configure your application. 
  You can define server’s default port, server’s context path, database URLs etc, in this file.
- `test/` - contains unit and integration tests
- `pom.xml` - contains all the project dependencies
 
## Running the application locally
mvn spring-boot:run
## Generate PDF 
http://localhost:8080/download.pdf
## Generate CSV
http://localhost:8080/download.csv
## Generate XLS
http://localhost:8080/download.xls


