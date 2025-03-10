package org.example.Repositorys;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface TransferObjects {

    public Object serialize(Object obj) throws JsonProcessingException;

    public Object deserialize(String json, Class clazz) throws JsonProcessingException;

}
