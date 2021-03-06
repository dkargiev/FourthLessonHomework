package com.company;

public class Subtraction extends Operation {

    Subtraction(String mathematicalOperation, int firstNumber, int secondNumber) {
        super(mathematicalOperation, firstNumber, secondNumber);
    }

    @Override
    int execute(String mathematicalOperation, int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}
