package javabook.chapter03.exercise3_13.domain;

public class Employee {
    private String nameEmployee;
    private String surenameEmployee;
    private double salaryEmployee;

    public Employee(String nameEmployee, String surenameEmployee, double salaryEmployee) {
        this.nameEmployee = nameEmployee;
        this.surenameEmployee = surenameEmployee;
        this.salaryEmployee = salaryEmployee;
    }

    public void increase() {
        if (salaryEmployee < 0) {
            System.out.println("Invalid number!");
        }
        System.out.println("Anual Salary: " + getSalaryEmployee() + "\nNew salary: " + (salaryEmployee += salaryEmployee * 0.1));
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getSurenameEmployee() {
        return surenameEmployee;
    }

    public void setSurenameEmployee(String surenameEmployee) {
        this.surenameEmployee = surenameEmployee;
    }

    public double getSalaryEmployee() {
        return salaryEmployee;
    }

    public void setSalaryEmployee(double salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }
}
