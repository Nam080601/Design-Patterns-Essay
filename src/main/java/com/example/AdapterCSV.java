package com.example;

import org.json.*;

public class AdapterCSV extends Adapter {

    public AdapterCSV(MyFileReader mfr) {
        super(mfr);
    }

    public String Write(String type) {
        if (type.equalsIgnoreCase("JSON")) {
            try {
                String data = mfr.getContent().replace("null", "");
                return CDL.toJSONArray(data).toString();
            } catch (JSONException e) {
                return e.toString();
            }
        }
        return "";
    }
}
// Adapter