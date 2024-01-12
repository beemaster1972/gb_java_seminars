import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class GetContentOfDir {

    private static Logger logger = Logger.getLogger(GetContentOfDir.class.getName());


    public static String[] getContentDir(String dirName) {
        logger.info("Begin");
        try {
            File curDir = new File(dirName);
            logger.info("Get directory " + dirName);
            File[] fileList = curDir.listFiles();
            logger.info("Get content of directory " + dirName);
            String[] listFiles = new String[fileList.length];
            String fileName = "";
            for (int i = 0; i < fileList.length; i++) {
                if (fileList[i].isDirectory()) fileName = fileList[i].getName() + "/";
                else fileName = fileList[i].getName();
                listFiles[i] = fileName;
            }
            return listFiles;
        } catch (Exception ex){
            logger.info(ex.getClass().getName());
            logger.log(Level.SEVERE, ex.getMessage());
        }


        return new String[0];
    }

    public static void main(String[] args) throws IOException {
        FileHandler logHandler = new FileHandler("content.log", true);
        logger.addHandler(logHandler);
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        logHandler.setFormatter(simpleFormatter);
        String curDirName = "/home/beemaster"; //System.getProperty("user.dir");
        String[] contentDir = getContentDir(curDirName);
        if (contentDir.length != 0) {
            logger.info("Successful reading contains of directory "+curDirName);
            String outFileName = "content_of_dir.txt";
            WriteStringToFile.writeStringToFile(curDirName + " contains: ", outFileName, false, logger);
            for (String fileName : contentDir) {
                System.out.println(fileName);
                WriteStringToFile.writeStringToFile(fileName, outFileName, true, logger);
            }
        } else{
            logger.warning("Can`t read contains of directory "+ curDirName);
        }

    }
}
