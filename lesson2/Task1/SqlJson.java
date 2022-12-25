package lesson2.Task1;

/**
 * SqlJson
 */

public class SqlJson {
    public static void main(String[] args) {
        
    
    String jsonString = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
    String newString = jsonString.replace(":","=");
    int len = newString.length();
    char []dst = new char[len - 15];
    newString.getChars(1,len-15,dst, 0);
   
    StringBuilder sb = new StringBuilder("select * from students where ");
    sb.append(dst);
   
    System.out.println(sb);

    }


    

    
}