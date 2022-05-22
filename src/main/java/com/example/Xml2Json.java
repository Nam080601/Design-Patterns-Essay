package com.example;

import java.io.File;

public class Xml2Json extends Convert {

    @Override
    public void PrintStart() {
        System.out.println("Staring convert XML to JSON!");
    }

    @Override
    public void WriteFile() {
        String input = new File("input/input.xml").getAbsolutePath();
        String output = new File("output/output.json").getAbsolutePath();

        MyFileReader xmlReader = new MyFileReader(input);
        AdapterXML xmlAdapter = new AdapterXML(xmlReader);
        MyFileWriter jsonWriter = new MyFileWriter(output);

        jsonWriter.Write(xmlAdapter.WriteJSON(), "json");
    }

    @Override
    public void PrintEnd() {
        System.out.println("Convert XML to JSON complete!");
    }

}