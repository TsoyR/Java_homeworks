package lesson_oop3;

import java.util.Iterator;



public class MyLinkedList<E>implements Iterable<E> {
    private Node<E> head = null;
    private int count = 0;
    
   
    public MyLinkedList(){
       head = new Node<>(null);
    }

    public void add(E data){
        if(count == 0){
            head.data = data;
        }
        else{
            head.add(data);
        }
        count++;
    }

    public class Node<E>{
        public E data;
        public Node<E> next;

        public Node(E data){
            this.data = data;
            this.next = null;
        }
    
        public void add(E data){

            if(next!= null){
                next.add(data);
            }else{
                next = new Node<>(data);
            }
        

    }
}
    @Override
    public Iterator<E> iterator() {
        
        return new MyLinkedListIterator(head);
    }

    public class MyLinkedListIterator implements Iterator<E>{
        private Node<E> currentNode;
        private boolean isFirst = true;
        MyLinkedListIterator(Node<E>head){
            currentNode = head; 
        }
        @Override
        public boolean hasNext() {
            if (count == 1) return true;
            return currentNode.next!=null;
        }
        @Override
        public E next() {
            if(isFirst)isFirst = false;
            else currentNode = currentNode.next;
            return currentNode.data ;
        }
        
    }
   

   
}
