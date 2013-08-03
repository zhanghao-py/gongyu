
package com.h3c.imc.acmws.user.service.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.h3c.imc.acmws.user.service.xsd package. 
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

    private final static QName _ApplyServiceInfoServiceTemplateId_QNAME = new QName("http://service.user.acmws.imc.h3c.com/xsd", "serviceTemplateId");
    private final static QName _ApplyServiceInfoUserIpAddress_QNAME = new QName("http://service.user.acmws.imc.h3c.com/xsd", "userIpAddress");
    private final static QName _CancelServiceParamReturnCashType_QNAME = new QName("http://service.user.acmws.imc.h3c.com/xsd", "returnCashType");
    private final static QName _CancelServiceParamAccountName_QNAME = new QName("http://service.user.acmws.imc.h3c.com/xsd", "accountName");
    private final static QName _AcmServiceTemplateQueryParamServiceName_QNAME = new QName("http://service.user.acmws.imc.h3c.com/xsd", "serviceName");
    private final static QName _AcmServiceTemplateQueryParamStrategyId_QNAME = new QName("http://service.user.acmws.imc.h3c.com/xsd", "strategyId");
    private final static QName _AcmServiceTemplateQueryParamSafePolicyId_QNAME = new QName("http://service.user.acmws.imc.h3c.com/xsd", "safePolicyId");
    private final static QName _AcmServiceTemplateQueryParamServiceSuffix_QNAME = new QName("http://service.user.acmws.imc.h3c.com/xsd", "serviceSuffix");
    private final static QName _AcmServiceTemplateQueryParamResultSort_QNAME = new QName("http://service.user.acmws.imc.h3c.com/xsd", "resultSort");
    private final static QName _AcmServiceTemplateQueryParamValidType_QNAME = new QName("http://service.user.acmws.imc.h3c.com/xsd", "validType");
    private final static QName _AcmServiceTemplateQueryParamResultSortType_QNAME = new QName("http://service.user.acmws.imc.h3c.com/xsd", "resultSortType");
    private final static QName _RetAcmServiceTemplateInfoType_QNAME = new QName("http://service.user.acmws.imc.h3c.com/xsd", "type");
    private final static QName _RetAcmServiceTemplateInfoAssignAddress_QNAME = new QName("http://service.user.acmws.imc.h3c.com/xsd", "assignAddress");
    private final static QName _RetAcmServiceTemplateInfoLdapPriority_QNAME = new QName("http://service.user.acmws.imc.h3c.com/xsd", "ldapPriority");
    private final static QName _RetAcmServiceTemplateInfoSafePolicy_QNAME = new QName("http://service.user.acmws.imc.h3c.com/xsd", "safePolicy");
    private final static QName _RetAcmServiceTemplateInfoServiceId_QNAME = new QName("http://service.user.acmws.imc.h3c.com/xsd", "serviceId");
    private final static QName _RetAcmServiceTemplateInfoPolicyId_QNAME = new QName("http://service.user.acmws.imc.h3c.com/xsd", "policyId");
    private final static QName _RetAcmServiceTemplateInfoServiceStatus_QNAME = new QName("http://service.user.acmws.imc.h3c.com/xsd", "serviceStatus");
    private final static QName _RetAcmServiceTemplateInfoPolicyName_QNAME = new QName("http://service.user.acmws.imc.h3c.com/xsd", "policyName");
    private final static QName _RetAcmServiceTemplateInfoServiceDesc_QNAME = new QName("http://service.user.acmws.imc.h3c.com/xsd", "serviceDesc");
    private final static QName _RetAcmServiceTemplateInfoGroupId_QNAME = new QName("http://service.user.acmws.imc.h3c.com/xsd", "groupId");
    private final static QName _RetAcmServiceTemplateInfoSafePolicyName_QNAME = new QName("http://service.user.acmws.imc.h3c.com/xsd", "safePolicyName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.h3c.imc.acmws.user.service.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetAcmServiceTemplateInfoList }
     * 
     */
    public RetAcmServiceTemplateInfoList createRetAcmServiceTemplateInfoList() {
        return new RetAcmServiceTemplateInfoList();
    }

    /**
     * Create an instance of {@link ApplyServiceInfo }
     * 
     */
    public ApplyServiceInfo createApplyServiceInfo() {
        return new ApplyServiceInfo();
    }

    /**
     * Create an instance of {@link CancelServiceParam }
     * 
     */
    public CancelServiceParam createCancelServiceParam() {
        return new CancelServiceParam();
    }

    /**
     * Create an instance of {@link RetAcmServiceTemplateInfo }
     * 
     */
    public RetAcmServiceTemplateInfo createRetAcmServiceTemplateInfo() {
        return new RetAcmServiceTemplateInfo();
    }

    /**
     * Create an instance of {@link ApplyServiceParam }
     * 
     */
    public ApplyServiceParam createApplyServiceParam() {
        return new ApplyServiceParam();
    }

    /**
     * Create an instance of {@link RetCancelServiceInfo }
     * 
     */
    public RetCancelServiceInfo createRetCancelServiceInfo() {
        return new RetCancelServiceInfo();
    }

    /**
     * Create an instance of {@link AcmServiceTemplateQueryParam }
     * 
     */
    public AcmServiceTemplateQueryParam createAcmServiceTemplateQueryParam() {
        return new AcmServiceTemplateQueryParam();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.acmws.imc.h3c.com/xsd", name = "serviceTemplateId", scope = ApplyServiceInfo.class)
    public JAXBElement<Long> createApplyServiceInfoServiceTemplateId(Long value) {
        return new JAXBElement<Long>(_ApplyServiceInfoServiceTemplateId_QNAME, Long.class, ApplyServiceInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.acmws.imc.h3c.com/xsd", name = "userIpAddress", scope = ApplyServiceInfo.class)
    public JAXBElement<String> createApplyServiceInfoUserIpAddress(String value) {
        return new JAXBElement<String>(_ApplyServiceInfoUserIpAddress_QNAME, String.class, ApplyServiceInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.acmws.imc.h3c.com/xsd", name = "returnCashType", scope = CancelServiceParam.class)
    public JAXBElement<String> createCancelServiceParamReturnCashType(String value) {
        return new JAXBElement<String>(_CancelServiceParamReturnCashType_QNAME, String.class, CancelServiceParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.acmws.imc.h3c.com/xsd", name = "accountName", scope = CancelServiceParam.class)
    public JAXBElement<String> createCancelServiceParamAccountName(String value) {
        return new JAXBElement<String>(_CancelServiceParamAccountName_QNAME, String.class, CancelServiceParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.acmws.imc.h3c.com/xsd", name = "serviceName", scope = AcmServiceTemplateQueryParam.class)
    public JAXBElement<String> createAcmServiceTemplateQueryParamServiceName(String value) {
        return new JAXBElement<String>(_AcmServiceTemplateQueryParamServiceName_QNAME, String.class, AcmServiceTemplateQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.acmws.imc.h3c.com/xsd", name = "strategyId", scope = AcmServiceTemplateQueryParam.class)
    public JAXBElement<Long> createAcmServiceTemplateQueryParamStrategyId(Long value) {
        return new JAXBElement<Long>(_AcmServiceTemplateQueryParamStrategyId_QNAME, Long.class, AcmServiceTemplateQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.acmws.imc.h3c.com/xsd", name = "safePolicyId", scope = AcmServiceTemplateQueryParam.class)
    public JAXBElement<Long> createAcmServiceTemplateQueryParamSafePolicyId(Long value) {
        return new JAXBElement<Long>(_AcmServiceTemplateQueryParamSafePolicyId_QNAME, Long.class, AcmServiceTemplateQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.acmws.imc.h3c.com/xsd", name = "serviceSuffix", scope = AcmServiceTemplateQueryParam.class)
    public JAXBElement<String> createAcmServiceTemplateQueryParamServiceSuffix(String value) {
        return new JAXBElement<String>(_AcmServiceTemplateQueryParamServiceSuffix_QNAME, String.class, AcmServiceTemplateQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.acmws.imc.h3c.com/xsd", name = "resultSort", scope = AcmServiceTemplateQueryParam.class)
    public JAXBElement<Integer> createAcmServiceTemplateQueryParamResultSort(Integer value) {
        return new JAXBElement<Integer>(_AcmServiceTemplateQueryParamResultSort_QNAME, Integer.class, AcmServiceTemplateQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.acmws.imc.h3c.com/xsd", name = "validType", scope = AcmServiceTemplateQueryParam.class)
    public JAXBElement<Integer> createAcmServiceTemplateQueryParamValidType(Integer value) {
        return new JAXBElement<Integer>(_AcmServiceTemplateQueryParamValidType_QNAME, Integer.class, AcmServiceTemplateQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.acmws.imc.h3c.com/xsd", name = "resultSortType", scope = AcmServiceTemplateQueryParam.class)
    public JAXBElement<Integer> createAcmServiceTemplateQueryParamResultSortType(Integer value) {
        return new JAXBElement<Integer>(_AcmServiceTemplateQueryParamResultSortType_QNAME, Integer.class, AcmServiceTemplateQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.acmws.imc.h3c.com/xsd", name = "serviceName", scope = RetAcmServiceTemplateInfo.class)
    public JAXBElement<String> createRetAcmServiceTemplateInfoServiceName(String value) {
        return new JAXBElement<String>(_AcmServiceTemplateQueryParamServiceName_QNAME, String.class, RetAcmServiceTemplateInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.acmws.imc.h3c.com/xsd", name = "type", scope = RetAcmServiceTemplateInfo.class)
    public JAXBElement<Integer> createRetAcmServiceTemplateInfoType(Integer value) {
        return new JAXBElement<Integer>(_RetAcmServiceTemplateInfoType_QNAME, Integer.class, RetAcmServiceTemplateInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.acmws.imc.h3c.com/xsd", name = "assignAddress", scope = RetAcmServiceTemplateInfo.class)
    public JAXBElement<Integer> createRetAcmServiceTemplateInfoAssignAddress(Integer value) {
        return new JAXBElement<Integer>(_RetAcmServiceTemplateInfoAssignAddress_QNAME, Integer.class, RetAcmServiceTemplateInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.acmws.imc.h3c.com/xsd", name = "ldapPriority", scope = RetAcmServiceTemplateInfo.class)
    public JAXBElement<Integer> createRetAcmServiceTemplateInfoLdapPriority(Integer value) {
        return new JAXBElement<Integer>(_RetAcmServiceTemplateInfoLdapPriority_QNAME, Integer.class, RetAcmServiceTemplateInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.acmws.imc.h3c.com/xsd", name = "safePolicy", scope = RetAcmServiceTemplateInfo.class)
    public JAXBElement<Long> createRetAcmServiceTemplateInfoSafePolicy(Long value) {
        return new JAXBElement<Long>(_RetAcmServiceTemplateInfoSafePolicy_QNAME, Long.class, RetAcmServiceTemplateInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.acmws.imc.h3c.com/xsd", name = "serviceSuffix", scope = RetAcmServiceTemplateInfo.class)
    public JAXBElement<String> createRetAcmServiceTemplateInfoServiceSuffix(String value) {
        return new JAXBElement<String>(_AcmServiceTemplateQueryParamServiceSuffix_QNAME, String.class, RetAcmServiceTemplateInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.acmws.imc.h3c.com/xsd", name = "serviceId", scope = RetAcmServiceTemplateInfo.class)
    public JAXBElement<Long> createRetAcmServiceTemplateInfoServiceId(Long value) {
        return new JAXBElement<Long>(_RetAcmServiceTemplateInfoServiceId_QNAME, Long.class, RetAcmServiceTemplateInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.acmws.imc.h3c.com/xsd", name = "policyId", scope = RetAcmServiceTemplateInfo.class)
    public JAXBElement<Long> createRetAcmServiceTemplateInfoPolicyId(Long value) {
        return new JAXBElement<Long>(_RetAcmServiceTemplateInfoPolicyId_QNAME, Long.class, RetAcmServiceTemplateInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.acmws.imc.h3c.com/xsd", name = "serviceStatus", scope = RetAcmServiceTemplateInfo.class)
    public JAXBElement<Integer> createRetAcmServiceTemplateInfoServiceStatus(Integer value) {
        return new JAXBElement<Integer>(_RetAcmServiceTemplateInfoServiceStatus_QNAME, Integer.class, RetAcmServiceTemplateInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.acmws.imc.h3c.com/xsd", name = "policyName", scope = RetAcmServiceTemplateInfo.class)
    public JAXBElement<String> createRetAcmServiceTemplateInfoPolicyName(String value) {
        return new JAXBElement<String>(_RetAcmServiceTemplateInfoPolicyName_QNAME, String.class, RetAcmServiceTemplateInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.acmws.imc.h3c.com/xsd", name = "serviceDesc", scope = RetAcmServiceTemplateInfo.class)
    public JAXBElement<String> createRetAcmServiceTemplateInfoServiceDesc(String value) {
        return new JAXBElement<String>(_RetAcmServiceTemplateInfoServiceDesc_QNAME, String.class, RetAcmServiceTemplateInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.acmws.imc.h3c.com/xsd", name = "groupId", scope = RetAcmServiceTemplateInfo.class)
    public JAXBElement<Long> createRetAcmServiceTemplateInfoGroupId(Long value) {
        return new JAXBElement<Long>(_RetAcmServiceTemplateInfoGroupId_QNAME, Long.class, RetAcmServiceTemplateInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.acmws.imc.h3c.com/xsd", name = "safePolicyName", scope = RetAcmServiceTemplateInfo.class)
    public JAXBElement<String> createRetAcmServiceTemplateInfoSafePolicyName(String value) {
        return new JAXBElement<String>(_RetAcmServiceTemplateInfoSafePolicyName_QNAME, String.class, RetAcmServiceTemplateInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.user.acmws.imc.h3c.com/xsd", name = "accountName", scope = ApplyServiceParam.class)
    public JAXBElement<String> createApplyServiceParamAccountName(String value) {
        return new JAXBElement<String>(_CancelServiceParamAccountName_QNAME, String.class, ApplyServiceParam.class, value);
    }

}
