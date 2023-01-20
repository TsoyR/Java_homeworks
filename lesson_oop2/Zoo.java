package lesson_oop2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private ArrayList<Animal>animals;
    private Radio radio = new Radio();
    
    
    public Zoo(){
        animals = new ArrayList<>();
    }
    public Zoo addAnimal(Animal a){
        animals.add(a);
        return this;
    }

    public List<Speakeable>getSpeakables(){
        List<Speakeable>answer = new ArrayList<>();
        for (Animal item : animals) {
            answer.add(item);
            
        }
        answer.add(radio);
        return answer;
    }

    public List<Runable>getRunner(){
        List<Runable> result = new ArrayList<>();
        for (Animal item : animals) {
            if(item instanceof Runable){
                result.add((Runable)item);
            }
                
        }
        return result;
    }

    public int getChampionOfRun(){
        int max = 0;
        for (Runable item : getRunner()) {
            if(max<item.speedOfRun()){
                max = item.speedOfRun();
                
            }
            
        }
            
        return max;
    }


    public List<Flyable>getFlyers(){
        List<Flyable> result = new ArrayList<>();
        for (Animal item : animals) {
            if(item instanceof Flyable){
                result.add((Flyable)item);
            }
            
        }
        return result;
    }

    public int getChampionOfFlying(){
        int max = 0;
        for (Flyable item : getFlyers()) {
            if(max<item.speedOfFly()){
                max = item.speedOfFly();
                
            }
            
        }

            
        return max;
    }



    public List<AbilityToSwim>getSwim(){
        List<AbilityToSwim> result = new ArrayList<>();
        for (Animal item : animals) {
            if(item instanceof AbilityToSwim){
                result.add((AbilityToSwim)item);
            }
            
        }
        return result;
    }

    public int getChampionOfSwim(){
        int max = 0;
        for (AbilityToSwim item : getSwim()) {
            if(max<item.speedOfSwim()){
                max = item.speedOfSwim();    
            }
            
        }    
        return max;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }
}
