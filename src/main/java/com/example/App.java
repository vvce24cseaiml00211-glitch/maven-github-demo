
package com.example;

public class App {

    public static double calculateHRA(double basicSalary) {
        return basicSalary * 0.20;
    }

    public static double calculateDA(double basicSalary) {
        return basicSalary * 0.10;
    }

    public static double calculatePF(double basicSalary) {
        return basicSalary * 0.12;
    }

    public static double calculateGrossSalary(double basicSalary) {
        return basicSalary + calculateHRA(basicSalary)
                + calculateDA(basicSalary);
    }

    public static double calculateNetSalary(double basicSalary) {
        return calculateGrossSalary(basicSalary)
                - calculatePF(basicSalary);
    }

    public static void main(String[] args) {

        double basicSalary = 230000;

        double hra = calculateHRA(basicSalary);
        double da = calculateDA(basicSalary);
        double pf = calculatePF(basicSalary);
        double grossSalary = calculateGrossSalary(basicSalary);
        double netSalary = calculateNetSalary(basicSalary);

        System.out.printf("Basic Salary : Rs. %.2f%n", basicSalary);
        System.out.printf("HRA (20%%)    : Rs. %.2f%n", hra);
        System.out.printf("DA (10%%)     : Rs. %.2f%n", da);
        System.out.printf("PF (12%%)     : Rs. %.2f%n", pf);

        System.out.println("---------------------------------------");

        System.out.printf("Gross Salary : Rs. %.2f%n", grossSalary);
        System.out.printf("Net Salary   : Rs. %.2f%n", netSalary);

        System.out.println("=======================================");
    }
}
