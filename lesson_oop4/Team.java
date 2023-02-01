package lesson_oop4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;





public class Team <E extends Warrior>implements Iterable<E>{
    private List<E> team = new ArrayList<>();
    public Team<E> addWarriorTeam(E people){
        team.add(people);
        return this;
    }
    

    
    @Override
    public Iterator<E> iterator() {
        return team.iterator();
    }

    public String maxTeamRange() {
        int maxRange = 0;
        for (E item : team) {
            if(item instanceof Archer) {
                if(((Archer)item).shotRange() > maxRange) maxRange = ((Archer)item).shotRange();
            }
        }
        return String.format("Max shot is %d",maxRange);
    }

    public String minShieldInTeam(){
        int minShield = 0;
        for (E item : team) {
            if(item instanceof Archer) {
                minShield = ((Archer)item).PoinOfProtect();
                if(((Archer)item).PoinOfProtect() < minShield) minShield = ((Archer)item).PoinOfProtect();
            }
            else
            if (item instanceof Swordman){
                minShield = ((Swordman)item).PoinOfProtect();
                if(((Swordman)item).PoinOfProtect() < minShield) minShield = ((Swordman)item).PoinOfProtect();
            }
        
        }
        return String.format("Min shield is %d\n",minShield);
         
}
}

