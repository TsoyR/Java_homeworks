package lesson_oop2;

public class Duck extends Animal implements Runable,Flyable,AbilityToSwim {

    public Duck(String name, int box) {
        super(name, box);
    }

    @Override
    public String say() {
        System.out.printf("Утка - ");
        return "Кря-кря";
    }

    @Override
    public int speedOfRun() {
        return 10;
    }

    @Override
    public int speedOfFly() {
        
        return 60;
    }

    @Override
    public int speedOfSwim() {
        
        return 15;
    }
    
}
