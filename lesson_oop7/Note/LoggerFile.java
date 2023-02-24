package lesson_oop7.Note;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * LoggerTerminal
 */
public class LoggerFile implements Loggerable{

    @Override
    public void logg(String msg) throws IOException {
        try(FileWriter writer = new FileWriter("logg.txt",true))
        {
            String text = LocalDateTime.now() + msg;
            try {
                writer.write(text);
                writer.append("\n");
                writer.flush();
            } catch (IOException ex) {
                  
                System.out.println(ex.getMessage());
            }
            

        }

     
    }

    
}