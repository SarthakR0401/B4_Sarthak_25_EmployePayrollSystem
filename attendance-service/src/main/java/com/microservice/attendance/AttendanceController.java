package com.microservice.attendance;

import com.microservice.attendance.Attendance;
import com.microservice.attendance.AttendanceService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/attendance")

@CrossOrigin("*")

public class AttendanceController {

    @Autowired

    AttendanceService service;

    @PostMapping

    public Attendance add(

            @RequestBody Attendance attendance){

        return service.save(attendance);

    }

    @GetMapping("/{id}")

    public Attendance get(

            @PathVariable int id){

        return service.getAttendance(id);

    }
}