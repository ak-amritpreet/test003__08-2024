package com.example.test3amritcsd214;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaPizzaTest {


    @Test
    void calculateTotalBill() {
        PizzaPizza x= new PizzaPizza();
        assertEquals(13.225, PizzaPizza.calculateTotalBill("M", 1), 0.01);


    }
}