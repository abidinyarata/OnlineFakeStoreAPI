# OnlineFakeStoreAPI – RestAssured Hybrid API Test Framework

A Java-based **API test automation framework** built with **RestAssured + TestNG** to validate the **Fake Store / Online Fake Store API** endpoints.  
The framework follows a clean hybrid design with reusable core components, POJOs, data-driven tests, logging, and rich reporting.

---

## Table of Contents
- [Project Overview](#project-overview)
- [Tech Stack](#tech-stack)
- [Framework Highlights](#framework-highlights)
- [Project Structure](#project-structure)
- [Setup & Installation](#setup--installation)
- [Configuration](#configuration)
- [Running Tests](#running-tests)
- [Reports](#reports)
- [Logging](#logging)
- [Parallel Execution](#parallel-execution)
- [Re-run Failed Tests](#re-run-failed-tests)
- [Test Data](#test-data)

---

## Project Overview
This repository contains automated REST API tests for an online fake store service.  
It validates key resources such as:
- **Products**
- **Carts**
- **Users**
- **Login/Auth flows**

The framework is designed to be:
- **Readable**
- **Modular**
- **Scalable**
- **Easy to maintain and extend**

---

## Tech Stack
- **Java**
- **Maven**
- **RestAssured**
- **TestNG**
- **Jackson / Gson for JSON mapping**
- **Allure Report**
- **Extent Report**
- **JavaFaker** for dynamic test data

(Dependencies are managed via `pom.xml`.)

---

## Framework Highlights
- **Routes / Endpoints Layer**  
  Centralized endpoint management in a `Routes` class.

- **POJO Modeling**  
  Request/response bodies handled via POJO classes:
  `Product`, `Cart`, `User`, `Login`.

- **Payload Factory**  
  Dynamic payload generation in `Payload.java`.

- **Base Test Class**  
  Common setup + reusable helpers, including request/response logging.

- **Data-Driven Testing**  
  TestNG DataProviders + JSON test data files.

- **Reporting**  
  - **ExtentReports**
  - **Allure Reports**

- **Parallel Execution**  
  Enabled through TestNG suite configuration.

- **Rerun Failed Tests**  
  Uses TestNG `testng-failed.xml` output.

---

## Project Structure
A simplified view of the repository:

  OnlineFakeStoreAPI<br> 
│<br> 
├─ src/test/ # Test classes & framework core<br> 
├─ testdata/ # JSON test data (Product, Cart, User, etc.)<br> 
├─ logs/ # Request/response logs<br> 
├─ allure-results/ # Allure raw results<br> 
├─ test-output/ # TestNG output<br> 
├─ target/ # Maven build directory<br> 
│<br> 
├─ testng.xml # Main TestNG suite<br> 
├─ parallelTesting.xml # Parallel suite configuration<br> 
├─ final.xml # Final/complete suite (if used)<br> 
└─ pom.xml # Maven dependencies<br> 

---

## Setup & Installation

### 1) Clone the repository

```
git clone https://github.com/abidinyarata/OnlineFakeStoreAPI.git
cd OnlineFakeStoreAPI
```

### 2) Install dependencies

```
mvn clean install
```

---

## Configuration

Framework configuration is stored in a config.properties file and read via a utility class.
Typical config values include:

* Base URL
* Environment flags
* Auth credentials (if needed)

Update config.properties before running tests.

---

### Running Tests
### Run all tests (default suite)

```
mvn clean test
```

### Run TestNG suite directly

```
mvn clean test -DsuiteXmlFile=testng.xml
```

---

### Reports
### Allure Report
1. Run tests to generate results:

```
mvn clean test
```

### Serve Allure report:
2. Serve Allure report:
```
allure serve allure-results
```
### Extent Report

Extent reports are generated automatically after test completion.
Check the report output folder (usually inside test-output/ or a configured reports directory).

---

### Logging

Request/Response logs are captured via RestAssured filters in the BaseClass and saved to:

```
logs/test_logging.txt
```

This makes debugging API failures much easier.

---

### Parallel Execution

To run tests in parallel, use the parallel suite:
```
mvn clean test -DsuiteXmlFile=parallelTesting.xml
```

Parallel execution is controlled via TestNG settings such as:
```
<suite parallel="tests" thread-count="X">
```

---

### Re-run Failed Tests

After a run, TestNG produces a failed suite file.

Run only failed tests:
```
mvn clean test -DsuiteXmlFile=test-output/testng-failed.xml
```

---

### Test Data

All data-driven tests load JSON files from:
```
testdata/
```

Examples:

* Product.json
* Cart.json
* User.json

You can expand these files to add more scenarios without changing code.
