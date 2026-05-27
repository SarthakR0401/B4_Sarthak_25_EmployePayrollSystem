package org.microservice.employee.controller;

import org.microservice.employee.entity.Employee;
import org.microservice.employee.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/employee")

@CrossOrigin("*")

public class EmployeeController {

    @Autowired
    EmployeeService service;

    @PostMapping

    public Employee addEmployee(

            @RequestBody Employee employee){

        return service.save(employee);

    }

    @GetMapping("/{id}")

    public Employee getEmployee(

            @PathVariable int id){

        return service.getEmployee(id);

    }
}