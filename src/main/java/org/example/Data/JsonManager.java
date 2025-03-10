package org.example.Data;

import com.google.gson.Gson;
import org.example.Repositorys.TransferObjects;

public class JsonManager implements TransferObjects {
    Gson gson = new Gson();

    public JsonManager() {
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
