package com.microservice.attendance;


import com.microservice.attendance.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepo
        extends JpaRepository<Attendance,Integer> {

}