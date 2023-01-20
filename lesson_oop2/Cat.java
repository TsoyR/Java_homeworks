package lesson_oop2;

public class Cat extends Animal implements Runable{
    private String color;
    public Cat(String name, int box,String color) {
        super(name, box);
        this.color = color;
        
    }
    @Override
    public String say() {
        System.out.printf("Кошка - ");
        return "Мяу";
    }
    @Override
    public int speedOfRun() {
        return 15;
    }
    

    
    

    
}
