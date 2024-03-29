package com.JavaTutorial19_01_24.filehandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderApp {

    public static void main(String[] args) {
        String HAMLET_PART_FILE_PATH = "src\\main\\java\\com\\JavaTutorial19_01_24\\filehandling\\Hamlet.txt";

        char[] firstHundredCharacters = new char[100];
        try (FileReader hamletReader = new FileReader(HAMLET_PART_FILE_PATH)) {
            hamletReader.read(firstHundredCharacters);
            System.out.println(firstHundredCharacters);
            hamletReader.read(firstHundredCharacters);
            System.out.println(firstHundredCharacters);
            System.out.println("Read more");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
