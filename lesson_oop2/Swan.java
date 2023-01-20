package lesson_oop2;

public class Swan extends Animal implements AbilityToSwim,Runable,Flyable {

    public Swan(String name, int box) {
        super(name, box);
        
    }

    @Override
    public int speedOfFly() {
        return 80;
    }

    @Override
    public int speedOfRun() {
        return 30;
    }

    @Override
    public int speedOfSwim() {

        return 36;
    }

    @Override
    public String say() {
        
        return "Шиши";
    }
    
}
