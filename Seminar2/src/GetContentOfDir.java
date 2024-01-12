import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class GetCurrentDir {
    public static String[] getCurrentDir(String dirName){
        File curDir = new File(System.getProperty(dirName);
        return curDir.list();
    }
}
