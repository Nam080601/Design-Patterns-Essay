package com.example;

import org.json.*;

public class AdapterXML extends Adapter {
    public AdapterXML(MyFileReader mfr) {
        super(mfr);
    }

    public String Write(String type) {
        if (type.equalsIgnoreCase("JSON")) {
            try {
                JSONObject json = XML.toJSONObject(mfr.getContent());
                return json.toString(4);
            } catch (JSONException e) {
                return e.toString();
            }
        }
        return "";
    }
}
// Adapter