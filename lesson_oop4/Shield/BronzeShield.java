package lesson_oop4.Shield;

import java.util.Random;

public class BronzeShield extends Protect{

    public BronzeShield(int pointOfAntiDamage) {
        super(pointOfAntiDamage);
    
    }

    @Override
    public int protect() {
        
        return new Random().nextInt(0, pointOfAntiDamage);
    }

    @Override
    public String toString() {
        return String.format("shield = bronzenshield[antidamage = %d]",pointOfAntiDamage);
    }

    @Override
    public int getPointOfAntiDamage() {    
        return pointOfAntiDamage;
    }
    
}
