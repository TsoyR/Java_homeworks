package lesson_oop1;

public class Product {
    private double cost;
    private String name;
    public Product(String name,double cost){
        this.cost = cost;
        this.name = name;

    }
    public String getName() {
        return name;
    }
    public double getCost(){
        return cost;
    }
   
   
    public String toString(){
        return String.format("Наименование:%s Цена:%.1f" ,getName(),getCost());
    }
    
    
}
