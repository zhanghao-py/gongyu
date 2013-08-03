
package com.h3c.imc.acmws.user.blacklist.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.h3c.imc.acmws.user.blacklist.xsd package. 
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

    private final static QName _AcmBlackQueryParamUserEndIpAddress_QNAME = new QName("http://blacklist.user.acmws.imc.h3c.com/xsd", "userEndIpAddress");
    private final static QName _AcmBlackQueryParamResultNumber_QNAME = new QName("http://blacklist.user.acmws.imc.h3c.com/xsd", "resultNumber");
    private final static QName _AcmBlackQueryParamAccountName_QNAME = new QName("http://blacklist.user.acmws.imc.h3c.com/xsd", "accountName");
    private final static QName _AcmBlackQueryParamResultSortType_QNAME = new QName("http://blacklist.user.acmws.imc.h3c.com/xsd", "resultSortType");
    private final static QName _AcmBlackQueryParamUserMacAddress_QNAME = new QName("http://blacklist.user.acmws.imc.h3c.com/xsd", "userMacAddress");
    private final static QName _AcmBlackQueryParamStartDate_QNAME = new QName("http://blacklist.user.acmws.imc.h3c.com/xsd", "startDate");
    private final static QName _AcmBlackQueryParamUserStartIpAddress_QNAME = new QName("http://blacklist.user.acmws.imc.h3c.com/xsd", "userStartIpAddress");
    private final static QName _AcmBlackQueryParamResultIndex_QNAME = new QName("http://blacklist.user.acmws.imc.h3c.com/xsd", "resultIndex");
    private final static QName _AcmBlackQueryParamUserGroupId_QNAME = new QName("http://blacklist.user.acmws.imc.h3c.com/xsd", "userGroupId");
    private final static QName _AcmBlackQueryParamEndDate_QNAME = new QName("http://blacklist.user.acmws.imc.h3c.com/xsd", "endDate");
    private final static QName _AcmBlackQueryParamResultSort_QNAME = new QName("http://blacklist.user.acmws.imc.h3c.com/xsd", "resultSort");
    private final static QName _AcmBlackQueryParamJoinReason_QNAME = new QName("http://blacklist.user.acmws.imc.h3c.com/xsd", "joinReason");
    private final static QName _RetAcmBlackInfoNasIp_QNAME = new QName("http://blacklist.user.acmws.imc.h3c.com/xsd", "nasIp");
    private final static QName _RetAcmBlackInfoNasPort_QNAME = new QName("http://blacklist.user.acmws.imc.h3c.com/xsd", "nasPort");
    private final static QName _RetAcmBlackInfoAccountId_QNAME = new QName("http://blacklist.user.acmws.imc.h3c.com/xsd", "accountId");
    private final static QName _RetAcmBlackInfoJoinDate_QNAME = new QName("http://blacklist.user.acmws.imc.h3c.com/xsd", "joinDate");
    private final static QName _RetAcmBlackInfoUserIpAddress_QNAME = new QName("http://blacklist.user.acmws.imc.h3c.com/xsd", "userIpAddress");
    private final static QName _RetAcmBlackInfoBlackNameId_QNAME = new QName("http://blacklist.user.acmws.imc.h3c.com/xsd", "blackNameId");
    private final static QName _RetAcmBlackInfoFaultCount_QNAME = new QName("http://blacklist.user.acmws.imc.h3c.com/xsd", "faultCount");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.h3c.imc.acmws.user.blacklist.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetAcmBlackInfo }
     * 
     */
    public RetAcmBlackInfo createRetAcmBlackInfo() {
        return new RetAcmBlackInfo();
    }

    /**
     * Create an instance of {@link AcmBlackQueryParam }
     * 
     */
    public AcmBlackQueryParam createAcmBlackQueryParam() {
        return new AcmBlackQueryParam();
    }

    /**
     * Create an instance of {@link RetAcmBlackInfoList }
     * 
     */
    public RetAcmBlackInfoList createRetAcmBlackInfoList() {
        return new RetAcmBlackInfoList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", name = "userEndIpAddress", scope = AcmBlackQueryParam.class)
    public JAXBElement<String> createAcmBlackQueryParamUserEndIpAddress(String value) {
        return new JAXBElement<String>(_AcmBlackQueryParamUserEndIpAddress_QNAME, String.class, AcmBlackQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", name = "resultNumber", scope = AcmBlackQueryParam.class)
    public JAXBElement<Integer> createAcmBlackQueryParamResultNumber(Integer value) {
        return new JAXBElement<Integer>(_AcmBlackQueryParamResultNumber_QNAME, Integer.class, AcmBlackQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", name = "accountName", scope = AcmBlackQueryParam.class)
    public JAXBElement<String> createAcmBlackQueryParamAccountName(String value) {
        return new JAXBElement<String>(_AcmBlackQueryParamAccountName_QNAME, String.class, AcmBlackQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", name = "resultSortType", scope = AcmBlackQueryParam.class)
    public JAXBElement<Integer> createAcmBlackQueryParamResultSortType(Integer value) {
        return new JAXBElement<Integer>(_AcmBlackQueryParamResultSortType_QNAME, Integer.class, AcmBlackQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", name = "userMacAddress", scope = AcmBlackQueryParam.class)
    public JAXBElement<String> createAcmBlackQueryParamUserMacAddress(String value) {
        return new JAXBElement<String>(_AcmBlackQueryParamUserMacAddress_QNAME, String.class, AcmBlackQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", name = "startDate", scope = AcmBlackQueryParam.class)
    public JAXBElement<XMLGregorianCalendar> createAcmBlackQueryParamStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AcmBlackQueryParamStartDate_QNAME, XMLGregorianCalendar.class, AcmBlackQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", name = "userStartIpAddress", scope = AcmBlackQueryParam.class)
    public JAXBElement<String> createAcmBlackQueryParamUserStartIpAddress(String value) {
        return new JAXBElement<String>(_AcmBlackQueryParamUserStartIpAddress_QNAME, String.class, AcmBlackQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", name = "resultIndex", scope = AcmBlackQueryParam.class)
    public JAXBElement<Integer> createAcmBlackQueryParamResultIndex(Integer value) {
        return new JAXBElement<Integer>(_AcmBlackQueryParamResultIndex_QNAME, Integer.class, AcmBlackQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", name = "userGroupId", scope = AcmBlackQueryParam.class)
    public JAXBElement<Long> createAcmBlackQueryParamUserGroupId(Long value) {
        return new JAXBElement<Long>(_AcmBlackQueryParamUserGroupId_QNAME, Long.class, AcmBlackQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", name = "endDate", scope = AcmBlackQueryParam.class)
    public JAXBElement<XMLGregorianCalendar> createAcmBlackQueryParamEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AcmBlackQueryParamEndDate_QNAME, XMLGregorianCalendar.class, AcmBlackQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", name = "resultSort", scope = AcmBlackQueryParam.class)
    public JAXBElement<Integer> createAcmBlackQueryParamResultSort(Integer value) {
        return new JAXBElement<Integer>(_AcmBlackQueryParamResultSort_QNAME, Integer.class, AcmBlackQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", name = "joinReason", scope = AcmBlackQueryParam.class)
    public JAXBElement<Integer> createAcmBlackQueryParamJoinReason(Integer value) {
        return new JAXBElement<Integer>(_AcmBlackQueryParamJoinReason_QNAME, Integer.class, AcmBlackQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", name = "nasIp", scope = RetAcmBlackInfo.class)
    public JAXBElement<String> createRetAcmBlackInfoNasIp(String value) {
        return new JAXBElement<String>(_RetAcmBlackInfoNasIp_QNAME, String.class, RetAcmBlackInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", name = "accountName", scope = RetAcmBlackInfo.class)
    public JAXBElement<String> createRetAcmBlackInfoAccountName(String value) {
        return new JAXBElement<String>(_AcmBlackQueryParamAccountName_QNAME, String.class, RetAcmBlackInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", name = "nasPort", scope = RetAcmBlackInfo.class)
    public JAXBElement<Integer> createRetAcmBlackInfoNasPort(Integer value) {
        return new JAXBElement<Integer>(_RetAcmBlackInfoNasPort_QNAME, Integer.class, RetAcmBlackInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", name = "accountId", scope = RetAcmBlackInfo.class)
    public JAXBElement<Long> createRetAcmBlackInfoAccountId(Long value) {
        return new JAXBElement<Long>(_RetAcmBlackInfoAccountId_QNAME, Long.class, RetAcmBlackInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", name = "joinDate", scope = RetAcmBlackInfo.class)
    public JAXBElement<XMLGregorianCalendar> createRetAcmBlackInfoJoinDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RetAcmBlackInfoJoinDate_QNAME, XMLGregorianCalendar.class, RetAcmBlackInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", name = "userMacAddress", scope = RetAcmBlackInfo.class)
    public JAXBElement<String> createRetAcmBlackInfoUserMacAddress(String value) {
        return new JAXBElement<String>(_AcmBlackQueryParamUserMacAddress_QNAME, String.class, RetAcmBlackInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", name = "userIpAddress", scope = RetAcmBlackInfo.class)
    public JAXBElement<String> createRetAcmBlackInfoUserIpAddress(String value) {
        return new JAXBElement<String>(_RetAcmBlackInfoUserIpAddress_QNAME, String.class, RetAcmBlackInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", name = "blackNameId", scope = RetAcmBlackInfo.class)
    public JAXBElement<Long> createRetAcmBlackInfoBlackNameId(Long value) {
        return new JAXBElement<Long>(_RetAcmBlackInfoBlackNameId_QNAME, Long.class, RetAcmBlackInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", name = "joinReason", scope = RetAcmBlackInfo.class)
    public JAXBElement<Integer> createRetAcmBlackInfoJoinReason(Integer value) {
        return new JAXBElement<Integer>(_AcmBlackQueryParamJoinReason_QNAME, Integer.class, RetAcmBlackInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", name = "faultCount", scope = RetAcmBlackInfo.class)
    public JAXBElement<Integer> createRetAcmBlackInfoFaultCount(Integer value) {
        return new JAXBElement<Integer>(_RetAcmBlackInfoFaultCount_QNAME, Integer.class, RetAcmBlackInfo.class, value);
    }

}
