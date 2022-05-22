package com.example;

public abstract class Convert {
    public void Execute() {
        PrintStart();
        WriteFile();
        PrintEnd();
    }

    public abstract void PrintStart();

    public abstract void WriteFile();

    public abstract void PrintEnd();
}
// Template methods