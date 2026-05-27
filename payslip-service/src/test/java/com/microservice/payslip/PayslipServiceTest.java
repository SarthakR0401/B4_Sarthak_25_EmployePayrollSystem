package com.microservice.payslip;

import org.junit.jupiter.api.Test;
import org.mockito.*;
import com.microservice.payslip.dto.*;
import com.microservice.payslip.Payslip;
import com.microservice.payslip.PayslipService;

import org.springframework.web.client.RestTemplate;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class PayslipServiceTest {

    @Mock
    RestTemplate restTemplate;

    @InjectMocks
    PayslipService service;

    public PayslipServiceTest(){

        MockitoAnnotations.openMocks(this);

    }

    @Test

    void testGenerate(){

        EmployeeDTO e=
                new EmployeeDTO();

        e.setEmpId(1);

        e.setName("Sarthak");

        e.setBasicSalary(30000);

        AttendanceDTO a=
                new AttendanceDTO();

        a.setDaysPresent(25);

        when(

                restTemplate.getForObject(

                        "http://localhost:8081/employee/1",

                        EmployeeDTO.class))

                .thenReturn(e);

        when(

                restTemplate.getForObject(

                        "http://localhost:8082/attendance/1",

                        AttendanceDTO.class))

                .thenReturn(a);

        Payslip p=
                service.generate(1);

        assertEquals(

                25000,

                p.getSalary());

    }

}
