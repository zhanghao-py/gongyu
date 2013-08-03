package com.h3c.imc.imcplatservice;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2013-07-27T17:59:59.554+08:00
 * Generated source version: 2.7.6
 * 
 */
@WebServiceClient(name = "imcplatService", 
                  wsdlLocation = "http://wwwgongyu.oicp.net:88/imcws/services/imcplatService.wsdl",
                  targetNamespace = "http://imc.h3c.com/imcplatService") 
public class ImcplatService extends Service {


    public final static QName SERVICE = new QName("http://imc.h3c.com/imcplatService", "imcplatService");
    public final static QName ImcplatServiceHttpSoap11Endpoint = new QName("http://imc.h3c.com/imcplatService", "imcplatServiceHttpSoap11Endpoint");
    public final static QName ImcplatServiceHttpSoap12Endpoint = new QName("http://imc.h3c.com/imcplatService", "imcplatServiceHttpSoap12Endpoint");
    public final static QName ImcplatServiceHttpEndpoint = new QName("http://imc.h3c.com/imcplatService", "imcplatServiceHttpEndpoint");

    public ImcplatService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ImcplatService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }


    /**
     *
     * @return
     *     returns ImcplatServicePortType
     */
    @WebEndpoint(name = "imcplatServiceHttpSoap11Endpoint")
    public ImcplatServicePortType getImcplatServiceHttpSoap11Endpoint() {
        return super.getPort(ImcplatServiceHttpSoap11Endpoint, ImcplatServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ImcplatServicePortType
     */
    @WebEndpoint(name = "imcplatServiceHttpSoap11Endpoint")
    public ImcplatServicePortType getImcplatServiceHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(ImcplatServiceHttpSoap11Endpoint, ImcplatServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns ImcplatServicePortType
     */
    @WebEndpoint(name = "imcplatServiceHttpSoap12Endpoint")
    public ImcplatServicePortType getImcplatServiceHttpSoap12Endpoint() {
        return super.getPort(ImcplatServiceHttpSoap12Endpoint, ImcplatServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ImcplatServicePortType
     */
    @WebEndpoint(name = "imcplatServiceHttpSoap12Endpoint")
    public ImcplatServicePortType getImcplatServiceHttpSoap12Endpoint(WebServiceFeature... features) {
        return super.getPort(ImcplatServiceHttpSoap12Endpoint, ImcplatServicePortType.class, features);
    }
    /**
     *
     * @return
     *     returns ImcplatServicePortType
     */
    @WebEndpoint(name = "imcplatServiceHttpEndpoint")
    public ImcplatServicePortType getImcplatServiceHttpEndpoint() {
        return super.getPort(ImcplatServiceHttpEndpoint, ImcplatServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ImcplatServicePortType
     */
    @WebEndpoint(name = "imcplatServiceHttpEndpoint")
    public ImcplatServicePortType getImcplatServiceHttpEndpoint(WebServiceFeature... features) {
        return super.getPort(ImcplatServiceHttpEndpoint, ImcplatServicePortType.class, features);
    }

}
