package com.alct.integration.lbs.parser;

import com.alct.integration.lbs.model.LbsResponse;
import org.apache.commons.io.IOUtils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.InputStream;

public class LbsResponseParser {

    public static LbsResponse deserialize(String xml) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(LbsResponse.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            InputStream in = IOUtils.toInputStream(xml, "UTF-8");
            LbsResponse obj  = (LbsResponse) jaxbUnmarshaller.unmarshal(in);
            return obj;
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }

}
