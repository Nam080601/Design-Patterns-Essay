package com.example;

import org.json.*;

public class AdapterJSON extends Adapter {
    public AdapterJSON(MyFileReader mfr) {
        super(mfr);
    }

    public String Write(String type) {
        if (type.equalsIgnoreCase("XML")) {
            try {
                JSONObject jsonObj = new JSONObject(mfr.getContent().replace("null", ""));
                return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<Root>" + XML.toString(jsonObj) + "</Root>";
            } catch (JSONException e) {
                return e.toString();
            }
        }
        if (type.equalsIgnoreCase("CSV")) {
            try {
                JSONObject jsonObj = new JSONObject(mfr.getContent().replace("null", ""));
                JSONArray docs = jsonObj.getJSONArray("data");
                return CDL.toString(docs);
            } catch (JSONException e) {
                return e.toString();
            }
        }
        return "";
    }
}
// Adapter