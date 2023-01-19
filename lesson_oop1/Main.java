package lesson_oop1;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine1 = new VendingMachine(new Product("Яблоко", 100));
        vendingMachine1.getProducts().add(new Milk("Домик в деревне", 50, 1));
        for(Product product : vendingMachine1.getProducts()) {
            System.out.println(product);
        }
    }
    
}
