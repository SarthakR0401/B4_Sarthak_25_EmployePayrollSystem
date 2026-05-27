package com.microservice.payslip.dto;

public class AttendanceDTO {

    private int empId;

    private int daysPresent;

    public int getEmpId() {

        return empId;

    }

    public void setEmpId(int empId) {

        this.empId=empId;

    }

    public int getDaysPresent() {

        return daysPresent;

    }

    public void setDaysPresent(int daysPresent) {

        this.daysPresent=daysPresent;

    }

}
