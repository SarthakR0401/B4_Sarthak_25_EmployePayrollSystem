package com.microservice.payslip;


import com.microservice.payslip.Payslip;
import com.microservice.payslip.PayslipService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/payslip")

@CrossOrigin("*")

public class PayslipController {

    @Autowired

    PayslipService service;

    @GetMapping("/{id}")

    public Payslip get(

            @PathVariable int id){

        return service.generate(id);

    }

}
