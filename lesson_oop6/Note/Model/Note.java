package lesson_oop6.Note.Model;

public class Note {
    private String id;
    private String Header;
    private String Text;
    private String date;
    public Note(String id, String header, String text, String date) {
        this.id = id;
        this.Header = header;
        this.Text = text;
        this.date = date;
    }

    public Note(String header, String text, String date) {
        this.Header = header;
        this.Text = text;
        this.date = date;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getHeader() {
        return Header;
    }
    public void setHeader(String header) {
        this.Header = header;
    }
    public String getText() {
        return Text;
    }
    public void setText(String text) {
        this.Text = text;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
     

}   
