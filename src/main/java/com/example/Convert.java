package com.example;

public abstract class Convert {
    public void Execute() {
        WriteFile();
        Print();
    }

    public abstract void WriteFile();

    public abstract void Print();
}
// Template methods