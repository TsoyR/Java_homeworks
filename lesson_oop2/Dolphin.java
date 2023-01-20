package lesson_oop2;

/**
 * Dolphin
 */
public class Dolphin extends Animal implements AbilityToSwim {

    public Dolphin(String name, int box) {
        super(name, box);
        
    }

    @Override
    public String say() {
        System.out.printf("Дельфин - ");
        return "трррррр";
    }

    @Override
    public int speedOfSwim() {
       
        return 60;
    }

    
}
