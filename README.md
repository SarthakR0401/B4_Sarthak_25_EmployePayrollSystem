# Employee Payroll Microservices System

A Microservices-based Employee Payroll Application developed using Spring Boot. The system calculates employee monthly salary based on attendance and demonstrates service orchestration between multiple microservices.

## Project Overview

This project consists of three independent microservices:

### 1. Employee Service
Maintains employee information.

Stores:
- Employee ID
- Employee Name
- Basic Salary
- Department

Runs on:

```
http://localhost:8081
```

---

### 2. Attendance Service

Maintains employee attendance details.

Stores:

- Employee ID
- Days Present

Runs on:

```
http://localhost:8082
```

---

### 3. Payslip Service (Orchestration Service)

Acts as the orchestration layer.

Responsibilities:

- Calls Employee Service
- Calls Attendance Service
- Retrieves employee details
- Retrieves attendance details
- Calculates monthly salary
- Returns final payslip response

Salary Formula:

```text
Per Day Salary = Basic Salary / 30

Monthly Salary =
Per Day Salary × Days Present
```

Runs on:

```
http://localhost:8083
```

---

## System Architecture

```
Frontend
   |
   v
Payslip Service (Orchestrator)
   |
-------------------------------
|                             |
v                             v
Employee Service      Attendance Service
   |                             |
Employee Data         Attendance Data
         |
         v
 Salary Calculation
         |
         v
 Final Payslip Response
```

---

## Technologies Used

### Backend

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- REST API
- MySQL

### Frontend

- HTML
- CSS
- JavaScript

### Testing

- JUnit
- Mockito

### Build Tool

- Maven

---

## Project Structure

```
attendance-service/
employee/
payslip-service/
frontend/
```

### Employee Service

```
controller/
entity/
repository/
service/
```

### Attendance Service

```
controller/
entity/
repository/
service/
```

### Payslip Service

```
config/
controller/
dto/
model/
service/
```

---

## API Endpoints

### Employee Service

Add Employee

```
POST /employee
```

Get Employee

```
GET /employee/{id}
```

Example:

```
http://localhost:8081/employee/1
```

---

### Attendance Service

Add Attendance

```
POST /attendance
```

Get Attendance

```
GET /attendance/{id}
```

Example:

```
http://localhost:8082/attendance/1
```

---

### Payslip Service

Generate Payslip

```
GET /payslip/{id}
```

Example:

```
http://localhost:8083/payslip/1
```

Response:

```json
{
  "empId": 1,
  "employeeName": "Sarthak",
  "daysPresent": 25,
  "salary": 25000
}
```

---

## Database Setup

Create databases:

```sql
CREATE DATABASE employee_db;

CREATE DATABASE attendance_db;
```

Employee Table:

```sql
CREATE TABLE employee(
emp_id INT PRIMARY KEY,
name VARCHAR(50),
basic_salary DOUBLE,
department VARCHAR(50)
);
```

Attendance Table:

```sql
CREATE TABLE attendance(
emp_id INT PRIMARY KEY,
days_present INT
);
```

Sample Data:

```sql
INSERT INTO employee
VALUES(1,'Sarthak',30000,'IT');

INSERT INTO attendance
VALUES(1,25);
```

---

## Running the Project

### Step 1

Start Employee Service

```
EmployeeApplication
```

---

### Step 2

Start Attendance Service

```
AttendanceServiceApplication
```

---

### Step 3

Start Payslip Service

```
PayslipServiceApplication
```

---

### Step 4

Open frontend:

```
index.html
```

Enter Employee ID.

Click:

```
Generate
```

Output:

```
Name : Sarthak

Days Present : 25

Salary : 25000
```

---

## Unit Testing

Implemented unit testing using:

- JUnit
- Mockito

Test Coverage:

- Salary calculation
- Employee dependency mocking
- Attendance dependency mocking
- Payslip generation validation

---

## Orchestration Logic

The orchestration is implemented inside:

```
PayslipService.java
```

It coordinates:

```
Employee Service
+
Attendance Service
=
Final Payslip
```

---

## Future Enhancements

- API Gateway
- Service Discovery (Eureka)
- Docker Containerization
- JWT Authentication
- Kubernetes Deployment
- CI/CD Pipeline

---

## Author

Sarthak Rathi

B.Tech Data Science

Microservices Architecture Project
