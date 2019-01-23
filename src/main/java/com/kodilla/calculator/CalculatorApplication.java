package com.kodilla.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class Calculator {

    public double add(double first, double second) {
        return first + second;
    }

    public double minus(double first, double second) {
        return first - second;
    }
}

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);

        Calculator calc = new Calculator();

        System.out.println(calc.add(23.3, 45.3));
        System.out.println(calc.minus(67.0, 23.6));
    }

}

