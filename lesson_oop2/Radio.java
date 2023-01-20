package lesson_oop2;
// Теперь создать объект радио, и подумать, как его включить в объект Zoo.
public class Radio implements Speakeable{
    public String say(){
        System.out.printf("Радио - ");
        return "Blablabla";
    }
}
