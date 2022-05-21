package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFileReader {
    private String input;
    private String content;

    public MyFileReader(String input) {
        this.input = input;
        ReadFile();
    }

    public String getContent() {
        return content;
    }

    public void ReadFile() {
        try {
            File file = new File(input);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                content += data;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}