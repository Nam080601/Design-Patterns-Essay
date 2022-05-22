package com.example;

public class ConvertCsv2JsonFactory extends ConvertFactory {

    @Override
    public Convert getConvert() {
        return new Csv2Json();
    }

}
