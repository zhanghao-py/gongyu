
package com.h3c.imc.acmws.user.ldap.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.h3c.imc.acmws.user.ldap.xsd package. 
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

    private final static QName _RetAcmSyncPolicyInfoPolicyName_QNAME = new QName("http://ldap.user.acmws.imc.h3c.com/xsd", "policyName");
    private final static QName _RetAcmSyncPolicyInfoPolicyId_QNAME = new QName("http://ldap.user.acmws.imc.h3c.com/xsd", "policyId");
    private final static QName _RetAcmSyncPolicyInfoConfigStatus_QNAME = new QName("http://ldap.user.acmws.imc.h3c.com/xsd", "configStatus");
    private final static QName _RetAcmSyncPolicyInfoSyncPolicyId_QNAME = new QName("http://ldap.user.acmws.imc.h3c.com/xsd", "syncPolicyId");
    private final static QName _RetAcmSyncPolicyInfoServerId_QNAME = new QName("http://ldap.user.acmws.imc.h3c.com/xsd", "serverId");
    private final static QName _RetAcmSyncPolicyInfoUserGroupId_QNAME = new QName("http://ldap.user.acmws.imc.h3c.com/xsd", "userGroupId");
    private final static QName _RetAcmSyncPolicyInfoAutoSync_QNAME = new QName("http://ldap.user.acmws.imc.h3c.com/xsd", "autoSync");
    private final static QName _RetAcmSyncPolicyInfoServerName_QNAME = new QName("http://ldap.user.acmws.imc.h3c.com/xsd", "serverName");
    private final static QName _AcmSyncPolicyUserQueryParamResultNumber_QNAME = new QName("http://ldap.user.acmws.imc.h3c.com/xsd", "resultNumber");
    private final static QName _AcmSyncPolicyUserQueryParamAccountName_QNAME = new QName("http://ldap.user.acmws.imc.h3c.com/xsd", "accountName");
    private final static QName _AcmSyncPolicyUserQueryParamResultSortType_QNAME = new QName("http://ldap.user.acmws.imc.h3c.com/xsd", "resultSortType");
    private final static QName _AcmSyncPolicyUserQueryParamResultIndex_QNAME = new QName("http://ldap.user.acmws.imc.h3c.com/xsd", "resultIndex");
    private final static QName _AcmSyncPolicyUserQueryParamResultSort_QNAME = new QName("http://ldap.user.acmws.imc.h3c.com/xsd", "resultSort");
    private final static QName _AcmSyncPolicyUserQueryParamUserStatus_QNAME = new QName("http://ldap.user.acmws.imc.h3c.com/xsd", "userStatus");
    private final static QName _RetAcmSyncPolicyUserInfoUserId_QNAME = new QName("http://ldap.user.acmws.imc.h3c.com/xsd", "userId");
    private final static QName _RetAcmSyncPolicyUserInfoStatus_QNAME = new QName("http://ldap.user.acmws.imc.h3c.com/xsd", "status");
    private final static QName _RetAcmSyncPolicyUserInfoUserName_QNAME = new QName("http://ldap.user.acmws.imc.h3c.com/xsd", "userName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.h3c.imc.acmws.user.ldap.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AcmSyncPolicyQueryParam }
     * 
     */
    public AcmSyncPolicyQueryParam createAcmSyncPolicyQueryParam() {
        return new AcmSyncPolicyQueryParam();
    }

    /**
     * Create an instance of {@link RetAcmSyncPolicyUserInfo }
     * 
     */
    public RetAcmSyncPolicyUserInfo createRetAcmSyncPolicyUserInfo() {
        return new RetAcmSyncPolicyUserInfo();
    }

    /**
     * Create an instance of {@link RetAcmSyncPolicyUserInfoList }
     * 
     */
    public RetAcmSyncPolicyUserInfoList createRetAcmSyncPolicyUserInfoList() {
        return new RetAcmSyncPolicyUserInfoList();
    }

    /**
     * Create an instance of {@link AcmSyncPolicyUserQueryParam }
     * 
     */
    public AcmSyncPolicyUserQueryParam createAcmSyncPolicyUserQueryParam() {
        return new AcmSyncPolicyUserQueryParam();
    }

    /**
     * Create an instance of {@link RetAcmSyncPolicyInfoList }
     * 
     */
    public RetAcmSyncPolicyInfoList createRetAcmSyncPolicyInfoList() {
        return new RetAcmSyncPolicyInfoList();
    }

    /**
     * Create an instance of {@link RetAcmSyncPolicyInfo }
     * 
     */
    public RetAcmSyncPolicyInfo createRetAcmSyncPolicyInfo() {
        return new RetAcmSyncPolicyInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", name = "policyName", scope = RetAcmSyncPolicyInfo.class)
    public JAXBElement<String> createRetAcmSyncPolicyInfoPolicyName(String value) {
        return new JAXBElement<String>(_RetAcmSyncPolicyInfoPolicyName_QNAME, String.class, RetAcmSyncPolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", name = "policyId", scope = RetAcmSyncPolicyInfo.class)
    public JAXBElement<Long> createRetAcmSyncPolicyInfoPolicyId(Long value) {
        return new JAXBElement<Long>(_RetAcmSyncPolicyInfoPolicyId_QNAME, Long.class, RetAcmSyncPolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", name = "configStatus", scope = RetAcmSyncPolicyInfo.class)
    public JAXBElement<Integer> createRetAcmSyncPolicyInfoConfigStatus(Integer value) {
        return new JAXBElement<Integer>(_RetAcmSyncPolicyInfoConfigStatus_QNAME, Integer.class, RetAcmSyncPolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", name = "syncPolicyId", scope = RetAcmSyncPolicyInfo.class)
    public JAXBElement<Integer> createRetAcmSyncPolicyInfoSyncPolicyId(Integer value) {
        return new JAXBElement<Integer>(_RetAcmSyncPolicyInfoSyncPolicyId_QNAME, Integer.class, RetAcmSyncPolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", name = "serverId", scope = RetAcmSyncPolicyInfo.class)
    public JAXBElement<Long> createRetAcmSyncPolicyInfoServerId(Long value) {
        return new JAXBElement<Long>(_RetAcmSyncPolicyInfoServerId_QNAME, Long.class, RetAcmSyncPolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", name = "userGroupId", scope = RetAcmSyncPolicyInfo.class)
    public JAXBElement<Long> createRetAcmSyncPolicyInfoUserGroupId(Long value) {
        return new JAXBElement<Long>(_RetAcmSyncPolicyInfoUserGroupId_QNAME, Long.class, RetAcmSyncPolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", name = "autoSync", scope = RetAcmSyncPolicyInfo.class)
    public JAXBElement<Boolean> createRetAcmSyncPolicyInfoAutoSync(Boolean value) {
        return new JAXBElement<Boolean>(_RetAcmSyncPolicyInfoAutoSync_QNAME, Boolean.class, RetAcmSyncPolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", name = "serverName", scope = RetAcmSyncPolicyInfo.class)
    public JAXBElement<String> createRetAcmSyncPolicyInfoServerName(String value) {
        return new JAXBElement<String>(_RetAcmSyncPolicyInfoServerName_QNAME, String.class, RetAcmSyncPolicyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", name = "resultNumber", scope = AcmSyncPolicyUserQueryParam.class)
    public JAXBElement<Integer> createAcmSyncPolicyUserQueryParamResultNumber(Integer value) {
        return new JAXBElement<Integer>(_AcmSyncPolicyUserQueryParamResultNumber_QNAME, Integer.class, AcmSyncPolicyUserQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", name = "accountName", scope = AcmSyncPolicyUserQueryParam.class)
    public JAXBElement<String> createAcmSyncPolicyUserQueryParamAccountName(String value) {
        return new JAXBElement<String>(_AcmSyncPolicyUserQueryParamAccountName_QNAME, String.class, AcmSyncPolicyUserQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", name = "resultSortType", scope = AcmSyncPolicyUserQueryParam.class)
    public JAXBElement<Integer> createAcmSyncPolicyUserQueryParamResultSortType(Integer value) {
        return new JAXBElement<Integer>(_AcmSyncPolicyUserQueryParamResultSortType_QNAME, Integer.class, AcmSyncPolicyUserQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", name = "resultIndex", scope = AcmSyncPolicyUserQueryParam.class)
    public JAXBElement<Integer> createAcmSyncPolicyUserQueryParamResultIndex(Integer value) {
        return new JAXBElement<Integer>(_AcmSyncPolicyUserQueryParamResultIndex_QNAME, Integer.class, AcmSyncPolicyUserQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", name = "policyId", scope = AcmSyncPolicyUserQueryParam.class)
    public JAXBElement<Long> createAcmSyncPolicyUserQueryParamPolicyId(Long value) {
        return new JAXBElement<Long>(_RetAcmSyncPolicyInfoPolicyId_QNAME, Long.class, AcmSyncPolicyUserQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", name = "serverId", scope = AcmSyncPolicyUserQueryParam.class)
    public JAXBElement<Long> createAcmSyncPolicyUserQueryParamServerId(Long value) {
        return new JAXBElement<Long>(_RetAcmSyncPolicyInfoServerId_QNAME, Long.class, AcmSyncPolicyUserQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", name = "userGroupId", scope = AcmSyncPolicyUserQueryParam.class)
    public JAXBElement<Long> createAcmSyncPolicyUserQueryParamUserGroupId(Long value) {
        return new JAXBElement<Long>(_RetAcmSyncPolicyInfoUserGroupId_QNAME, Long.class, AcmSyncPolicyUserQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", name = "resultSort", scope = AcmSyncPolicyUserQueryParam.class)
    public JAXBElement<Integer> createAcmSyncPolicyUserQueryParamResultSort(Integer value) {
        return new JAXBElement<Integer>(_AcmSyncPolicyUserQueryParamResultSort_QNAME, Integer.class, AcmSyncPolicyUserQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", name = "userStatus", scope = AcmSyncPolicyUserQueryParam.class)
    public JAXBElement<Integer> createAcmSyncPolicyUserQueryParamUserStatus(Integer value) {
        return new JAXBElement<Integer>(_AcmSyncPolicyUserQueryParamUserStatus_QNAME, Integer.class, AcmSyncPolicyUserQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", name = "accountName", scope = RetAcmSyncPolicyUserInfo.class)
    public JAXBElement<String> createRetAcmSyncPolicyUserInfoAccountName(String value) {
        return new JAXBElement<String>(_AcmSyncPolicyUserQueryParamAccountName_QNAME, String.class, RetAcmSyncPolicyUserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", name = "userId", scope = RetAcmSyncPolicyUserInfo.class)
    public JAXBElement<Long> createRetAcmSyncPolicyUserInfoUserId(Long value) {
        return new JAXBElement<Long>(_RetAcmSyncPolicyUserInfoUserId_QNAME, Long.class, RetAcmSyncPolicyUserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", name = "status", scope = RetAcmSyncPolicyUserInfo.class)
    public JAXBElement<Integer> createRetAcmSyncPolicyUserInfoStatus(Integer value) {
        return new JAXBElement<Integer>(_RetAcmSyncPolicyUserInfoStatus_QNAME, Integer.class, RetAcmSyncPolicyUserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", name = "userGroupId", scope = RetAcmSyncPolicyUserInfo.class)
    public JAXBElement<Long> createRetAcmSyncPolicyUserInfoUserGroupId(Long value) {
        return new JAXBElement<Long>(_RetAcmSyncPolicyInfoUserGroupId_QNAME, Long.class, RetAcmSyncPolicyUserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", name = "userName", scope = RetAcmSyncPolicyUserInfo.class)
    public JAXBElement<String> createRetAcmSyncPolicyUserInfoUserName(String value) {
        return new JAXBElement<String>(_RetAcmSyncPolicyUserInfoUserName_QNAME, String.class, RetAcmSyncPolicyUserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", name = "resultNumber", scope = AcmSyncPolicyQueryParam.class)
    public JAXBElement<Integer> createAcmSyncPolicyQueryParamResultNumber(Integer value) {
        return new JAXBElement<Integer>(_AcmSyncPolicyUserQueryParamResultNumber_QNAME, Integer.class, AcmSyncPolicyQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", name = "resultSortType", scope = AcmSyncPolicyQueryParam.class)
    public JAXBElement<Integer> createAcmSyncPolicyQueryParamResultSortType(Integer value) {
        return new JAXBElement<Integer>(_AcmSyncPolicyUserQueryParamResultSortType_QNAME, Integer.class, AcmSyncPolicyQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", name = "resultIndex", scope = AcmSyncPolicyQueryParam.class)
    public JAXBElement<Integer> createAcmSyncPolicyQueryParamResultIndex(Integer value) {
        return new JAXBElement<Integer>(_AcmSyncPolicyUserQueryParamResultIndex_QNAME, Integer.class, AcmSyncPolicyQueryParam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", name = "resultSort", scope = AcmSyncPolicyQueryParam.class)
    public JAXBElement<Integer> createAcmSyncPolicyQueryParamResultSort(Integer value) {
        return new JAXBElement<Integer>(_AcmSyncPolicyUserQueryParamResultSort_QNAME, Integer.class, AcmSyncPolicyQueryParam.class, value);
    }

}
