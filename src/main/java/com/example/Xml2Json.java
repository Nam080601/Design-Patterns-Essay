package com.example;

import java.io.File;

public class Xml2Json extends Convert {

    @Override
    public void WriteFile() {
        String input = new File("input/input.xml").getAbsolutePath();
        String output = new File("output/output.json").getAbsolutePath();

        XMLReader xmlReader = new XMLReader(input);
        XMLAdapter xmlAdapter = new XMLAdapter(xmlReader);
        JSONWriter jsonWriter = new JSONWriter(output);

        jsonWriter.Write(xmlAdapter.ReadJSON());
    }

    @Override
    public void Print() {
        System.out.println("Convert XML to JSON complete!");
    }

}