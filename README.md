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
                └── resources

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

[![Project Three Software Design Recommendations](https://img.shields.io/badge/Project_Three-Software_Design_Recommendations-0078D4?style=for-the-badge&logo=microsoftword&logoColor=white)](./Module-7/CS230-Module7-Project_Three-Software_Design_Recommendations.docx)

---

# Security Architecture

One of the most important lessons from CS 230 was that security should be designed into an application from the beginning.

Security should not exist only at the login screen or network boundary.

The application should also perform internal authorization and permission checks when users attempt to access protected functionality.

A layered security model can include:

    User
      │
      ▼
    Authentication
      │
      ▼
    Authorization
      │
      ▼
    Role-Based Access Control
      │
      ▼
    Internal Permission Checks
      │
      ▼
    Application Resources
      │
      ▼
    Encrypted Communication
      │
      ▼
    Monitoring + Backups + Updates

This defense-in-depth approach provides stronger protection than depending on a single security control.

Important security concepts covered during the course included:

- Authentication
- Authorization
- Role-based access control
- Least privilege
- HTTPS
- TLS
- Internal permission checks
- Firewalls
- Software updates
- Monitoring
- Backups

---

# Distributed Application Architecture

The Gaming Room can use a client-server architecture similar to the following:

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
        Authentication  Game     Data Storage
            Service     Logic

This architecture allows multiple client platforms to communicate with the same centralized application server.

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

---

# Skills Demonstrated

<p align="center">

![Java](https://img.shields.io/badge/Java-Programming-437291?style=flat-square&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/Object--Oriented-Programming-blue?style=flat-square)
![UML](https://img.shields.io/badge/UML-Class_Diagrams-orange?style=flat-square)
![REST](https://img.shields.io/badge/REST-APIs-009688?style=flat-square)
![Maven](https://img.shields.io/badge/Maven-Build_Tools-C71A36?style=flat-square&logo=apachemaven&logoColor=white)
![Linux](https://img.shields.io/badge/Linux-Server-FCC624?style=flat-square&logo=linux&logoColor=black)
![Git](https://img.shields.io/badge/Git-Version_Control-F05032?style=flat-square&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-Portfolio-181717?style=flat-square&logo=github&logoColor=white)
![SSH](https://img.shields.io/badge/SSH-Secure_Authentication-4D4D4D?style=flat-square)

</p>

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

---

# Development Tools

## Java

[![Java](https://img.shields.io/badge/OpenJDK-Java-437291?style=for-the-badge&logo=openjdk&logoColor=white)](https://openjdk.org/)

Java was used throughout the course for object-oriented programming, application development, REST services, and software design exercises.

---

## Eclipse IDE

[![Eclipse](https://img.shields.io/badge/Eclipse-IDE-2C2255?style=for-the-badge&logo=eclipseide&logoColor=white)](https://www.eclipse.org/ide/)

Eclipse was used to create, edit, run, test, and debug Java projects.

---

## Apache Maven

[![Maven](https://img.shields.io/badge/Apache-Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)](https://maven.apache.org/)

Maven was used in the Module 4 `gameauth` project to manage dependencies and build the Java application.

---

## Git

[![Git](https://img.shields.io/badge/Git-Version_Control-F05032?style=for-the-badge&logo=git&logoColor=white)](https://git-scm.com/)

Git is used to track changes throughout this repository.

---

## GitHub

[![GitHub](https://img.shields.io/badge/GitHub-CS230--Program-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/rpratts1/CS230-Program)

GitHub is used to maintain the CS 230 portfolio and preserve the development history of the coursework.

---

## Visual Studio Code

[![VS Code](https://img.shields.io/badge/Visual_Studio_Code-007ACC?style=for-the-badge&logo=visualstudiocode&logoColor=white)](https://code.visualstudio.com/)

Visual Studio Code is used for Git repository management, Markdown editing, file organization, and source code review.

---

## Microsoft Word

[![Microsoft Word](https://img.shields.io/badge/Microsoft-Word-2B579A?style=for-the-badge&logo=microsoftword&logoColor=white)](https://www.microsoft.com/microsoft-365/word)

Microsoft Word was used to prepare software design documents, journal assignments, and technical recommendations.

---

## Linux

[![Linux](https://img.shields.io/badge/Linux-Server-FCC624?style=for-the-badge&logo=linux&logoColor=black)](https://www.linux.org/)

Linux was evaluated as the recommended production server platform for The Gaming Room application.

---

## macOS

[![macOS](https://img.shields.io/badge/macOS-Development-000000?style=for-the-badge&logo=apple&logoColor=white)](https://www.apple.com/macos/)

macOS was used as one of my primary development environments for Git, GitHub, Java, Eclipse, Visual Studio Code, and SSH.

---

## SSH

[![OpenSSH](https://img.shields.io/badge/OpenSSH-Secure_Authentication-4D4D4D?style=for-the-badge)](https://www.openssh.com/)

SSH authentication is used to securely connect this development environment to GitHub without entering a GitHub password for every push.

---

# Git and GitHub Workflow

This repository uses Git for local version control and GitHub for remote repository hosting.

A typical workflow used during this portfolio setup was:

    git status
    git add .
    git commit -m "Commit message"
    git push

The repository uses SSH authentication with GitHub.

Example GitHub SSH remote:

    git@github.com:rpratts1/CS230-Program.git

---

# Reflection

CS 230 helped me better understand how software development, operating systems, networking, storage, and security work together.

Before this course, I mainly thought about whether an application could run successfully. I now understand that good software design must also consider how an application will scale, how data will be stored, how memory will be managed, how users will connect, and how the system will remain secure.

The Gaming Room projects gave me experience analyzing client requirements and turning those requirements into technical software design recommendations.

I also gained more experience using Java, Eclipse, Maven, REST APIs, Git, GitHub, SSH, Linux concepts, object-oriented programming, distributed systems, and application security practices that I can apply to future software development and IT projects.

---

<p align="center">

CS 230 - Operating Platforms

Computer Programming Portfolio

[![GitHub Repository](https://img.shields.io/badge/View-CS230--Program_on_GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/rpratts1/CS230-Program)

</p>