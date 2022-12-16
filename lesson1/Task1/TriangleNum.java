package lesson1.Task1;
import java.util.Scanner;;
/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
 * n! (произведение чисел от 1 до n)
 */
public class TriangleNum {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите порядковый номер треугольного числа: ");
        int n = iScanner.nextInt();
        int sumN = 0;
        int multN = 1;
       
        for (int i = 1; i <=n; i++)
            sumN = sumN + i;
        for (int i = 1; i <=n; i++)   
            multN = multN*i;
        

        System.out.println(n + "-e треугольное число равно " + sumN);
        System.out.printf("Произведение чисел от 1 до %d равно %s",n,multN);
    }
}