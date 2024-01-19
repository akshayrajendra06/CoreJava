package com.JavaTutorial19_01_24.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyMoveApp {

    public static void main(String[] args) {
//    	src\main\java\com\JavaTutorial19_01_24\filehandling\
        Path originalPath = Paths.get("src\\main\\java\\com\\JavaTutorial19_01_24\\filehandling\\JuliusCesar.txt");
        Path destinationPath = Paths.get("src\\main\\java\\com\\JavaTutorial19_01_24\\filehandling\\JuliusCesar.txt");

        try {
            if (Files.exists(originalPath)) {
                Files.move(originalPath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
