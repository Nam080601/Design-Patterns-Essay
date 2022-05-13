package com.example;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class JSONWriter {
    private String outputFile;

    public JSONWriter(String outputFile) {
        this.outputFile = outputFile;
    }

    public void Write(String jsonString) {
        try {
            File dir = new File(outputFile.split("/output.json")[0]);
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
            fileWriter.write(jsonString);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}