package lesson_oop2;
/**Реализовать абстрактный класс Animal и его наследники Cat, Dog, и прочее.
 * Родитель имеет в себе общие данные 
(пример: кличка, количествор лап, какие звуки издают и тд), а наследники собственные параметры (тип перемещения).**/
public abstract class Animal implements Speakeable{
    private String name;
    private int box;

    public Animal(String name, int box){
        this.name = name;
        this.box = box;
    }
    @Override
    public String toString() {
        return String.format("Name is %s box is %d",this.name,this.box);
    }

    public abstract String say();
}
