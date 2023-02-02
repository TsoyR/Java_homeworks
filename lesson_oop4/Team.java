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

    public String minShieldinTeam(){
        int minShield = 0;
        for(E item:team){
            minShield = item.PoinOfProtect();
            if(item.PoinOfProtect()< minShield)minShield = item.PoinOfProtect();
        }
        return String.format("Min shield is %d\n",minShield);
    }
}

