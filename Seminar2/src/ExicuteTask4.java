/*
Задание №4
Напишите метод, который составит строку, состоящую из 100
повторений слова TEST и метод, который запишет эту строку в
простой текстовый файл, обработайте исключения.
 */

import java.util.logging.Logger;

public class ExicuteTask4 {
    public static void main(String[] args) {
        String string = "TEST";
        string = GetString100Times.getString100Times(string,100,"\n");
        WriteStringToFile.writeStringToFile(string,"test.txt", false, Logger.getGlobal());
    }
}