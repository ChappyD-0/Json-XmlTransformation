package org.example.Repository.manejadorObjectos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.Repository.TranferenciaObjectos;

public class JsonManegador implements TranferenciaObjectos {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public JsonManegador() {
    }

    @Override
    public Object serialize(Object obj) {
        return gson.toJson(obj);
    }

    @Override
    public Object deserialize(String json, Class clazz) {
        return gson.fromJson(json, clazz);
    }

}
