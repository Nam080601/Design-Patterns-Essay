package com.example;

import java.io.File;

public class Json2Csv extends Convert {

    @Override
    public void PrintStart() {
        System.out.println("Staring convert JSON to CSV!");
    }

    @Override
    public void WriteFile() {
        String input = new File("input/inputs.json").getAbsolutePath();
        String output = new File("output/output.csv").getAbsolutePath();

        MyFileReader jsonReader = new MyFileReader(input);
        Adapter jsonAdapter = new AdapterJSON(jsonReader);
        MyFileWriter csvWriter = new MyFileWriter(output);

        csvWriter.Write(jsonAdapter.Write("CSV"), "csv");
    }

    @Override
    public void PrintEnd() {
        System.out.println("Convert JSON to CSV complete!");
    }

}