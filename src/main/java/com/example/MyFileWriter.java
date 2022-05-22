package com.example;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class MyFileWriter {
    private String outputFile;

    public MyFileWriter(String outputFile) {
        this.outputFile = outputFile;
    }

    public void Write(String outputContent, String type) {
        try {
            File dir = new File(outputFile.split("/output" + "." + type)[0]);
            if (!dir.exists()) {
                dir.mkdir();
            }
            File file = new File(outputFile);
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileWriter fileWriter = new FileWriter(outputFile);
            fileWriter.write(outputContent);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}