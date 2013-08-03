
package com.h3c.imc.acmws.user.security.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.h3c.imc.acmws.user.security.xsd package. 
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

    private final static QName _RetRandomInfoRandom_QNAME = new QName("http://security.user.acmws.imc.h3c.com/xsd", "random");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.h3c.imc.acmws.user.security.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetRandomInfo }
     * 
     */
    public RetRandomInfo createRetRandomInfo() {
        return new RetRandomInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://security.user.acmws.imc.h3c.com/xsd", name = "random", scope = RetRandomInfo.class)
    public JAXBElement<String> createRetRandomInfoRandom(String value) {
        return new JAXBElement<String>(_RetRandomInfoRandom_QNAME, String.class, RetRandomInfo.class, value);
    }

}
