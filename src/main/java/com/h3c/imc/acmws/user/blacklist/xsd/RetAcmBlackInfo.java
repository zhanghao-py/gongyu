
package com.h3c.imc.acmws.user.blacklist.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.h3c.imc.common.ws.xsd.WSCommonResult;


/**
 * <p>RetAcmBlackInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RetAcmBlackInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.common.imc.h3c.com/xsd}WSCommonResult">
 *       &lt;sequence>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="blackNameId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="faultCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="joinDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="joinReason" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nasIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nasPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userMacAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetAcmBlackInfo", propOrder = {
    "accountId",
    "accountName",
    "blackNameId",
    "faultCount",
    "joinDate",
    "joinReason",
    "nasIp",
    "nasPort",
    "userIpAddress",
    "userMacAddress"
})
public class RetAcmBlackInfo
    extends WSCommonResult
{

    @XmlElementRef(name = "accountId", namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> accountId;
    @XmlElementRef(name = "accountName", namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> accountName;
    @XmlElementRef(name = "blackNameId", namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> blackNameId;
    @XmlElementRef(name = "faultCount", namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> faultCount;
    @XmlElementRef(name = "joinDate", namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> joinDate;
    @XmlElementRef(name = "joinReason", namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> joinReason;
    @XmlElementRef(name = "nasIp", namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> nasIp;
    @XmlElementRef(name = "nasPort", namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> nasPort;
    @XmlElementRef(name = "userIpAddress", namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> userIpAddress;
    @XmlElementRef(name = "userMacAddress", namespace = "http://blacklist.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> userMacAddress;

    /**
     * 获取accountId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAccountId() {
        return accountId;
    }

    /**
     * 设置accountId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAccountId(JAXBElement<Long> value) {
        this.accountId = value;
    }

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
     * 获取blackNameId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getBlackNameId() {
        return blackNameId;
    }

    /**
     * 设置blackNameId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setBlackNameId(JAXBElement<Long> value) {
        this.blackNameId = value;
    }

    /**
     * 获取faultCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFaultCount() {
        return faultCount;
    }

    /**
     * 设置faultCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFaultCount(JAXBElement<Integer> value) {
        this.faultCount = value;
    }

    /**
     * 获取joinDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getJoinDate() {
        return joinDate;
    }

    /**
     * 设置joinDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setJoinDate(JAXBElement<XMLGregorianCalendar> value) {
        this.joinDate = value;
    }

    /**
     * 获取joinReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getJoinReason() {
        return joinReason;
    }

    /**
     * 设置joinReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setJoinReason(JAXBElement<Integer> value) {
        this.joinReason = value;
    }

    /**
     * 获取nasIp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNasIp() {
        return nasIp;
    }

    /**
     * 设置nasIp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNasIp(JAXBElement<String> value) {
        this.nasIp = value;
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
     * 获取userIpAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserIpAddress() {
        return userIpAddress;
    }

    /**
     * 设置userIpAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserIpAddress(JAXBElement<String> value) {
        this.userIpAddress = value;
    }

    /**
     * 获取userMacAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserMacAddress() {
        return userMacAddress;
    }

    /**
     * 设置userMacAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserMacAddress(JAXBElement<String> value) {
        this.userMacAddress = value;
    }

}
