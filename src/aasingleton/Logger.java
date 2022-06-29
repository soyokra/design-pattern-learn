package aasingleton;

import java.io.File;
import java.io.FileWriter;

//
public class Logger {

    private FileWriter writer;

    private static final Logger instance = new Logger();

    private Logger() {
        File file = new File("./storage/log.txt");
        try {
            writer = new FileWriter(file, true);
        } catch (Exception  e) {
            e.printStackTrace();
        }

    }

    public static Logger getInstance() {
        return instance;
    }


    public void log(String message) {
        try {
            writer.write(message);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Logger.getInstance().log("this is test singleton design pattern");
    }
}

