package com.microservice.attendance;

import com.microservice.attendance.Attendance;
import com.microservice.attendance.AttendanceRepo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service

public class AttendanceService {

    @Autowired

    AttendanceRepo repo;

    public Attendance save(

            Attendance attendance){

        return repo.save(attendance);

    }

    public Attendance getAttendance(

            int id){

        return repo.findById(id)
                .orElse(null);

    }

}
