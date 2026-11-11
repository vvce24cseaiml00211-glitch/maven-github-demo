
package com.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("    EMPLOYEE SALARY CALCULATOR");
        System.out.println("================================");

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        // Calculate allowances
        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;

        // Calculate deduction
        double pf = basicSalary * 0.12;

        // Calculate gross and net salary
        double grossSalary = basicSalary + hra + da;
        double netSalary = grossSalary - pf;

        // Display employee salary details
        System.out.println("\n========== SALARY DETAILS ==========");

        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + id);

        System.out.printf("Basic Salary  : Rs. %.2f%n", basicSalary);
        System.out.printf("HRA (20%%)     : Rs. %.2f%n", hra);
        System.out.printf("DA (10%%)      : Rs. %.2f%n", da);
        System.out.printf("PF (12%%)      : Rs. %.2f%n", pf);

        System.out.println("------------------------------------");

        System.out.printf("Gross Salary  : Rs. %.2f%n", grossSalary);
        System.out.printf("Net Salary    : Rs. %.2f%n", netSalary);

        System.out.println("====================================");

        sc.close();
    }
}
