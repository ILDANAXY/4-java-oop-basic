package com.example.task03;

public class ComplexNumber {

    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber add(ComplexNumber complexNumber){
        double realPart = this.realPart + complexNumber.realPart;
        double imaginaryPart = this.imaginaryPart + complexNumber.imaginaryPart;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public ComplexNumber multiply(ComplexNumber complexNumber){
        double realPart = this.realPart * complexNumber.realPart - this.imaginaryPart * complexNumber.imaginaryPart;
        double imaginaryPart = this.imaginaryPart * complexNumber.realPart + this.realPart * complexNumber.imaginaryPart;
        return new ComplexNumber(realPart, imaginaryPart);
    }
}

