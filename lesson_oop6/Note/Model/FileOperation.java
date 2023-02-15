package lesson_oop6.Note.Model;

import java.util.List;

public interface FileOperation {
    List<String> readAllLines();

    void saveAllLines(List<String>lines);
}
