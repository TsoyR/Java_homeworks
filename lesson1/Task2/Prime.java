package lesson1.Task2;



/**
 * Вывести все простые числа от 1 до 1000
 */
public class Prime {

    public static void main(String[] args) {
        int n = 1000;
        int i,j;
        for (i = 2;i <= n;i++){
            int count = 0;
            for (j =2; j <= n;j++){
                if (i%j == 0){
                count++;}
                
            }
            if (count <2)
            System.out.println(i + "- простое число" );
        }
        
    }
}