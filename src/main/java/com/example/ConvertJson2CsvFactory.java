package com.example;

public class ConvertJson2CsvFactory extends ConvertFactory {

    @Override
    public Convert getConvert() {
        return new Json2Csv();
    }

}
