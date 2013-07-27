
package com.h3c.imc.acmws.fee.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SelfPaymentInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SelfPaymentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelfPaymentInfo", propOrder = {
    "cardNum",
    "cardPassword",
    "userName"
})
public class SelfPaymentInfo {

    @XmlElementRef(name = "cardNum", namespace = "http://fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> cardNum;
    @XmlElementRef(name = "cardPassword", namespace = "http://fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> cardPassword;
    @XmlElementRef(name = "userName", namespace = "http://fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> userName;

    /**
     * 获取cardNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardNum() {
        return cardNum;
    }

    /**
     * 设置cardNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardNum(JAXBElement<String> value) {
        this.cardNum = value;
    }

    /**
     * 获取cardPassword属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardPassword() {
        return cardPassword;
    }

    /**
     * 设置cardPassword属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardPassword(JAXBElement<String> value) {
        this.cardPassword = value;
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

}
