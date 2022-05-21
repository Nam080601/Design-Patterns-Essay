package com.example;

public abstract class ConvertFactory {
    public abstract Convert getConvert();

    public void WriteFile() {
        Convert convert = getConvert();
        convert.WriteFile();
    }

    public void Print() {
        Convert convert = getConvert();
        convert.Print();
    }
}
// Factory methods