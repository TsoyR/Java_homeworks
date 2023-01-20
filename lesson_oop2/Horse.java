package lesson_oop2;

import java.io.IOException;
import java.nio.CharBuffer;

public class Horse extends Animal implements Runable{
    

    public Horse(String name, int box) {
        super(name, box);
    }

    @Override
    public String say() {
        System.out.printf("Лошадь - ");
        return "Игого";
    }

   
    @Override
    public int speedOfRun() {
        
        return 60;
    }

    
    
    
}
