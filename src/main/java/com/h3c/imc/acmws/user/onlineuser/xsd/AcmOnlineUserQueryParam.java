
package com.h3c.imc.acmws.user.onlineuser.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>AcmOnlineUserQueryParam complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AcmOnlineUserQueryParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="boundDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="computerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceEndIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceStartIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="innerVlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="loginEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="loginStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="logonDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outerVlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="resultCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="resultIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="resultSort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="resultSortType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="securityStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="serviceID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="suspendDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userEndIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userMac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userSsid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userStartIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcmOnlineUserQueryParam", propOrder = {
    "accountName",
    "boundDomain",
    "clientLanguage",
    "clientVersion",
    "computerName",
    "deviceEndIp",
    "deviceStartIp",
    "fullName",
    "innerVlanId",
    "loginEndTime",
    "loginStartTime",
    "logonDomain",
    "outerVlanId",
    "port",
    "resultCount",
    "resultIndex",
    "resultSort",
    "resultSortType",
    "securityStatus",
    "serviceID",
    "suspendDuration",
    "userEndIp",
    "userGroupId",
    "userMac",
    "userSsid",
    "userStartIp"
})
public class AcmOnlineUserQueryParam {

    @XmlElementRef(name = "accountName", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> accountName;
    @XmlElementRef(name = "boundDomain", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> boundDomain;
    @XmlElementRef(name = "clientLanguage", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> clientLanguage;
    @XmlElementRef(name = "clientVersion", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> clientVersion;
    @XmlElementRef(name = "computerName", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> computerName;
    @XmlElementRef(name = "deviceEndIp", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> deviceEndIp;
    @XmlElementRef(name = "deviceStartIp", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> deviceStartIp;
    @XmlElementRef(name = "fullName", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> fullName;
    @XmlElementRef(name = "innerVlanId", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> innerVlanId;
    @XmlElementRef(name = "loginEndTime", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> loginEndTime;
    @XmlElementRef(name = "loginStartTime", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> loginStartTime;
    @XmlElementRef(name = "logonDomain", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> logonDomain;
    @XmlElementRef(name = "outerVlanId", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> outerVlanId;
    @XmlElementRef(name = "port", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> port;
    @XmlElementRef(name = "resultCount", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> resultCount;
    @XmlElementRef(name = "resultIndex", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> resultIndex;
    @XmlElementRef(name = "resultSort", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> resultSort;
    @XmlElementRef(name = "resultSortType", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> resultSortType;
    @XmlElementRef(name = "securityStatus", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> securityStatus;
    @XmlElementRef(name = "serviceID", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> serviceID;
    @XmlElementRef(name = "suspendDuration", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> suspendDuration;
    @XmlElementRef(name = "userEndIp", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> userEndIp;
    @XmlElementRef(name = "userGroupId", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> userGroupId;
    @XmlElementRef(name = "userMac", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> userMac;
    @XmlElementRef(name = "userSsid", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> userSsid;
    @XmlElementRef(name = "userStartIp", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> userStartIp;

    /**
     * 获取accountName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountName() {
        return accountName;
    }

    /**
     * 设置accountName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountName(JAXBElement<String> value) {
        this.accountName = value;
    }

    /**
     * 获取boundDomain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBoundDomain() {
        return boundDomain;
    }

    /**
     * 设置boundDomain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBoundDomain(JAXBElement<String> value) {
        this.boundDomain = value;
    }

    /**
     * 获取clientLanguage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientLanguage() {
        return clientLanguage;
    }

    /**
     * 设置clientLanguage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientLanguage(JAXBElement<String> value) {
        this.clientLanguage = value;
    }

    /**
     * 获取clientVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientVersion() {
        return clientVersion;
    }

    /**
     * 设置clientVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientVersion(JAXBElement<String> value) {
        this.clientVersion = value;
    }

    /**
     * 获取computerName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComputerName() {
        return computerName;
    }

    /**
     * 设置computerName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComputerName(JAXBElement<String> value) {
        this.computerName = value;
    }

    /**
     * 获取deviceEndIp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeviceEndIp() {
        return deviceEndIp;
    }

    /**
     * 设置deviceEndIp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeviceEndIp(JAXBElement<String> value) {
        this.deviceEndIp = value;
    }

    /**
     * 获取deviceStartIp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeviceStartIp() {
        return deviceStartIp;
    }

    /**
     * 设置deviceStartIp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeviceStartIp(JAXBElement<String> value) {
        this.deviceStartIp = value;
    }

    /**
     * 获取fullName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFullName() {
        return fullName;
    }

    /**
     * 设置fullName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFullName(JAXBElement<String> value) {
        this.fullName = value;
    }

    /**
     * 获取innerVlanId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInnerVlanId() {
        return innerVlanId;
    }

    /**
     * 设置innerVlanId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInnerVlanId(JAXBElement<Integer> value) {
        this.innerVlanId = value;
    }

    /**
     * 获取loginEndTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLoginEndTime() {
        return loginEndTime;
    }

    /**
     * 设置loginEndTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLoginEndTime(JAXBElement<XMLGregorianCalendar> value) {
        this.loginEndTime = value;
    }

    /**
     * 获取loginStartTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLoginStartTime() {
        return loginStartTime;
    }

    /**
     * 设置loginStartTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLoginStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.loginStartTime = value;
    }

    /**
     * 获取logonDomain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLogonDomain() {
        return logonDomain;
    }

    /**
     * 设置logonDomain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLogonDomain(JAXBElement<String> value) {
        this.logonDomain = value;
    }

    /**
     * 获取outerVlanId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOuterVlanId() {
        return outerVlanId;
    }

    /**
     * 设置outerVlanId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOuterVlanId(JAXBElement<Integer> value) {
        this.outerVlanId = value;
    }

    /**
     * 获取port属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPort() {
        return port;
    }

    /**
     * 设置port属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPort(JAXBElement<Integer> value) {
        this.port = value;
    }

    /**
     * 获取resultCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getResultCount() {
        return resultCount;
    }

    /**
     * 设置resultCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setResultCount(JAXBElement<Integer> value) {
        this.resultCount = value;
    }

    /**
     * 获取resultIndex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getResultIndex() {
        return resultIndex;
    }

    /**
     * 设置resultIndex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setResultIndex(JAXBElement<Integer> value) {
        this.resultIndex = value;
    }

    /**
     * 获取resultSort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getResultSort() {
        return resultSort;
    }

    /**
     * 设置resultSort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setResultSort(JAXBElement<Integer> value) {
        this.resultSort = value;
    }

    /**
     * 获取resultSortType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getResultSortType() {
        return resultSortType;
    }

    /**
     * 设置resultSortType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setResultSortType(JAXBElement<Integer> value) {
        this.resultSortType = value;
    }

    /**
     * 获取securityStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSecurityStatus() {
        return securityStatus;
    }

    /**
     * 设置securityStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSecurityStatus(JAXBElement<Integer> value) {
        this.securityStatus = value;
    }

    /**
     * 获取serviceID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getServiceID() {
        return serviceID;
    }

    /**
     * 设置serviceID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setServiceID(JAXBElement<Long> value) {
        this.serviceID = value;
    }

    /**
     * 获取suspendDuration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSuspendDuration() {
        return suspendDuration;
    }

    /**
     * 设置suspendDuration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSuspendDuration(JAXBElement<Integer> value) {
        this.suspendDuration = value;
    }

    /**
     * 获取userEndIp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserEndIp() {
        return userEndIp;
    }

    /**
     * 设置userEndIp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserEndIp(JAXBElement<String> value) {
        this.userEndIp = value;
    }

    /**
     * 获取userGroupId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getUserGroupId() {
        return userGroupId;
    }

    /**
     * 设置userGroupId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setUserGroupId(JAXBElement<Long> value) {
        this.userGroupId = value;
    }

    /**
     * 获取userMac属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserMac() {
        return userMac;
    }

    /**
     * 设置userMac属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserMac(JAXBElement<String> value) {
        this.userMac = value;
    }

    /**
     * 获取userSsid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserSsid() {
        return userSsid;
    }

    /**
     * 设置userSsid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserSsid(JAXBElement<String> value) {
        this.userSsid = value;
    }

    /**
     * 获取userStartIp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserStartIp() {
        return userStartIp;
    }

    /**
     * 设置userStartIp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserStartIp(JAXBElement<String> value) {
        this.userStartIp = value;
    }

}
