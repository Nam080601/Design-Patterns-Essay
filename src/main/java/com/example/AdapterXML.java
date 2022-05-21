package com.example;

import org.json.*;

public class AdapterXML {
    private MyFileReader xml;

    public AdapterXML(MyFileReader xml) {
        this.xml = xml;
    }

    public String WriteJSON() {
        try {
            JSONObject json = XML.toJSONObject(xml.getContent());
            return json.toString(4);
        } catch (JSONException e) {
            return e.toString();
        }
    }
}
// Adapter