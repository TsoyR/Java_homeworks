package lesson1.Task3;

import java.util.Scanner;

/**
 * Реализовать простой калькулятор
 */
public class Calculator {

    public static void main(String[] args) {
        
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число");
        boolean flag1 = iScanner.hasNextDouble();
        System.out.print(flag1);
        double a = iScanner.nextDouble();
        System.out.print("\nВведите второе число");
        boolean flag2 = iScanner.hasNextDouble();
        System.out.println(flag2);
        double b = iScanner.nextDouble();
        System.out.println("Введите операцию: ");
        char op = iScanner.next().charAt(0);
        double result = 0;
        switch (op) {
            case '+': result = a + b;   
                break;
            case '-': result = a - b;
                break;
            case '*': result = a * b;
                break;
            case '/': result = a / b;
                break;
        
            default: System.out.println("Вы ввели некорректную операцию!");
                break;
        
        }
        System.out.printf("%.2f %c %.2f = %.2f",a,op,b,result);
    }
}