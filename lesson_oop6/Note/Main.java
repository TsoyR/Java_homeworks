package lesson_oop6.Note;

import lesson_oop6.Note.Contoroller.NoteController;
import lesson_oop6.Note.Model.FileOperation;
import lesson_oop6.Note.Model.FileOperationImpl;
import lesson_oop6.Note.Model.NoteRepository;
import lesson_oop6.Note.View.ViewNodes;

public class Main {
    
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("notes.txt");
        NoteRepository repository = new NoteRepository(fileOperation);
       
        NoteController controller = new NoteController(repository);
        ViewNodes view = new ViewNodes(controller);
        view.run();
    }
}
