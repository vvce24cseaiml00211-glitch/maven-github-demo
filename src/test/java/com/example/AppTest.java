
package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testCalculateSalary() {

        double basicSalary = 30000;

        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double pf = basicSalary * 0.12;

        double grossSalary = basicSalary + hra + da;
        double netSalary = grossSalary - pf;

        assertEquals(6000, hra, 0.01);
        assertEquals(3000, da, 0.01);
        assertEquals(3600, pf, 0.01);
        assertEquals(39000, grossSalary, 0.01);
        assertEquals(35400, netSalary, 0.01);
    }

    @Test
    public void testEmployeeName() {
        String name = "Rahul";

        assertEquals("Rahul", name);
    }

    @Test
    public void testEmployeeId() {
        int id = 101;

        assertEquals(101, id);
    }

    @Test
    public void testBasicSalary() {
        double salary = 30000;

        assertTrue(salary > 0);
    }

}
