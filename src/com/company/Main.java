package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String str1, str2, str3, str4;
        str1 = "Введите опреацию: ";
        str2 = "Введите первую переменную: ";
        str3 = "Введите вторую переменную: ";
        str4 = "Результат выполнения операции: ";

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print(str1);
            String mathematicalOperation = scanner.nextLine();
            System.out.print(str2);
            int firstNumber = scanner.nextInt();
            System.out.print(str3);
            int secondNumber = scanner.nextInt();

            Operation operation = new Operation(mathematicalOperation, firstNumber, secondNumber);
            int result = operation.execute(mathematicalOperation, firstNumber, secondNumber);
            System.out.println(str4 + result);
        } while (true);
    }
}
