package com.example;

import org.json.*;

public class JSONAdapter {
    private JSONReader json;

    public JSONAdapter(JSONReader json) {
        this.json = json;
    }

    public String ReadXML() {
        try {
            JSONObject jsonObj = new JSONObject(json.getContent().replace("null", ""));
            return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<Root>" + XML.toString(jsonObj) + "</Root>";
        } catch (JSONException e) {
            return e.toString();
        }
    }
}
// Adapter