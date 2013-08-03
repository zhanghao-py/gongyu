
package com.h3c.imc.acmws.user.accessuser.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>AcmUserCommonInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AcmUserCommonInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="boundDomainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="computerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idleTimeout" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="invalidTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ipMacInfos" type="{http://accessuser.user.acmws.imc.h3c.com/xsd}IpMacInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="logonDomainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nasIpStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nasPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="onlineLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="promptInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vlan" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="vlan2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="wlanSsid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcmUserCommonInfo", propOrder = {
    "boundDomainName",
    "computerName",
    "idleTimeout",
    "invalidTime",
    "ipMacInfos",
    "logonDomainName",
    "nasIpStr",
    "nasPort",
    "onlineLimit",
    "promptInfo",
    "userName",
    "vlan",
    "vlan2",
    "wlanSsid"
})
@XmlSeeAlso({
    ModifyAcmUserParam.class,
    AcmUser.class,
    AddAcmUserParam.class
})
public class AcmUserCommonInfo {

    @XmlElementRef(name = "boundDomainName", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> boundDomainName;
    @XmlElementRef(name = "computerName", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> computerName;
    @XmlElementRef(name = "idleTimeout", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> idleTimeout;
    @XmlElementRef(name = "invalidTime", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> invalidTime;
    @XmlElement(nillable = true)
    protected List<IpMacInfo> ipMacInfos;
    @XmlElementRef(name = "logonDomainName", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> logonDomainName;
    @XmlElementRef(name = "nasIpStr", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> nasIpStr;
    @XmlElementRef(name = "nasPort", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> nasPort;
    @XmlElementRef(name = "onlineLimit", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> onlineLimit;
    @XmlElementRef(name = "promptInfo", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> promptInfo;
    @XmlElementRef(name = "userName", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> userName;
    @XmlElementRef(name = "vlan", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> vlan;
    @XmlElementRef(name = "vlan2", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> vlan2;
    @XmlElementRef(name = "wlanSsid", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> wlanSsid;

    /**
     * 获取boundDomainName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBoundDomainName() {
        return boundDomainName;
    }

    /**
     * 设置boundDomainName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBoundDomainName(JAXBElement<String> value) {
        this.boundDomainName = value;
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
     * 获取idleTimeout属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdleTimeout() {
        return idleTimeout;
    }

    /**
     * 设置idleTimeout属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdleTimeout(JAXBElement<Long> value) {
        this.idleTimeout = value;
    }

    /**
     * 获取invalidTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getInvalidTime() {
        return invalidTime;
    }

    /**
     * 设置invalidTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setInvalidTime(JAXBElement<XMLGregorianCalendar> value) {
        this.invalidTime = value;
    }

    /**
     * Gets the value of the ipMacInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipMacInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIpMacInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IpMacInfo }
     * 
     * 
     */
    public List<IpMacInfo> getIpMacInfos() {
        if (ipMacInfos == null) {
            ipMacInfos = new ArrayList<IpMacInfo>();
        }
        return this.ipMacInfos;
    }

    /**
     * 获取logonDomainName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLogonDomainName() {
        return logonDomainName;
    }

    /**
     * 设置logonDomainName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLogonDomainName(JAXBElement<String> value) {
        this.logonDomainName = value;
    }

    /**
     * 获取nasIpStr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNasIpStr() {
        return nasIpStr;
    }

    /**
     * 设置nasIpStr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNasIpStr(JAXBElement<String> value) {
        this.nasIpStr = value;
    }

    /**
     * 获取nasPort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNasPort() {
        return nasPort;
    }

    /**
     * 设置nasPort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNasPort(JAXBElement<Integer> value) {
        this.nasPort = value;
    }

    /**
     * 获取onlineLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOnlineLimit() {
        return onlineLimit;
    }

    /**
     * 设置onlineLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOnlineLimit(JAXBElement<Integer> value) {
        this.onlineLimit = value;
    }

    /**
     * 获取promptInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPromptInfo() {
        return promptInfo;
    }

    /**
     * 设置promptInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPromptInfo(JAXBElement<String> value) {
        this.promptInfo = value;
    }

    /**
     * 获取userName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserName() {
        return userName;
    }

    /**
     * 设置userName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserName(JAXBElement<String> value) {
        this.userName = value;
    }

    /**
     * 获取vlan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getVlan() {
        return vlan;
    }

    /**
     * 设置vlan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setVlan(JAXBElement<Long> value) {
        this.vlan = value;
    }

    /**
     * 获取vlan2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getVlan2() {
        return vlan2;
    }

    /**
     * 设置vlan2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setVlan2(JAXBElement<Long> value) {
        this.vlan2 = value;
    }

    /**
     * 获取wlanSsid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWlanSsid() {
        return wlanSsid;
    }

    /**
     * 设置wlanSsid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWlanSsid(JAXBElement<String> value) {
        this.wlanSsid = value;
    }

}
