package lesson_oop7.Note.Model;

import java.util.List;

public interface Repository {
    List<Note>getAllNote();
    String AddNote(Note note);
    void UpdateNote(Note note,Fields field,String param);
    void DeleteNote(String id);

}
