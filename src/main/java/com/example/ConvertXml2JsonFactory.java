package com.example;

public class ConvertXml2JsonFactory extends ConvertFactory {

    @Override
    public Convert getConvert() {
        return new Xml2Json();
    }

}
