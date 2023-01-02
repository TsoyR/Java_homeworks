package lesson5;
import java.util.HashMap;
/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов */
import java.util.Map;


public class Contacts {
    public static void main(String[] args) {
        Map<String,String>phone = new HashMap<>();
        phone.put("159-64-31,915-97-88", "Edward Carlson");
        phone.put("129-64-32", "Norman Robertson");
        phone.put("345-45-21,435-54-12", "Brian King");
        phone.put("987-45-12", "Corey Peters");

        for(Map.Entry<String,String>item:phone.entrySet()){
            System.out.println("NAME: " + item.getValue()+" | "+"PHONE NUM.: " + item.getKey());
        }

        
    }
}
