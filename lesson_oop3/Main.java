package lesson_oop3;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String>words = new MyLinkedList<>();
        words.add("первый");
        words.add("второй");
        words.add("третий");
        for (String word : words) {
            System.out.println(word);
        }

    }
}
