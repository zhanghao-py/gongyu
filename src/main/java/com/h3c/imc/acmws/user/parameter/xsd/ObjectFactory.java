
package com.h3c.imc.acmws.user.parameter.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.h3c.imc.acmws.user.parameter.xsd package. 
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

    private final static QName _RetSystemParameterValue_QNAME = new QName("http://parameter.user.acmws.imc.h3c.com/xsd", "value");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.h3c.imc.acmws.user.parameter.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetSystemParameter }
     * 
     */
    public RetSystemParameter createRetSystemParameter() {
        return new RetSystemParameter();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parameter.user.acmws.imc.h3c.com/xsd", name = "value", scope = RetSystemParameter.class)
    public JAXBElement<String> createRetSystemParameterValue(String value) {
        return new JAXBElement<String>(_RetSystemParameterValue_QNAME, String.class, RetSystemParameter.class, value);
    }

}
