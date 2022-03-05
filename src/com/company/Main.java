package com.company;

public class Main {

    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees = new Employee[]{
                new Employee("Блок Александр Александрович", 1, 30000),
                new Employee("Маяковский Владимир Владимирович", 3, 20000),
                new Employee("Есенин Сергей Александрович", 4, 50000),
                new Employee("Цветаева Марина Ивановна", 2, 40000),
                new Employee("Мандельштам Осип Эмильевич", 3, 30000),
                new Employee("Ахматова Анна Андреевна", 5, 50000),
                new Employee("Пастернак Борис Леонидович", 2, 20000),
                new Employee("Гиппиус Зинаида Николаевна", 4, 30000),
                new Employee("Парнок София Яковлевна", 5, 40000),
                new Employee("Инбер Вера Михайловна", 1, 40000)
        };

        printNames();
        printEmployees();
        minimalPay();
        System.out.println("Минимальная заработная плата сотрудника = " + minimalPay());
        maximumPay();
        System.out.println("Максимальная заработная плата сотрудника = " + maximumPay());
        totalPay();
        System.out.println(totalPay());
        averageSalary();
        System.out.println(averageSalary());
    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int totalPay() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee minimalPay() {
        Employee employeeMinPay = employees[0];
        int min = employeeMinPay.getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                employeeMinPay = employees[i];
            }
        }
        return employeeMinPay;
    }

    public static Employee maximumPay() {
        Employee employeeMaxPay = employees[0];
        int max = employeeMaxPay.getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                employeeMaxPay = employees[i];
            }
        }
        return employeeMaxPay;
    }

    public static float averageSalary() {
        return totalPay() / (float) employees.length;
    }

    public static void printNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullname());
        }
    }
    }
