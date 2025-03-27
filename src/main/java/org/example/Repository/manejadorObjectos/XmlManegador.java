package org.example.Repository.manejadorObjectos;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.example.Repository.TranferenciaObjectos;

public class XmlManegador implements TranferenciaObjectos {
    XmlMapper xmlMapper = new XmlMapper();

    public XmlManegador() {
    }

    @Override
    public Object serialize(Object obj) throws JsonProcessingException {
        return xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
    }

    @Override
    public Object deserialize(String xml, Class clazz) throws JsonProcessingException {
        return xmlMapper.readValue(xml,clazz);
    }
}
