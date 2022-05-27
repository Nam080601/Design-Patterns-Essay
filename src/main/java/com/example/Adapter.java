package com.example;

public abstract class Adapter {
    protected MyFileReader mfr;

    public Adapter(MyFileReader mfr) {
        this.mfr = mfr;
    }

    public abstract String Write(String type);
}

// Adapter Superclass