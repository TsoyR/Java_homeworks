package lesson_oop4;


import lesson_oop4.Shield.BronzeShield;
import lesson_oop4.Shield.Protect;
import lesson_oop4.Shield.WoodenShield;
import lesson_oop4.Weapons.Bow;
import lesson_oop4.Weapons.Sword;

/*На основе работы на уроке. Создать класс щита, разработать разные типы щитов,
 добавить в семейство классов Warriors обобщения в виде щитов. 
 Реструктуризировать код в конечных классах семейства Warriors. Добавить метод определения минимального щита в команде.
* Продумать, как можно сделать воина без щита.*/
public class Main {
    public static void main(String[] args) {
        Team <Swordman<Protect>> team1 = new Team<>();
        team1.addWarriorTeam(new Swordman<Protect>("Vasya", 250,new Sword(25),new WoodenShield(50)))
        .addWarriorTeam(new Swordman<Protect>("Jonh", 250,new Sword(50),new WoodenShield(30)))
        .addWarriorTeam(new Swordman<Protect>("Smith", 120,new Sword(10), new BronzeShield(10)));
    

    for(Swordman<Protect> swordman:team1){
        System.out.println(swordman);

    }

    Team<Archer<Protect>>team2 = new Team<>();
    team2.addWarriorTeam(new Archer<Protect>("Kolya", 150,new Bow(100, 50),new BronzeShield(100)))
    .addWarriorTeam(new Archer<Protect>("Paul", 200,new Bow(75, 570), new BronzeShield(100)))
    .addWarriorTeam(new Archer<Protect>("Julia", 200, new Bow(20, 200),new BronzeShield(20)));

    for(Archer<Protect> person:team2){
        System.out.println(person);
    }
    System.out.println(team2.maxTeamRange());

    System.out.print(team1.minShieldinTeam());
    System.out.print(team2.minShieldinTeam());
   

   
    
    
}

}
