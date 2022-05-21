package com.example;

import java.io.File;

public class Json2Xml extends Convert {

    @Override
    public void WriteFile() {
        String input = new File("input/input.json").getAbsolutePath();
        String output = new File("output/output.xml").getAbsolutePath();

        JSONReader jsonReader = new JSONReader(input);
        JSONAdapter jsonAdapter = new JSONAdapter(jsonReader);
        XMLWriter xmlWriter = new XMLWriter(output);

        xmlWriter.Write(jsonAdapter.ReadXML());
    }

    @Override
    public void Print() {
        System.out.println("Convert JSON to XML complete!");
    }

}