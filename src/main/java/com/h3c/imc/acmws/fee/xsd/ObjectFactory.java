
package com.h3c.imc.acmws.fee.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.h3c.imc.acmws.fee.xsd package. 
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

    private final static QName _PaymentInfoCardNo_QNAME = new QName("http://fee.acmws.imc.h3c.com/xsd", "cardNo");
    private final static QName _PaymentInfoAmount_QNAME = new QName("http://fee.acmws.imc.h3c.com/xsd", "amount");
    private final static QName _PaymentInfoClientIp_QNAME = new QName("http://fee.acmws.imc.h3c.com/xsd", "clientIp");
    private final static QName _PaymentInfoUserName_QNAME = new QName("http://fee.acmws.imc.h3c.com/xsd", "userName");
    private final static QName _PaymentInfoUserPassword_QNAME = new QName("http://fee.acmws.imc.h3c.com/xsd", "userPassword");
    private final static QName _RandomInfoRandom_QNAME = new QName("http://fee.acmws.imc.h3c.com/xsd", "random");
    private final static QName _RetUserBalanceBalance_QNAME = new QName("http://fee.acmws.imc.h3c.com/xsd", "balance");
    private final static QName _SelfPaymentInfoCardNum_QNAME = new QName("http://fee.acmws.imc.h3c.com/xsd", "cardNum");
    private final static QName _SelfPaymentInfoCardPassword_QNAME = new QName("http://fee.acmws.imc.h3c.com/xsd", "cardPassword");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.h3c.imc.acmws.fee.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetUserBalance }
     * 
     */
    public RetUserBalance createRetUserBalance() {
        return new RetUserBalance();
    }

    /**
     * Create an instance of {@link RandomInfo }
     * 
     */
    public RandomInfo createRandomInfo() {
        return new RandomInfo();
    }

    /**
     * Create an instance of {@link SelfPaymentInfo }
     * 
     */
    public SelfPaymentInfo createSelfPaymentInfo() {
        return new SelfPaymentInfo();
    }

    /**
     * Create an instance of {@link PaymentInfo }
     * 
     */
    public PaymentInfo createPaymentInfo() {
        return new PaymentInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fee.acmws.imc.h3c.com/xsd", name = "cardNo", scope = PaymentInfo.class)
    public JAXBElement<String> createPaymentInfoCardNo(String value) {
        return new JAXBElement<String>(_PaymentInfoCardNo_QNAME, String.class, PaymentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fee.acmws.imc.h3c.com/xsd", name = "amount", scope = PaymentInfo.class)
    public JAXBElement<String> createPaymentInfoAmount(String value) {
        return new JAXBElement<String>(_PaymentInfoAmount_QNAME, String.class, PaymentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fee.acmws.imc.h3c.com/xsd", name = "clientIp", scope = PaymentInfo.class)
    public JAXBElement<String> createPaymentInfoClientIp(String value) {
        return new JAXBElement<String>(_PaymentInfoClientIp_QNAME, String.class, PaymentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fee.acmws.imc.h3c.com/xsd", name = "userName", scope = PaymentInfo.class)
    public JAXBElement<String> createPaymentInfoUserName(String value) {
        return new JAXBElement<String>(_PaymentInfoUserName_QNAME, String.class, PaymentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fee.acmws.imc.h3c.com/xsd", name = "userPassword", scope = PaymentInfo.class)
    public JAXBElement<String> createPaymentInfoUserPassword(String value) {
        return new JAXBElement<String>(_PaymentInfoUserPassword_QNAME, String.class, PaymentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fee.acmws.imc.h3c.com/xsd", name = "random", scope = RandomInfo.class)
    public JAXBElement<String> createRandomInfoRandom(String value) {
        return new JAXBElement<String>(_RandomInfoRandom_QNAME, String.class, RandomInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fee.acmws.imc.h3c.com/xsd", name = "balance", scope = RetUserBalance.class)
    public JAXBElement<String> createRetUserBalanceBalance(String value) {
        return new JAXBElement<String>(_RetUserBalanceBalance_QNAME, String.class, RetUserBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fee.acmws.imc.h3c.com/xsd", name = "userName", scope = SelfPaymentInfo.class)
    public JAXBElement<String> createSelfPaymentInfoUserName(String value) {
        return new JAXBElement<String>(_PaymentInfoUserName_QNAME, String.class, SelfPaymentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fee.acmws.imc.h3c.com/xsd", name = "cardNum", scope = SelfPaymentInfo.class)
    public JAXBElement<String> createSelfPaymentInfoCardNum(String value) {
        return new JAXBElement<String>(_SelfPaymentInfoCardNum_QNAME, String.class, SelfPaymentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fee.acmws.imc.h3c.com/xsd", name = "cardPassword", scope = SelfPaymentInfo.class)
    public JAXBElement<String> createSelfPaymentInfoCardPassword(String value) {
        return new JAXBElement<String>(_SelfPaymentInfoCardPassword_QNAME, String.class, SelfPaymentInfo.class, value);
    }

}
