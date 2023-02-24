package lesson_oop7.Note.Contoroller;

import java.util.List;

import lesson_oop7.Note.Loggerable;
import lesson_oop7.Note.Model.Fields;
import lesson_oop7.Note.Model.Note;
import lesson_oop7.Note.Model.NoteRepository;


public class NoteController {
    private final NoteRepository repository;
    private final Loggerable logger;
   
    

    public NoteController(NoteRepository repository,Loggerable logger) {
        this.repository = repository;
        this.logger = logger;
    
        
    }

    public void saveNotes(Note note) throws Exception {
        repository.AddNote(note);
    
        

    }

    public void updateNote(Note note, Fields field,String param) throws Exception {
        
        repository.UpdateNote(note,field,param);
        logger.logg("UPDATE");

    }

    public Note readNote(String userId) throws Exception {
        List<Note> notes = repository.getAllNote();
        for (Note note : notes) {
            if (note.getId().equals(userId)) {
                logger.logg("READ");
                return note;
            }
        }

        throw new Exception("User not found");
        
        
    }

    public List<Note> getNote() throws Exception {
        logger.logg("LIST");
        return repository.getAllNote();
        
    }

    public void delNote(String userId) throws Exception {
        logger.logg("DELETE");
        repository.DeleteNote(userId);;

    }
}
