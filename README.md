# Content Management System (CMS)

## Overview
This project is a Content Management System (CMS) built in Java to demonstrate core OOP concepts and software design patterns.  
It allows administrators to manage categories and content items while implementing:

- **Singleton** (single instance managers)  
- **Proxy** (access control for category operations)  
- **Observer** (automatic notifications when data changes)

## Key Features
- **Admin Management:** Perform content and category operations  
- **Category & Content Handling:** Add, update, and organize content items  
- **Design Patterns Used:**  
  - Singleton – Ensures one instance of key managers  
  - Proxy – Restricts access to sensitive category operations  
  - Observer – Updates dependent components automatically  
- **Modular & Scalable:** Easy to extend and maintain

## Class Structure
- `Admin` – System administrator logic  
- `Category` – Represents content categories  
- `CategoryManager` – Handles category operations  
- `CategoryManagerProxy` – Proxy enforcing access control  
- `ContentItem` – Individual content items  
- `Observer` – Observer pattern interface  
- `ProxyInterface` – Proxy communication interface  
- `Singleton` – Ensures single instance behavior  
- `MainApp` – Application entry point

## How to Run
1. Clone the repository: https://github.com/Sherif453/Complete-Content-Management-System_DesignAndCode.git
2. Open the project in IntelliJ, Eclipse, or NetBeans
3. Navigate to src/main/java/...
4. Run MainApp.java and follow the on-screen prompts
   



   
