package lesson4.Task2;

/*Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя. */
import java.util.LinkedList;


public class QueueMethod {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(5);
        System.out.printf("Исходный список %s\n", queue);
        enqueue(queue, 6);
        System.out.printf("Cписок после добавления элемента в конец очереди %s\n",queue);
        int a = dequeue(queue);
        System.out.printf("первый элемент %d\n",a);
        System.out.printf("Cписок после удаления первого в очереди элемента  %s\n", queue);
        int b = first(queue);
        System.out.printf("Первый элемент в очереди %d \n",b);
        System.out.printf("Список %s \n",queue);     

    }
    public static LinkedList<Integer>enqueue(LinkedList<Integer> queue,int a){
        queue.add(queue.size(), a);
        return queue;
    }
    public static int dequeue(LinkedList<Integer> queue){
        return queue.removeFirst();
    }
    public static int first(LinkedList<Integer> queue){
        return queue.element();
    }

}







