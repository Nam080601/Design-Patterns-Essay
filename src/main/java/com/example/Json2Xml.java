package com.example;

import java.io.File;

public class Json2Xml extends Convert {

    @Override
    public void WriteFile() {
        String input = new File("input/input.json").getAbsolutePath();
        String output = new File("output/output.xml").getAbsolutePath();

        MyFileReader jsonReader = new MyFileReader(input);
        AdapterJSON jsonAdapter = new AdapterJSON(jsonReader);
        MyFileWriter xmlWriter = new MyFileWriter(output);

        xmlWriter.Write(jsonAdapter.WriteXML(), "xml");
    }

    @Override
    public void Print() {
        System.out.println("Convert JSON to XML complete!");
    }

}