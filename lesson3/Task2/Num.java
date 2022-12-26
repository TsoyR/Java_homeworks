package Task2;


import java.util.ArrayList;

import java.util.Scanner;


/**
 * Пусть дан произвольный список целых чисел, удалить из него четные числа
 */
public class Num {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите длину массива: ");
    int n = sc.nextInt();
    ArrayList<Integer>list1 = new ArrayList<Integer>(n);
    for (int i = 0; i < n; i++) {
        list1.add((int)(Math.random() * 100));
    }
    System.out.println(list1);
    for(int j = 0; j < n; j++){
        int element = list1.get(j);
        if (element %2 !=0){
            list1.remove(j);
            n--;
            j--;  
        }    
    }
    System.out.println(list1);
    }
   
    
        

}

