
package com.h3c.imc.acmws.fee.bill.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.h3c.imc.acmws.fee.bill.xsd package. 
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

    private final static QName _AcmBillDetailSimpleInfoFeeSessionId_QNAME = new QName("http://bill.fee.acmws.imc.h3c.com/xsd", "feeSessionId");
    private final static QName _AcmBillDetailSimpleInfoAccessStartTime_QNAME = new QName("http://bill.fee.acmws.imc.h3c.com/xsd", "accessStartTime");
    private final static QName _AcmBillDetailSimpleInfoOutfluxByte_QNAME = new QName("http://bill.fee.acmws.imc.h3c.com/xsd", "outfluxByte");
    private final static QName _AcmBillDetailSimpleInfoAccessEndTime_QNAME = new QName("http://bill.fee.acmws.imc.h3c.com/xsd", "accessEndTime");
    private final static QName _AcmBillDetailSimpleInfoBonusCash_QNAME = new QName("http://bill.fee.acmws.imc.h3c.com/xsd", "bonusCash");
    private final static QName _AcmBillDetailSimpleInfoInfluxByte_QNAME = new QName("http://bill.fee.acmws.imc.h3c.com/xsd", "influxByte");
    private final static QName _AcmBillDetailSimpleInfoUsedCash_QNAME = new QName("http://bill.fee.acmws.imc.h3c.com/xsd", "usedCash");
    private final static QName _AcmBillDetailSimpleInfoAccessSessionTime_QNAME = new QName("http://bill.fee.acmws.imc.h3c.com/xsd", "accessSessionTime");
    private final static QName _AcmBillDetailSimpleInfoUsedBonusCash_QNAME = new QName("http://bill.fee.acmws.imc.h3c.com/xsd", "usedBonusCash");
    private final static QName _AcmUserBillSimpleInfoUserName_QNAME = new QName("http://bill.fee.acmws.imc.h3c.com/xsd", "userName");
    private final static QName _AcmUserBillSimpleInfoBillID_QNAME = new QName("http://bill.fee.acmws.imc.h3c.com/xsd", "billID");
    private final static QName _AcmUserBillSimpleInfoFixedAmount_QNAME = new QName("http://bill.fee.acmws.imc.h3c.com/xsd", "fixedAmount");
    private final static QName _AcmUserBillSimpleInfoUsageUnit_QNAME = new QName("http://bill.fee.acmws.imc.h3c.com/xsd", "usageUnit");
    private final static QName _AcmUserBillSimpleInfoUsedAmount_QNAME = new QName("http://bill.fee.acmws.imc.h3c.com/xsd", "usedAmount");
    private final static QName _AcmUserBillSimpleInfoBillTime_QNAME = new QName("http://bill.fee.acmws.imc.h3c.com/xsd", "billTime");
    private final static QName _AcmUserBillSimpleInfoStartTime_QNAME = new QName("http://bill.fee.acmws.imc.h3c.com/xsd", "startTime");
    private final static QName _AcmUserBillSimpleInfoServiceName_QNAME = new QName("http://bill.fee.acmws.imc.h3c.com/xsd", "serviceName");
    private final static QName _AcmUserBillSimpleInfoEndTime_QNAME = new QName("http://bill.fee.acmws.imc.h3c.com/xsd", "endTime");
    private final static QName _AcmUserBillSimpleInfoServiceType_QNAME = new QName("http://bill.fee.acmws.imc.h3c.com/xsd", "serviceType");
    private final static QName _AcmUserBillSimpleInfoBillStatus_QNAME = new QName("http://bill.fee.acmws.imc.h3c.com/xsd", "billStatus");
    private final static QName _AcmUserBillSimpleInfoBillType_QNAME = new QName("http://bill.fee.acmws.imc.h3c.com/xsd", "billType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.h3c.imc.acmws.fee.bill.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetAcmBillDetailList }
     * 
     */
    public RetAcmBillDetailList createRetAcmBillDetailList() {
        return new RetAcmBillDetailList();
    }

    /**
     * Create an instance of {@link AcmUserBillSimpleInfo }
     * 
     */
    public AcmUserBillSimpleInfo createAcmUserBillSimpleInfo() {
        return new AcmUserBillSimpleInfo();
    }

    /**
     * Create an instance of {@link RetAcmUserBillList }
     * 
     */
    public RetAcmUserBillList createRetAcmUserBillList() {
        return new RetAcmUserBillList();
    }

    /**
     * Create an instance of {@link AcmBillDetailSimpleInfo }
     * 
     */
    public AcmBillDetailSimpleInfo createAcmBillDetailSimpleInfo() {
        return new AcmBillDetailSimpleInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", name = "feeSessionId", scope = AcmBillDetailSimpleInfo.class)
    public JAXBElement<String> createAcmBillDetailSimpleInfoFeeSessionId(String value) {
        return new JAXBElement<String>(_AcmBillDetailSimpleInfoFeeSessionId_QNAME, String.class, AcmBillDetailSimpleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", name = "accessStartTime", scope = AcmBillDetailSimpleInfo.class)
    public JAXBElement<XMLGregorianCalendar> createAcmBillDetailSimpleInfoAccessStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AcmBillDetailSimpleInfoAccessStartTime_QNAME, XMLGregorianCalendar.class, AcmBillDetailSimpleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", name = "outfluxByte", scope = AcmBillDetailSimpleInfo.class)
    public JAXBElement<Long> createAcmBillDetailSimpleInfoOutfluxByte(Long value) {
        return new JAXBElement<Long>(_AcmBillDetailSimpleInfoOutfluxByte_QNAME, Long.class, AcmBillDetailSimpleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", name = "accessEndTime", scope = AcmBillDetailSimpleInfo.class)
    public JAXBElement<XMLGregorianCalendar> createAcmBillDetailSimpleInfoAccessEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AcmBillDetailSimpleInfoAccessEndTime_QNAME, XMLGregorianCalendar.class, AcmBillDetailSimpleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", name = "bonusCash", scope = AcmBillDetailSimpleInfo.class)
    public JAXBElement<Double> createAcmBillDetailSimpleInfoBonusCash(Double value) {
        return new JAXBElement<Double>(_AcmBillDetailSimpleInfoBonusCash_QNAME, Double.class, AcmBillDetailSimpleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", name = "influxByte", scope = AcmBillDetailSimpleInfo.class)
    public JAXBElement<Long> createAcmBillDetailSimpleInfoInfluxByte(Long value) {
        return new JAXBElement<Long>(_AcmBillDetailSimpleInfoInfluxByte_QNAME, Long.class, AcmBillDetailSimpleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", name = "usedCash", scope = AcmBillDetailSimpleInfo.class)
    public JAXBElement<Double> createAcmBillDetailSimpleInfoUsedCash(Double value) {
        return new JAXBElement<Double>(_AcmBillDetailSimpleInfoUsedCash_QNAME, Double.class, AcmBillDetailSimpleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", name = "accessSessionTime", scope = AcmBillDetailSimpleInfo.class)
    public JAXBElement<Long> createAcmBillDetailSimpleInfoAccessSessionTime(Long value) {
        return new JAXBElement<Long>(_AcmBillDetailSimpleInfoAccessSessionTime_QNAME, Long.class, AcmBillDetailSimpleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", name = "usedBonusCash", scope = AcmBillDetailSimpleInfo.class)
    public JAXBElement<Double> createAcmBillDetailSimpleInfoUsedBonusCash(Double value) {
        return new JAXBElement<Double>(_AcmBillDetailSimpleInfoUsedBonusCash_QNAME, Double.class, AcmBillDetailSimpleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", name = "userName", scope = AcmUserBillSimpleInfo.class)
    public JAXBElement<String> createAcmUserBillSimpleInfoUserName(String value) {
        return new JAXBElement<String>(_AcmUserBillSimpleInfoUserName_QNAME, String.class, AcmUserBillSimpleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", name = "bonusCash", scope = AcmUserBillSimpleInfo.class)
    public JAXBElement<Double> createAcmUserBillSimpleInfoBonusCash(Double value) {
        return new JAXBElement<Double>(_AcmBillDetailSimpleInfoBonusCash_QNAME, Double.class, AcmUserBillSimpleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", name = "billID", scope = AcmUserBillSimpleInfo.class)
    public JAXBElement<Long> createAcmUserBillSimpleInfoBillID(Long value) {
        return new JAXBElement<Long>(_AcmUserBillSimpleInfoBillID_QNAME, Long.class, AcmUserBillSimpleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", name = "fixedAmount", scope = AcmUserBillSimpleInfo.class)
    public JAXBElement<Double> createAcmUserBillSimpleInfoFixedAmount(Double value) {
        return new JAXBElement<Double>(_AcmUserBillSimpleInfoFixedAmount_QNAME, Double.class, AcmUserBillSimpleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", name = "usageUnit", scope = AcmUserBillSimpleInfo.class)
    public JAXBElement<Integer> createAcmUserBillSimpleInfoUsageUnit(Integer value) {
        return new JAXBElement<Integer>(_AcmUserBillSimpleInfoUsageUnit_QNAME, Integer.class, AcmUserBillSimpleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", name = "usedAmount", scope = AcmUserBillSimpleInfo.class)
    public JAXBElement<Long> createAcmUserBillSimpleInfoUsedAmount(Long value) {
        return new JAXBElement<Long>(_AcmUserBillSimpleInfoUsedAmount_QNAME, Long.class, AcmUserBillSimpleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", name = "billTime", scope = AcmUserBillSimpleInfo.class)
    public JAXBElement<XMLGregorianCalendar> createAcmUserBillSimpleInfoBillTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AcmUserBillSimpleInfoBillTime_QNAME, XMLGregorianCalendar.class, AcmUserBillSimpleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", name = "startTime", scope = AcmUserBillSimpleInfo.class)
    public JAXBElement<XMLGregorianCalendar> createAcmUserBillSimpleInfoStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AcmUserBillSimpleInfoStartTime_QNAME, XMLGregorianCalendar.class, AcmUserBillSimpleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", name = "serviceName", scope = AcmUserBillSimpleInfo.class)
    public JAXBElement<String> createAcmUserBillSimpleInfoServiceName(String value) {
        return new JAXBElement<String>(_AcmUserBillSimpleInfoServiceName_QNAME, String.class, AcmUserBillSimpleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", name = "endTime", scope = AcmUserBillSimpleInfo.class)
    public JAXBElement<XMLGregorianCalendar> createAcmUserBillSimpleInfoEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AcmUserBillSimpleInfoEndTime_QNAME, XMLGregorianCalendar.class, AcmUserBillSimpleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", name = "serviceType", scope = AcmUserBillSimpleInfo.class)
    public JAXBElement<Integer> createAcmUserBillSimpleInfoServiceType(Integer value) {
        return new JAXBElement<Integer>(_AcmUserBillSimpleInfoServiceType_QNAME, Integer.class, AcmUserBillSimpleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", name = "billStatus", scope = AcmUserBillSimpleInfo.class)
    public JAXBElement<Integer> createAcmUserBillSimpleInfoBillStatus(Integer value) {
        return new JAXBElement<Integer>(_AcmUserBillSimpleInfoBillStatus_QNAME, Integer.class, AcmUserBillSimpleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", name = "usedCash", scope = AcmUserBillSimpleInfo.class)
    public JAXBElement<Double> createAcmUserBillSimpleInfoUsedCash(Double value) {
        return new JAXBElement<Double>(_AcmBillDetailSimpleInfoUsedCash_QNAME, Double.class, AcmUserBillSimpleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", name = "usedBonusCash", scope = AcmUserBillSimpleInfo.class)
    public JAXBElement<Double> createAcmUserBillSimpleInfoUsedBonusCash(Double value) {
        return new JAXBElement<Double>(_AcmBillDetailSimpleInfoUsedBonusCash_QNAME, Double.class, AcmUserBillSimpleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", name = "billType", scope = AcmUserBillSimpleInfo.class)
    public JAXBElement<Integer> createAcmUserBillSimpleInfoBillType(Integer value) {
        return new JAXBElement<Integer>(_AcmUserBillSimpleInfoBillType_QNAME, Integer.class, AcmUserBillSimpleInfo.class, value);
    }

}
