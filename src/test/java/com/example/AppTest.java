
package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testHRA() {
        assertEquals(46000.0, App.calculateHRA(230000), 0.01);
    }

    @Test
    public void testDA() {
        assertEquals(23000.0, App.calculateDA(230000), 0.01);
    }

    @Test
    public void testPF() {
        assertEquals(27600.0, App.calculatePF(230000), 0.01);
    }

    @Test
    public void testGrossSalary() {
        assertEquals(299000.0, App.calculateGrossSalary(230000), 0.01);
    }

    @Test
    public void testNetSalary() {
        assertEquals(271400.0, App.calculateNetSalary(230000), 0.01);
    }
}
