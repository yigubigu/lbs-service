
package com.jiuqi.location;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LocationWSServicePortType", targetNamespace = "http://location.jiuqi.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LocationWSServicePortType {


    /**
     * 
     * @param in0
     * @param in2
     * @param in1
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "out", targetNamespace = "http://location.jiuqi.com")
    @RequestWrapper(localName = "location", targetNamespace = "http://location.jiuqi.com", className = "com.jiuqi.location.Location")
    @ResponseWrapper(localName = "locationResponse", targetNamespace = "http://location.jiuqi.com", className = "com.jiuqi.location.LocationResponse")
    public String location(
        @WebParam(name = "in0", targetNamespace = "http://location.jiuqi.com")
        String in0,
        @WebParam(name = "in1", targetNamespace = "http://location.jiuqi.com")
        String in1,
        @WebParam(name = "in2", targetNamespace = "http://location.jiuqi.com")
        String in2);

}
