
package com.h3c.imc.acmws.user.accessuser.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.h3c.imc.common.ws.xsd.WSCommonResult;


/**
 * <p>RetAcmUserFullInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RetAcmUserFullInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.common.imc.h3c.com/xsd}WSCommonResult">
 *       &lt;sequence>
 *         &lt;element name="acmUser" type="{http://accessuser.user.acmws.imc.h3c.com/xsd}AcmUser" minOccurs="0"/>
 *         &lt;element name="extendStr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extendStr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extendStr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extendStr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ifOwe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ifPsdPolicy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ifSelfModifyPsd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lastUsingTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="multiVlanId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nextLoginModifyPsdTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetAcmUserFullInfo", propOrder = {
    "acmUser",
    "extendStr1",
    "extendStr2",
    "extendStr3",
    "extendStr4",
    "ifOwe",
    "ifPsdPolicy",
    "ifSelfModifyPsd",
    "lastUsingTime",
    "multiVlanId",
    "nextLoginModifyPsdTime"
})
public class RetAcmUserFullInfo
    extends WSCommonResult
{

    @XmlElementRef(name = "acmUser", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<AcmUser> acmUser;
    @XmlElementRef(name = "extendStr1", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> extendStr1;
    @XmlElementRef(name = "extendStr2", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> extendStr2;
    @XmlElementRef(name = "extendStr3", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> extendStr3;
    @XmlElementRef(name = "extendStr4", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> extendStr4;
    protected Boolean ifOwe;
    @XmlElementRef(name = "ifPsdPolicy", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Boolean> ifPsdPolicy;
    @XmlElementRef(name = "ifSelfModifyPsd", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Boolean> ifSelfModifyPsd;
    @XmlElementRef(name = "lastUsingTime", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> lastUsingTime;
    @XmlElement(nillable = true)
    protected List<Long> multiVlanId;
    @XmlElementRef(name = "nextLoginModifyPsdTime", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> nextLoginModifyPsdTime;

    /**
     * 获取acmUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcmUser }{@code >}
     *     
     */
    public JAXBElement<AcmUser> getAcmUser() {
        return acmUser;
    }

    /**
     * 设置acmUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcmUser }{@code >}
     *     
     */
    public void setAcmUser(JAXBElement<AcmUser> value) {
        this.acmUser = value;
    }

    /**
     * 获取extendStr1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtendStr1() {
        return extendStr1;
    }

    /**
     * 设置extendStr1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtendStr1(JAXBElement<String> value) {
        this.extendStr1 = value;
    }

    /**
     * 获取extendStr2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtendStr2() {
        return extendStr2;
    }

    /**
     * 设置extendStr2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtendStr2(JAXBElement<String> value) {
        this.extendStr2 = value;
    }

    /**
     * 获取extendStr3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtendStr3() {
        return extendStr3;
    }

    /**
     * 设置extendStr3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtendStr3(JAXBElement<String> value) {
        this.extendStr3 = value;
    }

    /**
     * 获取extendStr4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtendStr4() {
        return extendStr4;
    }

    /**
     * 设置extendStr4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtendStr4(JAXBElement<String> value) {
        this.extendStr4 = value;
    }

    /**
     * 获取ifOwe属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIfOwe() {
        return ifOwe;
    }

    /**
     * 设置ifOwe属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIfOwe(Boolean value) {
        this.ifOwe = value;
    }

    /**
     * 获取ifPsdPolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIfPsdPolicy() {
        return ifPsdPolicy;
    }

    /**
     * 设置ifPsdPolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIfPsdPolicy(JAXBElement<Boolean> value) {
        this.ifPsdPolicy = value;
    }

    /**
     * 获取ifSelfModifyPsd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIfSelfModifyPsd() {
        return ifSelfModifyPsd;
    }

    /**
     * 设置ifSelfModifyPsd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIfSelfModifyPsd(JAXBElement<Boolean> value) {
        this.ifSelfModifyPsd = value;
    }

    /**
     * 获取lastUsingTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastUsingTime() {
        return lastUsingTime;
    }

    /**
     * 设置lastUsingTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastUsingTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastUsingTime = value;
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
     * 获取nextLoginModifyPsdTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getNextLoginModifyPsdTime() {
        return nextLoginModifyPsdTime;
    }

    /**
     * 设置nextLoginModifyPsdTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setNextLoginModifyPsdTime(JAXBElement<XMLGregorianCalendar> value) {
        this.nextLoginModifyPsdTime = value;
    }

}
