
package com.h3c.imc.acmws.fee.paymentrecord.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.h3c.imc.acmws.fee.paymentrecord.xsd package. 
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

    private final static QName _PaymentRecordInfoOperator_QNAME = new QName("http://paymentRecord.fee.acmws.imc.h3c.com/xsd", "operator");
    private final static QName _PaymentRecordInfoFlowId_QNAME = new QName("http://paymentRecord.fee.acmws.imc.h3c.com/xsd", "flowId");
    private final static QName _PaymentRecordInfoLastBalance_QNAME = new QName("http://paymentRecord.fee.acmws.imc.h3c.com/xsd", "lastBalance");
    private final static QName _PaymentRecordInfoFullName_QNAME = new QName("http://paymentRecord.fee.acmws.imc.h3c.com/xsd", "fullName");
    private final static QName _PaymentRecordInfoFeeType_QNAME = new QName("http://paymentRecord.fee.acmws.imc.h3c.com/xsd", "feeType");
    private final static QName _PaymentRecordInfoUserName_QNAME = new QName("http://paymentRecord.fee.acmws.imc.h3c.com/xsd", "userName");
    private final static QName _PaymentRecordInfoOperatorLoginIp_QNAME = new QName("http://paymentRecord.fee.acmws.imc.h3c.com/xsd", "operatorLoginIp");
    private final static QName _PaymentRecordInfoPaymentID_QNAME = new QName("http://paymentRecord.fee.acmws.imc.h3c.com/xsd", "paymentID");
    private final static QName _PaymentRecordInfoPayAmount_QNAME = new QName("http://paymentRecord.fee.acmws.imc.h3c.com/xsd", "payAmount");
    private final static QName _PaymentRecordInfoPaymentMode_QNAME = new QName("http://paymentRecord.fee.acmws.imc.h3c.com/xsd", "paymentMode");
    private final static QName _PaymentRecordInfoPaymentDate_QNAME = new QName("http://paymentRecord.fee.acmws.imc.h3c.com/xsd", "paymentDate");
    private final static QName _PaymentRecordInfoBalance_QNAME = new QName("http://paymentRecord.fee.acmws.imc.h3c.com/xsd", "balance");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.h3c.imc.acmws.fee.paymentrecord.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetPaymentRecordList }
     * 
     */
    public RetPaymentRecordList createRetPaymentRecordList() {
        return new RetPaymentRecordList();
    }

    /**
     * Create an instance of {@link PaymentRecordInfo }
     * 
     */
    public PaymentRecordInfo createPaymentRecordInfo() {
        return new PaymentRecordInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paymentRecord.fee.acmws.imc.h3c.com/xsd", name = "operator", scope = PaymentRecordInfo.class)
    public JAXBElement<String> createPaymentRecordInfoOperator(String value) {
        return new JAXBElement<String>(_PaymentRecordInfoOperator_QNAME, String.class, PaymentRecordInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paymentRecord.fee.acmws.imc.h3c.com/xsd", name = "flowId", scope = PaymentRecordInfo.class)
    public JAXBElement<Long> createPaymentRecordInfoFlowId(Long value) {
        return new JAXBElement<Long>(_PaymentRecordInfoFlowId_QNAME, Long.class, PaymentRecordInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paymentRecord.fee.acmws.imc.h3c.com/xsd", name = "lastBalance", scope = PaymentRecordInfo.class)
    public JAXBElement<Double> createPaymentRecordInfoLastBalance(Double value) {
        return new JAXBElement<Double>(_PaymentRecordInfoLastBalance_QNAME, Double.class, PaymentRecordInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paymentRecord.fee.acmws.imc.h3c.com/xsd", name = "fullName", scope = PaymentRecordInfo.class)
    public JAXBElement<String> createPaymentRecordInfoFullName(String value) {
        return new JAXBElement<String>(_PaymentRecordInfoFullName_QNAME, String.class, PaymentRecordInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paymentRecord.fee.acmws.imc.h3c.com/xsd", name = "feeType", scope = PaymentRecordInfo.class)
    public JAXBElement<Integer> createPaymentRecordInfoFeeType(Integer value) {
        return new JAXBElement<Integer>(_PaymentRecordInfoFeeType_QNAME, Integer.class, PaymentRecordInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paymentRecord.fee.acmws.imc.h3c.com/xsd", name = "userName", scope = PaymentRecordInfo.class)
    public JAXBElement<String> createPaymentRecordInfoUserName(String value) {
        return new JAXBElement<String>(_PaymentRecordInfoUserName_QNAME, String.class, PaymentRecordInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paymentRecord.fee.acmws.imc.h3c.com/xsd", name = "operatorLoginIp", scope = PaymentRecordInfo.class)
    public JAXBElement<String> createPaymentRecordInfoOperatorLoginIp(String value) {
        return new JAXBElement<String>(_PaymentRecordInfoOperatorLoginIp_QNAME, String.class, PaymentRecordInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paymentRecord.fee.acmws.imc.h3c.com/xsd", name = "paymentID", scope = PaymentRecordInfo.class)
    public JAXBElement<Long> createPaymentRecordInfoPaymentID(Long value) {
        return new JAXBElement<Long>(_PaymentRecordInfoPaymentID_QNAME, Long.class, PaymentRecordInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paymentRecord.fee.acmws.imc.h3c.com/xsd", name = "payAmount", scope = PaymentRecordInfo.class)
    public JAXBElement<Double> createPaymentRecordInfoPayAmount(Double value) {
        return new JAXBElement<Double>(_PaymentRecordInfoPayAmount_QNAME, Double.class, PaymentRecordInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paymentRecord.fee.acmws.imc.h3c.com/xsd", name = "paymentMode", scope = PaymentRecordInfo.class)
    public JAXBElement<Integer> createPaymentRecordInfoPaymentMode(Integer value) {
        return new JAXBElement<Integer>(_PaymentRecordInfoPaymentMode_QNAME, Integer.class, PaymentRecordInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paymentRecord.fee.acmws.imc.h3c.com/xsd", name = "paymentDate", scope = PaymentRecordInfo.class)
    public JAXBElement<XMLGregorianCalendar> createPaymentRecordInfoPaymentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PaymentRecordInfoPaymentDate_QNAME, XMLGregorianCalendar.class, PaymentRecordInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paymentRecord.fee.acmws.imc.h3c.com/xsd", name = "balance", scope = PaymentRecordInfo.class)
    public JAXBElement<Double> createPaymentRecordInfoBalance(Double value) {
        return new JAXBElement<Double>(_PaymentRecordInfoBalance_QNAME, Double.class, PaymentRecordInfo.class, value);
    }

}
