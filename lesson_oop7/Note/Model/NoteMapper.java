package lesson_oop7.Note.Model;



public class NoteMapper {
    public String map(Note note) {
        return String.format("%s,%s,%s,%s",note.getId(),note.getHeader(),note.getText(),note.getDate());
    }

    public Note map(String line) {
        String[] lines = line.split(",");
        return new Note((lines[0]), lines[1], lines[2], lines[3]);
    }

    
}
