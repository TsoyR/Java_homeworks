package lesson_oop4.Shield;

public abstract class Protect implements ProtectAbility {

    protected int pointOfAntiDamage;

    public Protect(int pointOfAntiDamage) {
        this.pointOfAntiDamage = pointOfAntiDamage;
    }

    public int getPointOfAntiDamage() {
        return pointOfAntiDamage;
    }

  
    
}
