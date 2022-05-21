package com.example;

public class ConvertContext {
    private ConvertFactory convert;

    public void setConvertStrategy(ConvertFactory convert) {
        this.convert = convert;
    }

    public void Execute() {
        convert.WriteFile();
        convert.Print();
    }
}
// Strategy