Content Management System (Software Project)

Includes full system design (requirements & UML diagrams) and implementation.
All requirements, UML diagrams, and design artifacts are included in a single Word document:
docs/Software Project Document.docx — making it easy to understand the system design before running the code.

Overview
This project is a Content Management System (CMS) implemented in Java, designed to demonstrate Object-Oriented Programming principles and software design patterns.

It allows administrators to manage content categories and content items, while showcasing Singleton, Proxy, and Observer patterns for:
Modular system design
Access control
Event-driven notifications

Key Features
Admin Management: Handle content and category operations
Category & Content Management: Add, update, and organize categories and content items
Design Patterns:
Singleton: Ensures a single instance for key managers
Proxy: Controls access to category management operations
Observer: Notifies dependent objects of updates in content or categories
Modular & Scalable: Easily extendable and maintainable system

Class Structure
Admin – Represents the system administrator
Category – Models content categories
CategoryManager – Handles operations for categories
CategoryManagerProxy – Proxy controlling access to CategoryManager
ContentItem – Represents individual content items
Observer – Implements Observer pattern for notifications
ProxyInterface – Interface implemented by CategoryManagerProxy
MainApp – Entry point of the application; initializes and runs the system

How to Run
Clone the repository:
git clone https://github.com/Sherif453/Complete-Content-Management-System_DesignAndCode.git
Open the project in your preferred Java IDE (IntelliJ, Eclipse, NetBeans)
Navigate to src/main/java/... and run MainApp.java
Follow prompts or observe outputs for content and category management
