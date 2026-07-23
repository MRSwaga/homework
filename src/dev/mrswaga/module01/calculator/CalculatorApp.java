package dev.mrswaga.module01.CalculatorApp;

import java.util.Scanner;

public class CLI {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ожидается первое число: ");
        double a = sc.nextDouble();

        System.out.print("Ожидается операция: ");
        char operation = sc.next().charAt(0);

        System.out.print("Ожидается второе число: ");
        double b = sc.nextDouble();

        double result;

        switch (operation) {
            case '+':
                result = a + b;
            break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("далбаеб, на ноль нед елят");
                    return;
                }

                result = a / b;
                break;

            default:
                System.out.println("Такой операции нет");
                return;
        }
        System.out.println("Рез: " + result);

        sc.close();
    }
}
