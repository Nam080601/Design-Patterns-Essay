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
        boolean firstLine = true;
        try {
            File file = new File(input);
            Scanner scanner = new Scanner(file);

            if (input.contains(".csv")) {
                scanner.useDelimiter(",");
            }
            while (scanner.hasNextLine()) {
                String data = "";
                data = scanner.nextLine();

                // Remove first blank char in csv file
                if (input.contains(".csv") && firstLine) {
                    data = data.substring(1);
                    firstLine = false;
                }

                if (input.contains(".csv")) {
                    // Add \n to end of line except last line
                    if (scanner.hasNextLine())
                        content += data + "\n";
                    else {
                        content += data;
                    }
                } else {
                    content += data;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}