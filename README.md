Overview

This project is a Content Management System (CMS) implemented in Java, designed to demonstrate Object-Oriented Programming principles and key software design patterns.

It allows administrators to manage content categories and content items, and demonstrates:

Singleton (single instance managers)

Proxy (access control for category operations)

Observer (notifications when content or categories change)

Key Features

Admin Management: Handle content and category operations

Category & Content Management: Add, update, and organize content items

Design Patterns Used:

Singleton – Ensures a single instance for managers

Proxy – Controls access to category management

Observer – Notifies dependent objects of updates

Modular & Scalable: Easily extendable and maintainable system

Class Structure

Admin – Represents the system administrator

Category – Models content categories

CategoryManager – Handles category operations

CategoryManagerProxy – Proxy controlling access

ContentItem – Represents individual content items

Observer – Implements Observer pattern

ProxyInterface – Interface used by the proxy

MainApp – Application entry point

How to Run

Clone the repository:

git clone https://github.com/Sherif453/Complete-Content-Management-System_DesignAndCode.git


Open the project in your preferred Java IDE (IntelliJ, Eclipse, NetBeans).

Navigate to src/main/java/... and run MainApp.java.

Follow the on-screen prompts.
