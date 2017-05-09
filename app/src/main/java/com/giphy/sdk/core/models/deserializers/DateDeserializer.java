package com.giphy.sdk.core.models.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by bogdantmm on 5/8/17.
 */

public class DateDeserializer implements JsonDeserializer<Date> {
    public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        Date date = null;
        try {
            date = dateFormat.parse(json.getAsJsonPrimitive().getAsString());
        } catch (Exception e) { }
        return date;
    }
}