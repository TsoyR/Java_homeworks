package lesson_oop4;

import lesson_oop4.Shield.Protect;
import lesson_oop4.Weapons.Weaponable;

public abstract class Warrior {
    private String name;
    private int healthPoint;
    private Weaponable weapon;
    private Protect protect;


    

    public Warrior(String name, int healthPoint, Weaponable weapon) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
            
    }


    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }


    public Weaponable getWeapon() {
        return weapon;
    }


    public void setWeapon(Weaponable weapon) {
        this.weapon = weapon;
    }



    public int PoinOfProtect(){
        return protect.getPointOfAntiDamage();
    }
   
    @Override
    public String toString() {
        return String.format("name is %s ,healthpoint = %d , weapon = %s", name, healthPoint,weapon);
    }



    


 
 
}
