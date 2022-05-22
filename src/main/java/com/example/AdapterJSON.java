package com.example;

import org.json.*;

public class AdapterJSON {
    private MyFileReader json;

    public AdapterJSON(MyFileReader json) {
        this.json = json;
    }

    public String WriteXML() {
        try {
            JSONObject jsonObj = new JSONObject(json.getContent().replace("null", ""));
            return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<Root>" + XML.toString(jsonObj) + "</Root>";
        } catch (JSONException e) {
            return e.toString();
        }
    }

    public String WriteCSV() {
        try {
            JSONObject jsonObj = new JSONObject(json.getContent().replace("null", ""));
            JSONArray docs = jsonObj.getJSONArray("data");
            return CDL.toString(docs);
        } catch (JSONException e) {
            return e.toString();
        }
    }
}
// Adapter