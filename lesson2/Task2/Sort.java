package lesson2.Task2;

import java.util.logging.*;
import java.util.Arrays;
import java.io.IOException;

/*Реализуйте алгоритм сортировки пузырьком числового массива,
 результат после каждой итерации запишите в лог-файл. */
public class Sort {
    public static void main(String[] args) throws IOException{
        Logger logger = Logger.getLogger(Sort.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        int [] mas = {9,4,6,2,1};
        int temp;
        boolean isSort = false;
        while (isSort != true){
            isSort = true;
            for (int i = 0; i < mas.length-1;i++){
                if (mas[i] > mas[i+1]){
                    isSort = false;
                    temp = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = temp;
                    logger.info(Arrays.toString(mas));
                    // System.out.println(Arrays.toString(mas));
                    
                }
         
            }    
        }
        
    }
}