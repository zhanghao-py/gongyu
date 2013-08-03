
package com.h3c.imc.acmws.user.onlineuser.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>AcmOnlineUserSimpleInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AcmOnlineUserSimpleInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acctSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="boundDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="computerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="influxByte" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="innerVlanId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="loginDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nasSlot" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nasSubSlot" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="onlineDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="onlineUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="outerVlanId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="outfluxByte" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="proxyIpD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proxyIpS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proxyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proxyUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="securityStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userMac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcmOnlineUserSimpleInfo", propOrder = {
    "accountName",
    "acctSessionId",
    "acl",
    "boundDomain",
    "clientLanguage",
    "clientVersion",
    "computerName",
    "deviceIp",
    "fullName",
    "influxByte",
    "innerVlanId",
    "loginDomain",
    "loginName",
    "loginTime",
    "nasSlot",
    "nasSubSlot",
    "onlineDuration",
    "onlineUserId",
    "outerVlanId",
    "outfluxByte",
    "port",
    "proxyIpD",
    "proxyIpS",
    "proxyType",
    "proxyUser",
    "securityStatus",
    "serviceId",
    "serviceName",
    "userIp",
    "userMac"
})
public class AcmOnlineUserSimpleInfo {

    @XmlElementRef(name = "accountName", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> accountName;
    @XmlElementRef(name = "acctSessionId", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> acctSessionId;
    @XmlElementRef(name = "acl", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> acl;
    @XmlElementRef(name = "boundDomain", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> boundDomain;
    @XmlElementRef(name = "clientLanguage", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> clientLanguage;
    @XmlElementRef(name = "clientVersion", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> clientVersion;
    @XmlElementRef(name = "computerName", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> computerName;
    @XmlElementRef(name = "deviceIp", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> deviceIp;
    @XmlElementRef(name = "fullName", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> fullName;
    @XmlElementRef(name = "influxByte", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> influxByte;
    @XmlElementRef(name = "innerVlanId", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> innerVlanId;
    @XmlElementRef(name = "loginDomain", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> loginDomain;
    @XmlElementRef(name = "loginName", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> loginName;
    @XmlElementRef(name = "loginTime", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> loginTime;
    @XmlElementRef(name = "nasSlot", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> nasSlot;
    @XmlElementRef(name = "nasSubSlot", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> nasSubSlot;
    @XmlElementRef(name = "onlineDuration", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> onlineDuration;
    @XmlElementRef(name = "onlineUserId", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> onlineUserId;
    @XmlElementRef(name = "outerVlanId", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> outerVlanId;
    @XmlElementRef(name = "outfluxByte", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> outfluxByte;
    @XmlElementRef(name = "port", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> port;
    @XmlElementRef(name = "proxyIpD", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> proxyIpD;
    @XmlElementRef(name = "proxyIpS", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> proxyIpS;
    @XmlElementRef(name = "proxyType", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> proxyType;
    @XmlElementRef(name = "proxyUser", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> proxyUser;
    @XmlElementRef(name = "securityStatus", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> securityStatus;
    @XmlElementRef(name = "serviceId", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> serviceId;
    @XmlElementRef(name = "serviceName", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> serviceName;
    @XmlElementRef(name = "userIp", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> userIp;
    @XmlElementRef(name = "userMac", namespace = "http://onlineuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> userMac;

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
     * 获取acctSessionId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAcctSessionId() {
        return acctSessionId;
    }

    /**
     * 设置acctSessionId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAcctSessionId(JAXBElement<String> value) {
        this.acctSessionId = value;
    }

    /**
     * 获取acl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAcl() {
        return acl;
    }

    /**
     * 设置acl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAcl(JAXBElement<String> value) {
        this.acl = value;
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
     * 获取deviceIp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeviceIp() {
        return deviceIp;
    }

    /**
     * 设置deviceIp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeviceIp(JAXBElement<String> value) {
        this.deviceIp = value;
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
     * 获取influxByte属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInfluxByte() {
        return influxByte;
    }

    /**
     * 设置influxByte属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInfluxByte(JAXBElement<Long> value) {
        this.influxByte = value;
    }

    /**
     * 获取innerVlanId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInnerVlanId() {
        return innerVlanId;
    }

    /**
     * 设置innerVlanId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInnerVlanId(JAXBElement<Long> value) {
        this.innerVlanId = value;
    }

    /**
     * 获取loginDomain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoginDomain() {
        return loginDomain;
    }

    /**
     * 设置loginDomain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoginDomain(JAXBElement<String> value) {
        this.loginDomain = value;
    }

    /**
     * 获取loginName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoginName() {
        return loginName;
    }

    /**
     * 设置loginName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoginName(JAXBElement<String> value) {
        this.loginName = value;
    }

    /**
     * 获取loginTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLoginTime() {
        return loginTime;
    }

    /**
     * 设置loginTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLoginTime(JAXBElement<XMLGregorianCalendar> value) {
        this.loginTime = value;
    }

    /**
     * 获取nasSlot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNasSlot() {
        return nasSlot;
    }

    /**
     * 设置nasSlot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNasSlot(JAXBElement<Integer> value) {
        this.nasSlot = value;
    }

    /**
     * 获取nasSubSlot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNasSubSlot() {
        return nasSubSlot;
    }

    /**
     * 设置nasSubSlot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNasSubSlot(JAXBElement<Integer> value) {
        this.nasSubSlot = value;
    }

    /**
     * 获取onlineDuration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOnlineDuration() {
        return onlineDuration;
    }

    /**
     * 设置onlineDuration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOnlineDuration(JAXBElement<Integer> value) {
        this.onlineDuration = value;
    }

    /**
     * 获取onlineUserId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOnlineUserId() {
        return onlineUserId;
    }

    /**
     * 设置onlineUserId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOnlineUserId(JAXBElement<Long> value) {
        this.onlineUserId = value;
    }

    /**
     * 获取outerVlanId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOuterVlanId() {
        return outerVlanId;
    }

    /**
     * 设置outerVlanId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOuterVlanId(JAXBElement<Long> value) {
        this.outerVlanId = value;
    }

    /**
     * 获取outfluxByte属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOutfluxByte() {
        return outfluxByte;
    }

    /**
     * 设置outfluxByte属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOutfluxByte(JAXBElement<Long> value) {
        this.outfluxByte = value;
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
     * 获取proxyIpD属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProxyIpD() {
        return proxyIpD;
    }

    /**
     * 设置proxyIpD属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProxyIpD(JAXBElement<String> value) {
        this.proxyIpD = value;
    }

    /**
     * 获取proxyIpS属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProxyIpS() {
        return proxyIpS;
    }

    /**
     * 设置proxyIpS属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProxyIpS(JAXBElement<String> value) {
        this.proxyIpS = value;
    }

    /**
     * 获取proxyType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProxyType() {
        return proxyType;
    }

    /**
     * 设置proxyType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProxyType(JAXBElement<String> value) {
        this.proxyType = value;
    }

    /**
     * 获取proxyUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProxyUser() {
        return proxyUser;
    }

    /**
     * 设置proxyUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProxyUser(JAXBElement<String> value) {
        this.proxyUser = value;
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
     * 获取serviceId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getServiceId() {
        return serviceId;
    }

    /**
     * 设置serviceId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setServiceId(JAXBElement<Long> value) {
        this.serviceId = value;
    }

    /**
     * 获取serviceName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceName() {
        return serviceName;
    }

    /**
     * 设置serviceName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceName(JAXBElement<String> value) {
        this.serviceName = value;
    }

    /**
     * 获取userIp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserIp() {
        return userIp;
    }

    /**
     * 设置userIp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserIp(JAXBElement<String> value) {
        this.userIp = value;
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

}
