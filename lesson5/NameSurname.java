package lesson5;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


/*Пусть дан список сотрудников:Иван Иванов ( и остальные, полный текст дз будет на платформе)
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности. */
public class NameSurname {
    public static void main(String[] args) {
        String[]employees = {"Назаров Руслан","Зиновьев Серафим","Калинин Ярослав","Назаров Руслан","Матвеев Серафим","Абрамов Руслан","Орлов Руслан","Гусев Артём","Лаврентьев Ярослав","Лаврентьев Владислав"};
        int count = 0;
        Map<String,Integer>map = new HashMap<>();
        for(String employee:employees){
            String[] name = employee.split(" ");
        
            
            if(map.get(name[1])==null){
                map.put(name[1], count);
            }
            else{
                map.put(name[1], map.get(name[1])+ 1);
            }
            
        }
        
        map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(System.out::println);    
    }
}

