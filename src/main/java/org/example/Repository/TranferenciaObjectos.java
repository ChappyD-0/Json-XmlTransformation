package org.example.Repository;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface TranferenciaObjectos {

    public Object serialize(Object obj) throws JsonProcessingException;

    public Object deserialize(String json, Class clazz) throws JsonProcessingException;

}
