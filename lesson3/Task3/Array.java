package Task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*Задан целочисленный список ArrayList. 
Найти минимальное, максимальное и среднее из этого списка. */
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int n = sc.nextInt();
        ArrayList<Integer>arraylist = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            arraylist.add((int)(Math.random() * 100));
        }
        
        int max = Collections.max(arraylist);
        int min = Collections.min(arraylist);
        int sum = 0;
        for (int el:arraylist){
    
            sum = sum + el;
        }
        double aver = sum/n;
        System.out.println(arraylist);
        System.out.printf("Максимальное число равно %d\n", max);
        System.out.printf("Минимальное число равно %d\n", min);
        System.out.printf("Среднее арифметическое число равно %f",aver);
         
    }
}
