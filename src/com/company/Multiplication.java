package com.company;

public class Multiplication extends Operation {

    Multiplication(String mathematicalOperation, int firstNumber, int secondNumber) {
        super(mathematicalOperation, firstNumber, secondNumber);
    }

    @Override
    int execute(String mathematicalOperation, int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}
