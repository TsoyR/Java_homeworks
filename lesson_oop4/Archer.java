package lesson_oop4;


import lesson_oop4.Shield.Protect;
import lesson_oop4.Weapons.Bow;
import lesson_oop4.Weapons.Weaponable;

public class Archer<E extends Protect> extends Warrior{

    private E protect;

    public Archer(String name, int healthPoint, Weaponable weapon, E protect) {
        super(name, healthPoint, weapon);
        this.protect = protect;
    }

    @Override
    public String toString() {
        return "Archer " + super.toString() + protect;
    }

    public int shotRange(){
        return ((Bow) getWeapon()).getRange();
    }


    public int PoinOfProtect(){
        return protect.getPointOfAntiDamage();
    }

   
  
    
}
