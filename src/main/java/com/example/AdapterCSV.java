package com.example;

import org.json.*;

public class AdapterCSV {
    private MyFileReader csv;

    public AdapterCSV(MyFileReader csv) {
        this.csv = csv;
    }

    public String WriteJSON() {
        try {
            String data = csv.getContent().replace("null", "");
            return CDL.toJSONArray(data).toString();
        } catch (JSONException e) {
            return e.toString();
        }
    }
}
// Adapter