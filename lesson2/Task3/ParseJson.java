package lesson2.Task3;

import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 3.** Дана json строка (можно сохранить в файл и читать из файла)

[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода:

Студент Иванов получил 5 по предмету Математика.

Студент Петрова получил 4 по предмету Информатика.

Студент Краснов получил 5 по предмету Физика.
 */
public class ParseJson {

    public static void main(String[] args) throws Exception {
        FileWriter nFile = new FileWriter("students.json");
        nFile.write("[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]"); 
        nFile.close();
        parsejsn();
        
    }
    static void parsejsn() throws Exception{
        FileReader fr= new FileReader("students.json");
        Scanner scan = new Scanner(fr); 
        
        String strings =  scan.nextLine();
        String newString = strings.replace(":", ",");
        newString = newString.replaceAll("[ \\} \\] \\{ \\[ \"]", "");
        String []array = newString.split(",");
       
    
        StringBuilder resultout1 = new StringBuilder();
        StringBuilder resultout2 = new StringBuilder();
        StringBuilder resultout3 = new StringBuilder();
      
        resultout1.append("Студент" + " " + array[1] + " " + "получил" + " " + array[3] + " " +  "по предмету" + " " + array[5]);
        resultout2.append("Студент" + " " + array[7] + " " + "получил" + " " + array[9] + " " +  "по предмету" + " " + array[11]);
        resultout3.append("Студент" + " " + array[13] + " " + "получил" + " " + array[15] + " " +  "по предмету" + " " + array[17]);
        System.out.println(resultout1.toString());
        System.out.println(resultout2.toString());
        System.out.println(resultout3.toString());
        fr.close(); 
        }   
          
    }   
    
             
          
     

            
            
    

       
           
            


            
  
        
    
