package com.example;

public abstract class ConvertFactory {
    public abstract Convert getConvert();

    public void WriteFile() {
        Convert convert = getConvert();
        convert.WriteFile();
    }

    public void PrintStart() {
        Convert convert = getConvert();
        convert.PrintStart();
    }

    public void PrintEnd() {
        Convert convert = getConvert();
        convert.PrintEnd();
    }
}
// Factory methods