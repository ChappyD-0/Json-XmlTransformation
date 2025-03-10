package org.example.Data;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.example.Repositorys.TransferObjects;

public class XmlManager implements TransferObjects {
    XmlMapper xmlMapper = new XmlMapper();
    @Override
    public Object serialize(Object obj) throws JsonProcessingException {
        return xmlMapper.writeValueAsString(obj);
    }

    @Override
    public Object deserialize(String xml, Class clazz) throws JsonProcessingException {
        return xmlMapper.readValue(xml,clazz);
    }
}
