package com.company;

import java.util.Arrays;

import static com.company.Employee.id;

public class Main {

    public static void main(String[] args) {
        Employee one = new Employee("Блок Александр Александрович", 1, 30000);
        Employee two = new Employee("Маяковский Владимир Владимирович", 3, 20000);
        Employee three = new Employee("Есенин Сергей Александрович", 4, 50000);
        Employee four = new Employee("Цветаева Марина Ивановна", 2, 40000);
        Employee five = new Employee("Мандельштам Осип Эмильевич", 3, 30000);
        Employee six = new Employee("Ахматова Анна Андреевна", 5, 50000);
        Employee seven = new Employee("Пастернак Борис Леонидович", 2, 20000);
        Employee eight = new Employee("Гиппиус Зинаида Николаевна", 4, 30000);
        Employee nine = new Employee("Парнок София Яковлевна", 5, 40000);
        Employee ten = new Employee("Инбер Вера Михайловна", 1, 40000);
        System.out.println(one);
        System.out.println(id);


        Employee[] employeeArray = new Employee[10];
        employeeArray[0] = one;
        employeeArray[1] = two;
        employeeArray[2] = three;
        employeeArray[3] = four;
        employeeArray[4] = five;
        employeeArray[5] = six;
        employeeArray[6] = seven;
        employeeArray[7] = eight;
        employeeArray[8] = nine;
        employeeArray[9] = ten;
        System.out.println(Arrays.toString(employeeArray));

    }
}
