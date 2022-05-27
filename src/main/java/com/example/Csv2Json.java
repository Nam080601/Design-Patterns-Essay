package com.example;

import java.io.File;

public class Csv2Json extends Convert {

    @Override
    public void PrintStart() {
        System.out.println("Staring convert CSV to JSON!");
    }

    @Override
    public void WriteFile() {
        String input = new File("input/input.csv").getAbsolutePath();
        String output = new File("output/output.json").getAbsolutePath();

        MyFileReader csvReader = new MyFileReader(input);
        Adapter csvAdapter = new AdapterCSV(csvReader);
        MyFileWriter jsonWriter = new MyFileWriter(output);

        jsonWriter.Write(csvAdapter.Write("JSON"), "json");
    }

    @Override
    public void PrintEnd() {
        System.out.println("Convert CSV to JSON complete!");
    }

}