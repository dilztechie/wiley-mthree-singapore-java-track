package com.company;

public class EmployeeExercise {
    //Members of the Class
    private int id, age;
    private String name, designation;
    private double salary;

    EmployeeExercise(int id, int age, String name, String designation, double salary) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    double houseRentAllowance() {
        return 0.4 * this.salary;
    }

    double dearnessAllowance() {
        return 0.2 * this.salary;
    }

    double travellingAllowance() {
        return 0.1 * this.salary;
    }

    void displaySalarySlip() {
        System.out.println("Employee [id: " + id +
                ", age: " + age +
                ", name: " + name +
                ", designation: " + designation +
                ", salary: " + salary +
                ", house rent allowance: " + houseRentAllowance() +
                ", dearness allowance: " + dearnessAllowance() +
                ", travelling allowance: " + travellingAllowance());
    }

}
