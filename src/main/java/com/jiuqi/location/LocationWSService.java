
package com.jiuqi.location;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "LocationWSService", targetNamespace = "http://location.jiuqi.com", wsdlLocation = "http://116.255.134.168:8087/services/LocationWSService?wsdl")
public class LocationWSService
    extends Service
{

    private final static URL LOCATIONWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException LOCATIONWSSERVICE_EXCEPTION;
    private final static QName LOCATIONWSSERVICE_QNAME = new QName("http://location.jiuqi.com", "LocationWSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://116.255.134.168:8087/services/LocationWSService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LOCATIONWSSERVICE_WSDL_LOCATION = url;
        LOCATIONWSSERVICE_EXCEPTION = e;
    }

    public LocationWSService() {
        super(__getWsdlLocation(), LOCATIONWSSERVICE_QNAME);
    }

    public LocationWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), LOCATIONWSSERVICE_QNAME, features);
    }

    public LocationWSService(URL wsdlLocation) {
        super(wsdlLocation, LOCATIONWSSERVICE_QNAME);
    }

    public LocationWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LOCATIONWSSERVICE_QNAME, features);
    }

    public LocationWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LocationWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LocationWSServicePortType
     */
    @WebEndpoint(name = "LocationWSServiceHttpPort")
    public LocationWSServicePortType getLocationWSServiceHttpPort() {
        return super.getPort(new QName("http://location.jiuqi.com", "LocationWSServiceHttpPort"), LocationWSServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LocationWSServicePortType
     */
    @WebEndpoint(name = "LocationWSServiceHttpPort")
    public LocationWSServicePortType getLocationWSServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://location.jiuqi.com", "LocationWSServiceHttpPort"), LocationWSServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LOCATIONWSSERVICE_EXCEPTION!= null) {
            throw LOCATIONWSSERVICE_EXCEPTION;
        }
        return LOCATIONWSSERVICE_WSDL_LOCATION;
    }

}