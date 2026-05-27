package com.microservice.payslip;

public class Payslip {

    private int empId;

    private String employeeName;

    private int daysPresent;

    private double salary;

    public int getEmpId() {

        return empId;

    }

    public void setEmpId(int empId) {

        this.empId=empId;

    }

    public String getEmployeeName() {

        return employeeName;

    }

    public void setEmployeeName(
            String employeeName){

        this.employeeName=employeeName;

    }

    public int getDaysPresent(){

        return daysPresent;

    }

    public void setDaysPresent(
            int daysPresent){

        this.daysPresent=daysPresent;

    }

    public double getSalary(){

        return salary;

    }

    public void setSalary(double salary){

        this.salary=salary;

    }

}
