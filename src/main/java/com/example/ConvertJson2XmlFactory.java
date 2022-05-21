package com.example;

public class ConvertJson2XmlFactory extends ConvertFactory {

    @Override
    public Convert getConvert() {
        return new Json2Xml();
    }

}
