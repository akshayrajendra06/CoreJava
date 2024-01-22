package com.JavaTutorial22_01_24.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterApp {

    public static  void main(String[] args) {

        try (BufferedWriter bufferedBookWriter = new BufferedWriter(new FileWriter("src\\main\\java\\com\\JavaTutorial19_01_24\\filehandling\\JuliusCesar.txt", true))) {
            bufferedBookWriter.write("Even you, Brutus?");
            bufferedBookWriter.newLine();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}

