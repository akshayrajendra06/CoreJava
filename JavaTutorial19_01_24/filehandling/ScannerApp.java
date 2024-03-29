package com.JavaTutorial19_01_24.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerApp {

    public static void main(String[] args) {
        String HAMLET_PART_FILE_PATH = "src\\main\\java\\com\\JavaTutorial19_01_24\\filehandling\\Hamlet.txt";

        try (Scanner scanner = new Scanner(new File(HAMLET_PART_FILE_PATH))){
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}