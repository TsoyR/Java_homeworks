package lesson_oop1;

public class Milk extends Product{
    private double milkFat;
    public Milk(String name, double cost, double milkFat){
        super(name, cost);
        this.milkFat = milkFat;
        
    }
    @Override
    public String toString() {
        return String.format(super.toString() +" процент жирности %.1f ",milkFat);
    }
}
