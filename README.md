# CS 230 Portfolio

<p align="center">

[![Java](https://img.shields.io/badge/Java-OpenJDK-437291?style=for-the-badge&logo=openjdk&logoColor=white)](https://openjdk.org/)
[![Eclipse](https://img.shields.io/badge/Eclipse-IDE-2C2255?style=for-the-badge&logo=eclipseide&logoColor=white)](https://www.eclipse.org/ide/)
[![Maven](https://img.shields.io/badge/Apache-Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![Git](https://img.shields.io/badge/Git-Version_Control-F05032?style=for-the-badge&logo=git&logoColor=white)](https://git-scm.com/)
[![GitHub](https://img.shields.io/badge/GitHub-Portfolio-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/rpratts1/CS230-Program)
[![Linux](https://img.shields.io/badge/Linux-Server-FCC624?style=for-the-badge&logo=linux&logoColor=black)](https://www.linux.org/)
[![VS Code](https://img.shields.io/badge/Visual_Studio_Code-Editor-007ACC?style=for-the-badge&logo=visualstudiocode&logoColor=white)](https://code.visualstudio.com/)
[![Microsoft Word](https://img.shields.io/badge/Microsoft_Word-Documentation-2B579A?style=for-the-badge&logo=microsoftword&logoColor=white)](https://www.microsoft.com/microsoft-365/word)
[![macOS](https://img.shields.io/badge/macOS-Development-000000?style=for-the-badge&logo=apple&logoColor=white)](https://www.apple.com/macos/)

</p>

---

## CS 230: Operating Platforms

This repository contains selected coursework and project artifacts from CS 230: Operating Platforms.

The course focused on software architecture, operating systems, Java development, memory and storage management, distributed systems, networking, security, and software design.

Throughout the course, I worked with a client scenario involving The Gaming Room and its game, Draw It or Lose It.

The main goal was to help The Gaming Room expand its application so it could support multiple operating platforms while remaining reliable, secure, scalable, and maintainable.

---

## Technology Stack

| Technology | Purpose |
| --- | --- |
| [Java / OpenJDK](https://openjdk.org/) | Object-oriented programming and application development |
| [Eclipse IDE](https://www.eclipse.org/ide/) | Java development, testing, and debugging |
| [Apache Maven](https://maven.apache.org/) | Java project and dependency management |
| [Git](https://git-scm.com/) | Local version control |
| [GitHub](https://github.com/rpratts1/CS230-Program) | Repository hosting and portfolio management |
| [Visual Studio Code](https://code.visualstudio.com/) | Repository management and Markdown editing |
| [Linux](https://www.linux.org/) | Recommended server operating platform |
| [Microsoft Word](https://www.microsoft.com/microsoft-365/word) | Technical documentation |
| [macOS](https://www.apple.com/macos/) | Development environment |
| [OpenSSH](https://www.openssh.com/) | Secure GitHub authentication and remote access |

---

## Repository Organization

The repository is organized by course module.

    CS230-Program
    │
    ├── Module-1
    ├── Module-2
    ├── Module-3
    ├── Module-4
    ├── Module-5
    ├── Module-6
    ├── Module-7
    ├── .gitignore
    └── README.md

---

# Course Modules

## Module 1

Module 1 introduced Java inheritance, object-oriented programming, and UML class diagrams.

The Java project demonstrates inheritance relationships between vehicles and two-wheeled vehicles.

    Module-1
    ├── CS 230 Module One Assignment.docx
    ├── CS 230 Module One UML Class Diagram.png
    └── src
        └── com
            └── three19
                ├── Bicycle.java
                ├── Driver.java
                ├── TwoWheeled.java
                └── Vehicle.java

### Concepts Demonstrated

- Java programming
- Classes and objects
- Inheritance
- Object-oriented programming
- UML class diagrams
- Program structure

---

## Module 2

Module 2 introduced software design patterns and continued development of the Gaming Room application.

The project worked with the Singleton design pattern and several Java classes used to represent the game environment.

    Module-2
    ├── CS 230 Module Two Assignment Software Design.docx
    ├── CS 230 Project One Milestone FIXME Text Version.docx
    ├── CS 230 Project One Milestone UML Diagram.png
    └── src
        └── com
            └── gamingroom
                ├── Game.java
                ├── GameService.java
                ├── Player.java
                ├── ProgramDriver.java
                ├── SingletonTester.java
                └── Team.java

### Concepts Demonstrated

- Singleton design pattern
- Object-oriented programming
- Java collections
- Software design
- UML modeling
- Class relationships

---

## Module 3

Module 3 expanded the Gaming Room application and improved its object-oriented design.

An `Entity` base class was introduced to provide shared functionality for several application objects.

    Entity
    ├── Game
    ├── Team
    └── Player

The Module 3 Java project contains:

    Module-3
    ├── CS 230 Project One UML Diagram Text Version.docx
    ├── CS 230 Project Software Design.docx
    └── src
        └── com
            └── gamingroom
                ├── Entity.java
                ├── Game.java
                ├── GameService.java
                ├── Player.java
                ├── ProgramDriver.java
                ├── SingletonTester.java
                └── Team.java

### Concepts Demonstrated

- Inheritance
- Encapsulation
- Base classes
- Class relationships
- Singleton design
- Object management
- Software architecture

---

## Module 4

Module 4 introduced distributed application development using Java, Maven, Dropwizard, REST APIs, authentication, and authorization.

<p align="center">

[![Java](https://img.shields.io/badge/Java-REST_Application-437291?style=flat-square&logo=openjdk&logoColor=white)](https://openjdk.org/)
[![Maven](https://img.shields.io/badge/Maven-Build_System-C71A36?style=flat-square&logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![REST](https://img.shields.io/badge/REST-API-009688?style=flat-square)](https://restfulapi.net/)
[![Security](https://img.shields.io/badge/Security-Authentication_%26_Authorization-darkgreen?style=flat-square)](#security-architecture)

</p>

The `gameauth` project includes:

- HTTP Basic authentication
- User authentication
- Role-based authorization
- REST controllers
- Application health checks
- User data management
- Maven dependency management
- Application configuration

```Text
Module-4
├── CS 230 Module Four Journal.docx
├── CS230_Project_Software_Design.docx
└── gameauth
    ├── README.md
    ├── config.yml
    ├── pom.xml
    └── src
        └── main
            ├── java
            │   └── com
            │       └── gamingroom
            │           └── gameauth
            └── resources
                └── banner.txt
```
                

[![View Module Four Journal](https://img.shields.io/badge/View-Module_Four_Journal-2B579A?style=for-the-badge&logo=microsoftword&logoColor=white)](./Module-4/CS%20230%20Module%20Four%20Journal.docx)

### Security Lessons

One of the most important lessons from this module was that security should not exist only at the login screen.

Security checks should also exist inside the application so protected features cannot be accessed through an alternate path.

---

## Module 5

Module 5 focused on evaluating operating platforms for The Gaming Room.

Topics included:

- Linux server architecture
- Operating system security
- Operating system protection
- Client-server communication
- Cross-platform support
- Software scalability
- Application compatibility

[![View Project Two](https://img.shields.io/badge/View-Project_Two_PDF-EC1C24?style=for-the-badge&logo=adobeacrobatreader&logoColor=white)](./Module-5/CS230_Project_Software_Design.pdf)

---

# Project Two: Software Design Document

Project Two focused on analyzing the needs of The Gaming Room and evaluating operating platforms for the Draw It or Lose It application.

The software design document discusses:

- Operating platforms
- Operating system architecture
- Client-server architecture
- Memory management
- Storage management
- Distributed systems
- Networking
- Application security
- Scalability
- Platform compatibility

The project helped demonstrate how client requirements influence operating system and software architecture decisions.

[![Project Two Software Design](https://img.shields.io/badge/Project_Two-Software_Design_Document-EC1C24?style=for-the-badge&logo=adobeacrobatreader&logoColor=white)](./Module-5/CS230_Project_Software_Design.pdf)

---

## Module 6: Memory and Storage Management

Module 6 focused on how operating systems manage memory and storage resources.

Topics included:

- Physical memory
- Virtual memory
- Storage requirements
- Persistent storage
- Image storage
- Memory allocation
- Application resource management
- Storage capacity planning

For the Gaming Room scenario, approximately 200 high-definition images at about 8 MB each would require approximately 1.6 GB of storage before accounting for backups, application data, or future growth.

[![View Module 6 Assignment](https://img.shields.io/badge/View-Module_6_Memory_%26_Storage-2B579A?style=for-the-badge&logo=microsoftword&logoColor=white)](./Module-6/CS230_Module6_Memory_Storage_Management_Corrected.docx)

---

## Module 7

Module 7 brought the major concepts from the course together into final software design recommendations for The Gaming Room.

The final recommendations included:

- Linux as the primary server platform
- Java application support
- Browser-based clients
- REST API communication
- SSD and cloud-based storage
- Virtual memory and resource management
- Distributed client-server architecture
- Load balancing
- Monitoring
- HTTPS and TLS
- Authentication
- Role-based authorization
- Least privilege
- Internal application permission checks
- Firewalls
- Software updates
- Backups

As a follow-up to these recommendations, I would also evaluate specific cloud services when designing a production version of the application. Examples include Amazon S3 for image and object storage, Amazon CloudFront for delivering static content closer to users, and AWS Lambda for event-driven or background processing tasks.

[![View Project Three](https://img.shields.io/badge/View-Project_Three-0078D4?style=for-the-badge&logo=microsoftword&logoColor=white)](./Module-7/CS230-Module7-Project_Three-Software_Design_Recommendations.docx)

---

# Project Three: Software Design Recommendations

Project Three contains my final architecture recommendations for Draw It or Lose It.

The project required me to evaluate six major areas:

1. Operating Platform
2. Operating Systems Architectures
3. Storage Management
4. Memory Management
5. Distributed Systems and Networks
6. Security

My recommendation was to use Linux as the primary production server platform while allowing clients using Windows, macOS, Linux, Android, and iOS to communicate with the application through a browser-based REST architecture.

A future cloud-based implementation could extend this architecture by using specific services for different responsibilities. Amazon S3 could provide scalable object storage for game images and other static files. Amazon CloudFront could act as a content delivery network to distribute those files closer to users. AWS Lambda could support serverless event-driven tasks that do not require a continuously running server.

These services would not necessarily replace the Linux application server. Instead, they could be used as part of a hybrid architecture in which the Linux server handles real-time game sessions and application logic while cloud and serverless services handle workloads that are better suited to them.

[![Project Three Software Design Recommendations](https://img.shields.io/badge/Project_Three-Software_Design_Recommendations-0078D4?style=for-the-badge&logo=microsoftword&logoColor=white)](./Module-7/CS230-Module7-Project_Three-Software_Design_Recommendations.docx)

---

# Distributed Application Architecture

The Gaming Room can use a client-server architecture similar to the following:

```text
Windows Client ──────┐
macOS Client ────────┤
Linux Client ────────┤
Android Client ──────┤
iOS Client ──────────┤
                     ▼
                  REST API
                     │
                     ▼
               Linux Server
                     │
          ┌──────────┼──────────┐
          ▼          ▼          ▼
   Authentication   Game    Persistent Data
       Service      Logic
```

This architecture allows multiple client platforms to communicate with the same centralized application server.

A future hybrid cloud architecture could expand the design:

```text
Windows / macOS / Linux / Android / iOS
                     │
                     ▼
                  REST API
                     │
                     ▼
               Linux Server
                     │
        ┌────────────┼────────────┐
        ▼            ▼            ▼
   Game Logic    Database    AWS Lambda
                                  │
                           Event-Driven Tasks

                     │
                     ▼
                 Amazon S3
              Image / Object Storage
                     │
                     ▼
             Amazon CloudFront
             Content Delivery
```

In this example:

- AWS Lambda could perform event-driven tasks such as image processing, notifications, completed-game processing, or scheduled jobs.
- Amazon S3 could store game images, static files, backups, or other objects.
- Amazon CloudFront could distribute images and static content through a content delivery network so users can retrieve them from locations closer to them.

The real-time portion of the game could continue running on the Linux application server because interactive game sessions may require consistent response times. Serverless functions would be better suited for tasks that occur after an event or do not require a continuously running process.

---

# Cloud and Serverless Architecture Examples

One lesson from Module 8 was that it is useful to identify actual technologies instead of discussing cloud computing only in general terms.

The following AWS services are examples of technologies I would evaluate when designing a future cloud-based version of Draw It or Lose It:

| Service | Category | Possible Use |
| --- | --- | --- |
| AWS Lambda | Serverless / Function as a Service | Event-driven processing, notifications, image processing, scheduled jobs, and completed-game processing |
| Amazon S3 | Object Storage | Game images, static files, backups, and other application objects |
| Amazon CloudFront | Content Delivery Network | Distributing images and static content closer to users to improve performance |

These services would be selected based on the application's requirements rather than simply because they are cloud technologies.

For example, AWS Lambda may be useful for workloads that only need to execute when an event occurs. Amazon S3 would be more appropriate for storing objects such as game images than using the main application server's local file system for everything. Amazon CloudFront could then distribute those images more efficiently to users in different locations.

The choice would also need to consider:

- Performance
- Security
- Scalability
- Reliability
- Cost
- Data transfer and egress costs
- Provider dependence
- Monitoring
- Authentication and authorization
- Availability requirements

This reinforces the idea that there is not one correct platform for every part of an application.

---

# What I Learned

One of the biggest lessons I learned in CS 230 was that choosing an operating system affects many other parts of software design.

The server platform can affect:

- Performance
- Memory management
- File storage
- Networking
- Security
- Scalability
- Application compatibility

I also learned how Linux can be used as a server platform for Java applications and how a REST-based client-server design can allow Windows, macOS, Linux, Android, and iOS clients to communicate with the same server.

Another important lesson was security.

Security should be designed into an application from the beginning rather than added after development is complete.

Using several security controls together provides stronger protection than depending on only one security layer.

Module 8 also helped me understand that cloud computing should not be discussed only as one general technology. Different cloud services are designed for different responsibilities. For example, AWS Lambda can provide serverless event-driven processing, Amazon S3 can provide scalable object storage, and Amazon CloudFront can provide content delivery.

I also learned that moving an application to the cloud does not automatically make the application less expensive or remove the need for an operating system. Cloud services still require planning around cost, security, monitoring, permissions, storage, networking, and application design.

---

# Skills Demonstrated

Skills demonstrated throughout the course include:

- Java programming
- Object-oriented programming
- Inheritance
- Encapsulation
- UML class diagrams
- Singleton design pattern
- Maven
- Dropwizard
- REST APIs
- Authentication
- Authorization
- Role-based access control
- Linux server concepts
- Operating system architecture
- Memory management
- Storage management
- Distributed systems
- Networking
- Application security
- Technical documentation
- Software design recommendations
- Git version control
- GitHub repository management
- SSH authentication
- Cloud computing concepts
- Serverless computing concepts
- Cloud object storage concepts
- Content delivery network concepts
- Hybrid cloud architecture

---

# CS 230 Portfolio Reflection

## How did you approach designing software? What techniques or strategies would you use in the future to analyze and design a similar software application?

My approach was to begin with the client's requirements and then break the application into smaller technical areas.

I looked at:

- Class structure
- Operating platform
- Memory management
- Storage management
- Networking
- Distributed systems
- Security
- Scalability

I examined each area separately and then considered how they would work together as one complete application.

I also used object-oriented programming concepts such as inheritance and encapsulation, the Singleton design pattern, UML class diagrams, REST APIs, authentication, and role-based security.

In the future, I would continue using a requirements-first approach. I would begin by identifying the business and user requirements, creating diagrams of the system, determining the responsibilities of each component, evaluating possible platforms, and identifying security and scalability requirements before development begins.

I would also compare traditional servers, cloud services, containers, and serverless technologies to determine which approach is best for each part of an application.

Instead of discussing cloud services only in general terms, I would identify specific technologies and determine what responsibility each service could have. For example, I could evaluate AWS Lambda for event-driven processing, Amazon S3 for object and image storage, and Amazon CloudFront for content delivery.

I would not automatically choose one technology for the entire system. I would consider a hybrid design when it could provide better performance, scalability, security, reliability, or cost control.

For Draw It or Lose It, this could mean using a Linux-based application server for real-time game sessions and REST APIs while using AWS Lambda for selected background tasks, Amazon S3 for image storage, and Amazon CloudFront for distributing static content.

---

## Final Reflection

CS 230 changed the way I think about software development.

Before this course, I mainly focused on whether the code worked. I now understand that application development also involves operating systems, memory, storage, networking, security, scalability, and the environment where the application will run.

The Gaming Room project helped me understand how software requirements can be translated into a complete system architecture. It also showed me that there is not always one correct technology for every situation.

Traditional operating systems, cloud platforms, containers, and serverless computing all have strengths and limitations. I learned that good software design means selecting technologies based on the needs of each part of the application.

I also learned that it is important to name and evaluate specific technologies instead of discussing cloud computing only in general terms. For example, AWS Lambda could be used for event-driven serverless processing, Amazon S3 could provide scalable object storage, and Amazon CloudFront could distribute static content to users.

These services could work alongside a traditional Linux application server rather than replacing it completely. A hybrid architecture could allow the Linux server to handle real-time game logic while cloud services handle storage, content delivery, and selected event-driven workloads.

I also learned that moving an application to the cloud does not automatically make it cheaper or remove the need for security, monitoring, or good software design. Developers must still consider authentication, authorization, data protection, permissions, networking, cost, and application performance.

Going forward, I will use what I learned in CS 230 to think about software as a complete system instead of focusing only on the source code. I will also consider specific technologies, performance, security, scalability, reliability, cost, and the needs of the user when deciding which architecture is the best fit for an application.

---

<p align="center">

CS 230 - Operating Platforms

Computer Programming Portfolio

[![GitHub Repository](https://img.shields.io/badge/View-CS230--Program_on_GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/rpratts1/CS230-Program)

</p>
