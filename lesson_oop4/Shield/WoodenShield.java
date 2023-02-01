package lesson_oop4.Shield;

import java.util.Random;

/**
 * WoddenShield
 */
public class WoodenShield extends Protect{

    private int pointOfAntiDamage;
    public WoodenShield(int pointOfAntiDamage) {
        super(pointOfAntiDamage);
        
    }

    @Override
    public int protect() {
        
        return new Random().nextInt(0, pointOfAntiDamage);
    }

    @Override
    public String toString() {
        return String.format("shield = woodenshield[antidamage = %d]",pointOfAntiDamage);
    }

    @Override
    public int getPointOfAntiDamage() {    
        return pointOfAntiDamage;
    }

    
}