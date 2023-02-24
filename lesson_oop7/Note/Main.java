package lesson_oop7.Note;

import lesson_oop7.Note.Contoroller.NoteController;
import lesson_oop7.Note.Model.FileOperation;
import lesson_oop7.Note.Model.FileOperationImpl;
import lesson_oop7.Note.Model.NoteRepository;
import lesson_oop7.Note.View.ViewNodes;

public class Main {
    
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("notes.txt");
        NoteRepository repository = new NoteRepository(fileOperation);
       
        NoteController controller = new NoteController(repository, new LoggerFile());
        ViewNodes view = new ViewNodes(controller);
        view.run();
    }
}
