package lesson_oop2;

public class Main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        zoo1.addAnimal(new Cat("Барсик", 1, "grey")).addAnimal(new Horse("Ignat", 10)).addAnimal(new Duck("Donald", 3))
        .addAnimal(new Dolphin("Флиппер", 3)).addAnimal(new Swan("Люба", 5));

        for (Animal item : zoo1.getAnimals()) {
            System.out.println(item);
            System.out.println(item.say());
            
        }
        System.out.printf("Сущности издающие звуки\n");
        for (Speakeable item : zoo1.getSpeakables()) {
            System.out.println(item.say());
            
        }
        for (Runable item : zoo1.getRunner()) {
            System.out.println(item.speedOfRun());
            
        }

    int maxRun = zoo1.getChampionOfRun();
    System.out.println(String.format("Max running speed  is %d",maxRun));

    
    for (Flyable item:zoo1.getFlyers()){
        System.out.println(item.speedOfFly());
    }

    int maxFly = zoo1.getChampionOfFlying();
    System.out.println(String.format("Max flying speed  is %d",maxFly));

    for(AbilityToSwim item:zoo1.getSwim()){
        System.out.println(item.speedOfSwim());
    }

    int maxSwim = zoo1.getChampionOfSwim();
    System.out.println(String.format("Max swimming speed is %d",maxSwim));
}
}
