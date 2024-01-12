import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriteStringToFile {
    public static void writeStringToFile(String string, String fileName, boolean append, Logger logger){
        try (FileWriter fileToWrite = new FileWriter(fileName, append))
        {
            fileToWrite.write(string);
            fileToWrite.append(System.lineSeparator());
            fileToWrite.flush();
            logger.info("Successful write \""+string+"\" to file");
            // fileToWrite.close();
        }
        catch (IOException ex){
            logger.log(Level.WARNING, ex.getMessage());
//            System.out.println(ex.getMessage());
        }
    }
}
