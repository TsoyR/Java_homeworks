package lesson_oop4;




import lesson_oop4.Shield.Protect;
import lesson_oop4.Weapons.Weaponable;


public class Swordman<E extends Protect>extends Warrior {

    private E protect;
    public Swordman(String name, int healthPoint, Weaponable weapon,E protect) {
        super(name, healthPoint, weapon);
        this.protect = protect;
    
    }



    @Override
    public String toString() {
        return "Swordman " + super.toString() + protect;
    }

    @Override
    public int PoinOfProtect() {
        return protect.getPointOfAntiDamage();
    }


    

   

    
    
}
