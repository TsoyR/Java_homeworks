package lesson4.Task1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ReverseList {
    public static void main(String[] args) {
        LinkedList<Integer>ll = new LinkedList<>(Arrays.asList(1,2,3,4,5));

        System.out.printf("Исходный список %s\n",ll);
        Collections.reverse(ll);    
        System.out.printf("Перевернутый список %s\n",ll);
    }
}
