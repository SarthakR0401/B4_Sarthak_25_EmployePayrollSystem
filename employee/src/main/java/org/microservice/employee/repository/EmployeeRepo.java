package org.microservice.employee.repository;

import org.microservice.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo
        extends JpaRepository<Employee,Integer> {

}