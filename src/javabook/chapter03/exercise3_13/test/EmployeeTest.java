package javabook.chapter03.exercise3_13.test;

import javabook.chapter03.exercise3_13.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Maria", "Jolie", 2000);
        Employee employee2 = new Employee("Jorje", "Lopez", 1000);

        employee1.increase();
        employee2.increase();
    }

}
