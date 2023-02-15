package lesson_oop6.Note.Contoroller;

import java.util.List;

import lesson_oop6.Note.Model.Fields;
import lesson_oop6.Note.Model.Note;
import lesson_oop6.Note.Model.NoteRepository;

public class NoteController {
    private final NoteRepository repository;
   
    

    public NoteController(NoteRepository repository) {
        this.repository = repository;
    
        
    }

    public void saveNotes(Note note) throws Exception {
        repository.AddNote(note);

    }

    public void updateNote(Note note, Fields field,String param) throws Exception {
      
        repository.UpdateNote(note,field,param);


    }

    public Note readNote(String userId) throws Exception {
        List<Note> notes = repository.getAllNote();
        for (Note note : notes) {
            if (note.getId().equals(userId)) {
                return note;
            }
        }

        throw new Exception("User not found");
    }

    public List<Note> getNote() throws Exception {
        return repository.getAllNote();
    }

    public void delNote(String userId) throws Exception {

        repository.DeleteNote(userId);;

    }
}
