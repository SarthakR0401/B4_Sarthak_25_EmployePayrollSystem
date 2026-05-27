package org.microservice.employee.service;

import org.microservice.employee.entity.Employee;
import org.microservice.employee.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo repo;

    public Employee save(Employee employee){

        return repo.save(employee);

    }

    public Employee getEmployee(int id){

        return repo.findById(id)
                .orElse(null);

    }
}