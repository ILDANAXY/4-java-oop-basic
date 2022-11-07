package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(1, 2);
        ComplexNumber number2 = new ComplexNumber(3, 4);

        ComplexNumber resultSum = number1.add(number2);
        ComplexNumber resultMultiply = number1.multiply(number2);

        System.out.println(resultSum);
        System.out.println(resultMultiply);
    }
}
