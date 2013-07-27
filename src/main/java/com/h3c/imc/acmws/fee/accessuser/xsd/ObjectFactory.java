
package com.h3c.imc.acmws.fee.accessuser.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.h3c.imc.acmws.fee.accessuser.xsd package. 
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

    private final static QName _AcmUserServiceServiceSuffix_QNAME = new QName("http://accessuser.fee.acmws.imc.h3c.com/xsd", "serviceSuffix");
    private final static QName _AcmUserServiceServiceName_QNAME = new QName("http://accessuser.fee.acmws.imc.h3c.com/xsd", "serviceName");
    private final static QName _AcmUserServiceCurCycleStartTime_QNAME = new QName("http://accessuser.fee.acmws.imc.h3c.com/xsd", "curCycleStartTime");
    private final static QName _AcmUserServiceUserIp_QNAME = new QName("http://accessuser.fee.acmws.imc.h3c.com/xsd", "userIp");
    private final static QName _AcmUserServiceStrategyName_QNAME = new QName("http://accessuser.fee.acmws.imc.h3c.com/xsd", "strategyName");
    private final static QName _AcmUserServiceCurCycleEndTime_QNAME = new QName("http://accessuser.fee.acmws.imc.h3c.com/xsd", "curCycleEndTime");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.h3c.imc.acmws.fee.accessuser.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AcmUserService }
     * 
     */
    public AcmUserService createAcmUserService() {
        return new AcmUserService();
    }

    /**
     * Create an instance of {@link RetAcmUserServiceList }
     * 
     */
    public RetAcmUserServiceList createRetAcmUserServiceList() {
        return new RetAcmUserServiceList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://accessuser.fee.acmws.imc.h3c.com/xsd", name = "serviceSuffix", scope = AcmUserService.class)
    public JAXBElement<String> createAcmUserServiceServiceSuffix(String value) {
        return new JAXBElement<String>(_AcmUserServiceServiceSuffix_QNAME, String.class, AcmUserService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://accessuser.fee.acmws.imc.h3c.com/xsd", name = "serviceName", scope = AcmUserService.class)
    public JAXBElement<String> createAcmUserServiceServiceName(String value) {
        return new JAXBElement<String>(_AcmUserServiceServiceName_QNAME, String.class, AcmUserService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://accessuser.fee.acmws.imc.h3c.com/xsd", name = "curCycleStartTime", scope = AcmUserService.class)
    public JAXBElement<XMLGregorianCalendar> createAcmUserServiceCurCycleStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AcmUserServiceCurCycleStartTime_QNAME, XMLGregorianCalendar.class, AcmUserService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://accessuser.fee.acmws.imc.h3c.com/xsd", name = "userIp", scope = AcmUserService.class)
    public JAXBElement<String> createAcmUserServiceUserIp(String value) {
        return new JAXBElement<String>(_AcmUserServiceUserIp_QNAME, String.class, AcmUserService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://accessuser.fee.acmws.imc.h3c.com/xsd", name = "strategyName", scope = AcmUserService.class)
    public JAXBElement<String> createAcmUserServiceStrategyName(String value) {
        return new JAXBElement<String>(_AcmUserServiceStrategyName_QNAME, String.class, AcmUserService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://accessuser.fee.acmws.imc.h3c.com/xsd", name = "curCycleEndTime", scope = AcmUserService.class)
    public JAXBElement<XMLGregorianCalendar> createAcmUserServiceCurCycleEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AcmUserServiceCurCycleEndTime_QNAME, XMLGregorianCalendar.class, AcmUserService.class, value);
    }

}
