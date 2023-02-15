package lesson_oop6.Note.View;

import java.lang.reflect.Field;
import java.util.Scanner;

import lesson_oop6.Note.Contoroller.NoteController;
import lesson_oop6.Note.Model.Fields;
import lesson_oop6.Note.Model.Note;

public class ViewNodes {
    private final NoteController noteController;
    

    public ViewNodes(NoteController noteController) {
        this.noteController = noteController;    
    }

    public void run(){
        Commands com = Commands.NONE;
        showHelp();
        while (true) {
            try {
                String command = prompt("Введите команду: ");
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        create();
                        break;
                    case READ:
                        read();
                        break;
                    case UPDATE:
                        update();
                        break;
                    case LIST:
                        list();
                        break;
                    case DELETE:
                        delete();
                    case HELP:
                        showHelp();
                }
            }
            catch(Exception ex) {
                System.out.println("Произошла ошибка " + ex.toString());
            }
        }
    }
    private void read() throws Exception {
        String id = prompt("Идентификатор пользователя: ");
        Note note_ = noteController.readNote(id);
        System.out.println(note_);
    }
    private void update() throws Exception {
        String noteid = prompt("Идентификатор пользователя: ");
        String field_name = prompt("Какое поле (HEADER,TEXT,DATE): ");
        String param = null;
        
        param = prompt("Введите на то что хотите изменить");
    
        Note _note = noteController.readNote(noteid);
        noteController.updateNote(_note, Fields.valueOf(field_name.toUpperCase()),param);
    }
   
    private void list() throws Exception {
        for (Note note : noteController.getNote()) {
            System.out.println(note);
            
        }
    }
    private void create() throws Exception {
        String header = prompt("Заголовок: ");
        String text = prompt("Текст: ");
        String date = prompt("Дата");
        

        noteController.saveNotes(new Note(header, text, date));;
    }
    private void showHelp() {
        System.out.println("Список команд:");
        for(Commands c : Commands.values()) {
            System.out.println(c);
        }
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private void delete() throws Exception{
        String id = prompt("Идентификатор записи: ");
        noteController.delNote(id); 
    }
}



