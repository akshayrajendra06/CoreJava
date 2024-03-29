package com.JavaTutorial19_01_24.filehandling;

import java.io.File;
import java.util.Arrays;

public class DirectoriesApp {

    public static void main(String[] args) {
    	
//    	src\main\java\com\JavaTutorial19_01_24\filehandling\
    	
        File businessBooksDirectory = new File("Ebooks\\Business");

        if (businessBooksDirectory.mkdirs()) {
            System.out.println("The new directory is created.");
        } else {
            System.out.println("Can't create the directory.");
        }

        businessBooksDirectory.deleteOnExit();

        File fileHandlingDirectory = new File("src\\main\\java\\com\\JavaTutorial19_01_24\\filehandling\\advanced\\filehandling\\");
        System.out.println("Files in the filehandling directory:");
        System.out.println(Arrays.toString(fileHandlingDirectory.list()));
        System.out.println(Arrays.toString(fileHandlingDirectory.listFiles()));

    }
}