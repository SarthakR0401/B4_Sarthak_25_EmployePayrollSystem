package com.microservice.payslip;

import com.microservice.payslip.dto.*;
import com.microservice.payslip.Payslip;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

@Service

public class PayslipService {

    @Autowired

    RestTemplate restTemplate;

    public Payslip generate(int id){

        EmployeeDTO employee=

                restTemplate.getForObject(

                        "http://localhost:8081/employee/"+id,

                        EmployeeDTO.class);

        AttendanceDTO attendance=

                restTemplate.getForObject(

                        "http://localhost:8082/attendance/"+id,

                        AttendanceDTO.class);

        double salary=

                (employee.getBasicSalary()/30)

                        *attendance.getDaysPresent();

        Payslip payslip=new Payslip();

        payslip.setEmpId(id);

        payslip.setEmployeeName(

                employee.getName());

        payslip.setDaysPresent(

                attendance.getDaysPresent());

        payslip.setSalary(salary);

        return payslip;

    }

}
