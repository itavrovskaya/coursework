package com.company;

import java.util.Objects;

public class Employee {

    public int id;
    private static int counter = 0;
    private final String fullname;
    private int department;
    private int salary;

    public Employee(String fullname, int department, int salary) {
        this.fullname = fullname;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }


    public String getFullname() {
        return fullname;}

    public int getDepartment() {
        return department;}

    public int getSalary() {
        return salary;}

    public int getId() {
        return id;}

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public String toString(){
        return "id: " + id + " ФИО: " + fullname + ", отдел: " + department + ", зарплата: " + salary + ";";}


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && department == employee.department && salary == employee.salary && Objects.equals(fullname, employee.fullname);
    }

    public int hashCode() {
        return Objects.hash(id, fullname, department, salary);
    }
}


