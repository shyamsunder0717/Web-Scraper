# WebScraper Project

## Introduction
The WebScraper project is a Java-based application that extracts and parses data from websites using the **Jsoup** library. Jsoup is a powerful and flexible library for working with HTML, allowing developers to extract and manipulate data efficiently.

This README provides step-by-step instructions for setting up and running the WebScraper project, along with additional tips to simplify the workflow.

---

## Key Features
- Fetches and parses HTML content from web pages.
- Extracts specific elements or data from the DOM.
- Supports dynamic workflows using batch files or IDE integration.

---

## Step-by-Step Guide to Using Jsoup

### **1. Download the Jsoup Library**
If you're not using a dependency manager like Maven or Gradle, download the Jsoup JAR file manually from the official Jsoup website:

**[Jsoup Download Page](https://jsoup.org/download)**

---

### **2. Place the Jsoup JAR**
Save the `jsoup-<version>.jar` file (e.g., `jsoup-1.18.3.jar`) in a directory. For simplicity, place it in the same folder as your `WebScraper.java` file.

---

### **3. Compile with Classpath**
To compile the Java program with the Jsoup library, include the JAR in the classpath. Open a terminal or command prompt, navigate to your project directory, and run:

#### **Code (Run on Terminal):**
```bash
javac -cp jsoup-1.18.3.jar WebScraper.java
```

### 4. Run with Classpath
After successful compilation, execute the program while including the Jsoup JAR in the classpath.

#### **Code (Run on Terminal):**
```bash
java -cp .;jsoup-1.18.3.jar WebScraper
```
## Note: On Unix-based systems (macOS or Linux), replace the semicolon (;) with a colon (:):
```bash
java -cp .:jsoup-1.18.3.jar WebScraper
```
## For Convenience: Automate the Process
If you frequently need to compile and run the program, automate the process using a batch file or an IDE.

## Create a Batch File (Windows)
1. Create a new file named run.bat in the same directory as your Java code.
2. Add the following lines:
### Code (run.bat):
```bash
@echo off
javac -cp jsoup-1.18.3.jar WebScraper.java
java -cp .;jsoup-1.18.3.jar WebScraper
```
3. Save the file. Double-click run.bat to compile and run your program automatically.

## Or Use an IDE
Modern Integrated Development Environments (IDEs) simplify managing dependencies like Jsoup. Here’s how:

### Steps for IDE Setup
1. **IntelliJ IDEA / Eclipse / VS Code:**
   - Import your Java project.
   - Add the `jsoup-<version>.jar` file to the project as a library or external dependency.

### Run the Program:
- Use the IDE's build and run commands, which will automatically handle the classpath configuration.

---

## Notes
- Ensure you download the appropriate version of Jsoup for your project.
- Test your scraper thoroughly as websites often change their structure.
- Follow ethical guidelines and respect website terms of service when scraping data.

---

## License
This project is licensed under the MIT License. For more details, refer to the LICENSE file in the repository.

---

## Contributions
Feel free to contribute to the WebScraper project! Fork the repository, make changes, and submit a pull request.

---

### Repository Link:
[GitHub Repository](https://github.com/shyamsunder0717/Web-Scraper.git)
