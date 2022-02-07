package com.epam.tc.hw1;

import com.epam.tat.module4.Calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.sum(1.7976931348623158e+308 + 1, 1.7976931348623158e+308 + 1));
    }
}
