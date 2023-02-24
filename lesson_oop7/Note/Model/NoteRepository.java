package lesson_oop7.Note.Model;

import java.util.ArrayList;
import java.util.List;

public class NoteRepository implements Repository{
    private FileOperation fileOperation;
    private NoteMapper mapper = new NoteMapper();

    public NoteRepository(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
       
    }

    @Override
    public List<Note> getAllNote() {
        List<String> lines = fileOperation.readAllLines();
        List<Note> notes = new ArrayList<>();
        for (String line : lines) {
            notes.add(mapper.map(line));
        }
        return notes;
        
    }

    @Override
    public String AddNote(Note note) {
        List<Note> notes = getAllNote();
        int max = 0;
        for (Note item : notes) {
            int id = Integer.parseInt(item.getId());
            if (max < id){
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        note.setId(id);
        notes.add(note);
        List<String> lines = new ArrayList<>();
        for (Note item: notes) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
        return id;
        
    }

    @Override
    public void UpdateNote(Note note,Fields field,String param) {
        if(field == Fields.HEADER) {
            note.setHeader(param);
        }
        else if(field == Fields.TEXT) {
            note.setText(param);
        }
        else if(field == Fields.DATE) {
            note.setDate(param);
        }
        saveNote(note);
        
    }

    @Override
    public void DeleteNote(String id) {
        List<Note> notes = getAllNote();
        for (Note note : notes) {
            if (note.getId().equals(id)) {
                notes.remove(note);
            }
     
        }

        List<String> lines = new ArrayList<>();
        for (Note item: notes) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
        
    }
    private void saveNote(Note note) {
        List<String> lines = new ArrayList<>();
        List<Note> notes = getAllNote();
        for (Note item: notes) {
            if(note.getId().equals(item.getId())) {
                lines.add(mapper.map(note));
            }
            else {
                lines.add(mapper.map(item));
            }
        }
        fileOperation.saveAllLines(lines);
    }

   

  





    
}
