
package com.h3c.imc.acmws.user.accessuser.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ModifyAcmUserParam complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ModifyAcmUserParam">
 *   &lt;complexContent>
 *     &lt;extension base="{http://accessuser.user.acmws.imc.h3c.com/xsd}AcmUserCommonInfo">
 *       &lt;sequence>
 *         &lt;element name="deviceSn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ifSelfModifyPsd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="imsiCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="multiNasIp" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="multiNasIpv6" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="multiVlanId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="multiWlanSsid" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyAcmUserParam", propOrder = {
    "deviceSn",
    "ifSelfModifyPsd",
    "imsiCode",
    "multiNasIp",
    "multiNasIpv6",
    "multiVlanId",
    "multiWlanSsid"
})
public class ModifyAcmUserParam
    extends AcmUserCommonInfo
{

    @XmlElementRef(name = "deviceSn", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> deviceSn;
    @XmlElementRef(name = "ifSelfModifyPsd", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> ifSelfModifyPsd;
    @XmlElementRef(name = "imsiCode", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> imsiCode;
    @XmlElement(nillable = true)
    protected List<String> multiNasIp;
    @XmlElement(nillable = true)
    protected List<String> multiNasIpv6;
    @XmlElement(nillable = true)
    protected List<Long> multiVlanId;
    @XmlElement(nillable = true)
    protected List<String> multiWlanSsid;

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

}
