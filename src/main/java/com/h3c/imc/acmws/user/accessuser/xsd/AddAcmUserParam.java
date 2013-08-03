
package com.h3c.imc.acmws.user.accessuser.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.h3c.imc.acmws.user.service.xsd.ApplyServiceInfo;


/**
 * <p>AddAcmUserParam complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AddAcmUserParam">
 *   &lt;complexContent>
 *     &lt;extension base="{http://accessuser.user.acmws.imc.h3c.com/xsd}AcmUserCommonInfo">
 *       &lt;sequence>
 *         &lt;element name="applyServiceInfos" type="{http://service.user.acmws.imc.h3c.com/xsd}ApplyServiceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="deviceSn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guestDeparment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guestManagerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ifSelfModifyPsd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="imsiCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manageGuest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="multiNasIp" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="multiNasIpv6" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="multiVlanId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="multiWlanSsid" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="openPayAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatorIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="platUserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddAcmUserParam", propOrder = {
    "applyServiceInfos",
    "deviceSn",
    "feeType",
    "guest",
    "guestDeparment",
    "guestManagerId",
    "ifSelfModifyPsd",
    "imsiCode",
    "manageGuest",
    "multiNasIp",
    "multiNasIpv6",
    "multiVlanId",
    "multiWlanSsid",
    "openPayAmount",
    "operatorIp",
    "password",
    "platUserId",
    "userType"
})
public class AddAcmUserParam
    extends AcmUserCommonInfo
{

    @XmlElement(nillable = true)
    protected List<ApplyServiceInfo> applyServiceInfos;
    @XmlElementRef(name = "deviceSn", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> deviceSn;
    @XmlElementRef(name = "feeType", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> feeType;
    @XmlElementRef(name = "guest", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> guest;
    @XmlElementRef(name = "guestDeparment", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> guestDeparment;
    @XmlElementRef(name = "guestManagerId", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> guestManagerId;
    @XmlElementRef(name = "ifSelfModifyPsd", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> ifSelfModifyPsd;
    @XmlElementRef(name = "imsiCode", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> imsiCode;
    protected Boolean manageGuest;
    @XmlElement(nillable = true)
    protected List<String> multiNasIp;
    @XmlElement(nillable = true)
    protected List<String> multiNasIpv6;
    @XmlElement(nillable = true)
    protected List<Long> multiVlanId;
    @XmlElement(nillable = true)
    protected List<String> multiWlanSsid;
    @XmlElementRef(name = "openPayAmount", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> openPayAmount;
    @XmlElementRef(name = "operatorIp", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> operatorIp;
    @XmlElementRef(name = "password", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> password;
    @XmlElementRef(name = "platUserId", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> platUserId;
    @XmlElementRef(name = "userType", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> userType;

    /**
     * Gets the value of the applyServiceInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applyServiceInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplyServiceInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplyServiceInfo }
     * 
     * 
     */
    public List<ApplyServiceInfo> getApplyServiceInfos() {
        if (applyServiceInfos == null) {
            applyServiceInfos = new ArrayList<ApplyServiceInfo>();
        }
        return this.applyServiceInfos;
    }

    /**
     * 获取deviceSn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeviceSn() {
        return deviceSn;
    }

    /**
     * 设置deviceSn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeviceSn(JAXBElement<String> value) {
        this.deviceSn = value;
    }

    /**
     * 获取feeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFeeType() {
        return feeType;
    }

    /**
     * 设置feeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFeeType(JAXBElement<String> value) {
        this.feeType = value;
    }

    /**
     * 获取guest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGuest() {
        return guest;
    }

    /**
     * 设置guest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGuest(JAXBElement<String> value) {
        this.guest = value;
    }

    /**
     * 获取guestDeparment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGuestDeparment() {
        return guestDeparment;
    }

    /**
     * 设置guestDeparment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGuestDeparment(JAXBElement<String> value) {
        this.guestDeparment = value;
    }

    /**
     * 获取guestManagerId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getGuestManagerId() {
        return guestManagerId;
    }

    /**
     * 设置guestManagerId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setGuestManagerId(JAXBElement<Long> value) {
        this.guestManagerId = value;
    }

    /**
     * 获取ifSelfModifyPsd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIfSelfModifyPsd() {
        return ifSelfModifyPsd;
    }

    /**
     * 设置ifSelfModifyPsd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIfSelfModifyPsd(JAXBElement<Integer> value) {
        this.ifSelfModifyPsd = value;
    }

    /**
     * 获取imsiCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImsiCode() {
        return imsiCode;
    }

    /**
     * 设置imsiCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImsiCode(JAXBElement<String> value) {
        this.imsiCode = value;
    }

    /**
     * 获取manageGuest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManageGuest() {
        return manageGuest;
    }

    /**
     * 设置manageGuest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManageGuest(Boolean value) {
        this.manageGuest = value;
    }

    /**
     * Gets the value of the multiNasIp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiNasIp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiNasIp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMultiNasIp() {
        if (multiNasIp == null) {
            multiNasIp = new ArrayList<String>();
        }
        return this.multiNasIp;
    }

    /**
     * Gets the value of the multiNasIpv6 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiNasIpv6 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiNasIpv6().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMultiNasIpv6() {
        if (multiNasIpv6 == null) {
            multiNasIpv6 = new ArrayList<String>();
        }
        return this.multiNasIpv6;
    }

    /**
     * Gets the value of the multiVlanId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiVlanId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiVlanId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getMultiVlanId() {
        if (multiVlanId == null) {
            multiVlanId = new ArrayList<Long>();
        }
        return this.multiVlanId;
    }

    /**
     * Gets the value of the multiWlanSsid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiWlanSsid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiWlanSsid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMultiWlanSsid() {
        if (multiWlanSsid == null) {
            multiWlanSsid = new ArrayList<String>();
        }
        return this.multiWlanSsid;
    }

    /**
     * 获取openPayAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpenPayAmount() {
        return openPayAmount;
    }

    /**
     * 设置openPayAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpenPayAmount(JAXBElement<String> value) {
        this.openPayAmount = value;
    }

    /**
     * 获取operatorIp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperatorIp() {
        return operatorIp;
    }

    /**
     * 设置operatorIp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperatorIp(JAXBElement<String> value) {
        this.operatorIp = value;
    }

    /**
     * 获取password属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword() {
        return password;
    }

    /**
     * 设置password属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword(JAXBElement<String> value) {
        this.password = value;
    }

    /**
     * 获取platUserId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPlatUserId() {
        return platUserId;
    }

    /**
     * 设置platUserId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPlatUserId(JAXBElement<Long> value) {
        this.platUserId = value;
    }

    /**
     * 获取userType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUserType() {
        return userType;
    }

    /**
     * 设置userType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUserType(JAXBElement<Integer> value) {
        this.userType = value;
    }

}
