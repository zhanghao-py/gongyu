
package com.h3c.imc.imcplatservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.h3c.imc.common.ws.xsd.WSCommonResult;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.h3c.imc.imcplatservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LogoutResponseReturn_QNAME = new QName("http://imc.h3c.com/imcplatService", "return");
    private final static QName _LoginParam1_QNAME = new QName("http://imc.h3c.com/imcplatService", "param1");
    private final static QName _LoginParam0_QNAME = new QName("http://imc.h3c.com/imcplatService", "param0");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.h3c.imc.imcplatservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCommonResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imc.h3c.com/imcplatService", name = "return", scope = LogoutResponse.class)
    public JAXBElement<WSCommonResult> createLogoutResponseReturn(WSCommonResult value) {
        return new JAXBElement<WSCommonResult>(_LogoutResponseReturn_QNAME, WSCommonResult.class, LogoutResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imc.h3c.com/imcplatService", name = "param1", scope = Login.class)
    public JAXBElement<String> createLoginParam1(String value) {
        return new JAXBElement<String>(_LoginParam1_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imc.h3c.com/imcplatService", name = "param0", scope = Login.class)
    public JAXBElement<String> createLoginParam0(String value) {
        return new JAXBElement<String>(_LoginParam0_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCommonResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://imc.h3c.com/imcplatService", name = "return", scope = LoginResponse.class)
    public JAXBElement<WSCommonResult> createLoginResponseReturn(WSCommonResult value) {
        return new JAXBElement<WSCommonResult>(_LogoutResponseReturn_QNAME, WSCommonResult.class, LoginResponse.class, value);
    }

}
