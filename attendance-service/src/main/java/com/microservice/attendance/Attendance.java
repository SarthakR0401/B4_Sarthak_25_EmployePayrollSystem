package com.microservice.attendance;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Attendance {

    @Id

    private int empId;

    private int daysPresent;

    public Attendance() {
    }

    public Attendance(int empId,
                      int daysPresent) {

        this.empId = empId;
        this.daysPresent = daysPresent;

    }

    public int getEmpId() {

        return empId;

    }

    public void setEmpId(int empId) {

        this.empId = empId;

    }

    public int getDaysPresent() {

        return daysPresent;

    }

    public void setDaysPresent(int daysPresent) {

        this.daysPresent = daysPresent;

    }
}