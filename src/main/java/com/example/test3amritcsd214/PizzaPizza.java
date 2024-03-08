package com.example.test3amritcsd214;

import static javafx.application.Application.launch;

public class  PizzaPizza {
    private static final double small_pizza = 8.00;
    private static final double medium_pizza = 10.00;
    private static final double large_pizza = 12.00;
    private static final double xl_pizza = 15.00;
    private static final double topping_rate = 1.50;
    private static final double tax_rate = 0.15;

    public static double calculateTotalBill(String size, int toppings) {
        double basePrice = switch (size) {
            case "S" -> small_pizza;
            case "M" -> medium_pizza;
            case "L" -> large_pizza;
            case "XL" -> xl_pizza;
            default -> throw new IllegalArgumentException("Invalid pizza size: " + size);
        };

        double total = basePrice + (toppings * topping_rate);
        total *= (1 + tax_rate);

        return total;
    }
}