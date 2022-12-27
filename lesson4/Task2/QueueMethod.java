package lesson4.Task2;
import java.util.Collections;
import java.util.Deque;
/*Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя. */
import java.util.LinkedList;
import java.util.Queue;

public class QueueMethod {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(5);
        System.out.printf("Исходный список %s\n", queue);
        enqueue(queue, 6);
        System.out.printf("Cписок после добавления элементв в конец очереди %s\n", queue);
        int a = enqueue(queue);
        System.out.printf("Cписок после удаления первого в очереди элемента (%d) %s\n",a, queue);
        int b = first(queue);
        System.out.printf("Первый элемент в очереди %d \n",b);


        
        

    }
    public static Queue<Integer>enqueue(Queue<Integer> queue,int a){
        queue.offer(a);
        return queue;
    }
    public static int enqueue(Queue<Integer> queue){
        return queue.remove();
    }
    public static int first(Queue<Integer> queue){
        return queue.element();
    }

}







