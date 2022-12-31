package lesson4.Task1;

import java.util.LinkedList;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer>ll = new LinkedList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        
        System.out.printf("Исходный список %s\n",ll);
        List<Integer>reverse = reversell(ll);
        System.out.printf("Перевернутый список %s\n",reverse);
    }
    public static List<Integer> reversell(List<Integer>ll){
        
        for(int i = ll.size()-1;i >= 0;i--){
                ll.add(ll.get(i));
                ll.remove(i);
        }  
        return ll;    
        }
        
}

