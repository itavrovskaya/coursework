package com.company;

public class Employee {

    public static int id = 0;

    private final String fullname;
    private int department;
    private int salary;

    public Employee(String fullname, int department, int salary) {
        this.fullname = fullname;
        this.department = department;
        this.salary = salary;
    }


    public String getFullname() {
        return fullname;}

    public int getDepartment() {
        return department;}

    public int getSalary() {
        return salary;}

    public static int getId() {
        return id;}

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public String toString(){
        return id++ + ": " + fullname + ", " + department + ", " + salary;}
}


