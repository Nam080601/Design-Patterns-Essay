package com.example;

import org.json.*;

public class XMLAdapter {
    private XMLReader xml;

    public XMLAdapter(XMLReader xml) {
        this.xml = xml;
    }

    public String ReadJSON() {
        try {
            JSONObject json = XML.toJSONObject(xml.getContent());
            return json.toString(4);
        } catch (JSONException e) {
            return e.toString();
        }
    }
}
// Adapter