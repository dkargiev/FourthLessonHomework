package com.company;

public class Operation {

    String mathematicalOperation;
    int firstNumber;
    int secondNumber;

    Operation(String mathematicalOperation, int firstNumber, int secondNumber) {
        this.mathematicalOperation = mathematicalOperation;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    int execute(String mathematicalOperation, int firstNumber, int secondNumber){
        int result = 0;
        switch (mathematicalOperation){
            case "+":
                Addition addition = new Addition(mathematicalOperation, firstNumber, secondNumber);
                return addition.execute(mathematicalOperation, firstNumber, secondNumber);
            case "-":
                Subtraction subtraction = new Subtraction(mathematicalOperation, firstNumber, secondNumber);
                return subtraction.execute(mathematicalOperation, firstNumber, secondNumber);
            case "*":
                Multiplication multiplication = new Multiplication(mathematicalOperation, firstNumber, secondNumber);
                return multiplication.execute(mathematicalOperation, firstNumber, secondNumber);
            case "/":
                Division division = new Division(mathematicalOperation, firstNumber, secondNumber);
                return division.execute(mathematicalOperation, firstNumber, secondNumber);
        }
        return result;
    }
}
