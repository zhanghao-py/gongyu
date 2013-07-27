
package com.h3c.imc.acmws.fee.paymentrecord.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>PaymentRecordInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PaymentRecordInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="feeType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="flowId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatorLoginIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="paymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="paymentID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="paymentMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "PaymentRecordInfo", propOrder = {
    "balance",
    "feeType",
    "flowId",
    "fullName",
    "lastBalance",
    "operator",
    "operatorLoginIp",
    "payAmount",
    "paymentDate",
    "paymentID",
    "paymentMode",
    "userName"
})
public class PaymentRecordInfo {

    @XmlElementRef(name = "balance", namespace = "http://paymentRecord.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Double> balance;
    @XmlElementRef(name = "feeType", namespace = "http://paymentRecord.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> feeType;
    @XmlElementRef(name = "flowId", namespace = "http://paymentRecord.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> flowId;
    @XmlElementRef(name = "fullName", namespace = "http://paymentRecord.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> fullName;
    @XmlElementRef(name = "lastBalance", namespace = "http://paymentRecord.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Double> lastBalance;
    @XmlElementRef(name = "operator", namespace = "http://paymentRecord.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> operator;
    @XmlElementRef(name = "operatorLoginIp", namespace = "http://paymentRecord.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> operatorLoginIp;
    @XmlElementRef(name = "payAmount", namespace = "http://paymentRecord.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Double> payAmount;
    @XmlElementRef(name = "paymentDate", namespace = "http://paymentRecord.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> paymentDate;
    @XmlElementRef(name = "paymentID", namespace = "http://paymentRecord.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> paymentID;
    @XmlElementRef(name = "paymentMode", namespace = "http://paymentRecord.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> paymentMode;
    @XmlElementRef(name = "userName", namespace = "http://paymentRecord.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> userName;

    /**
     * 获取balance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBalance() {
        return balance;
    }

    /**
     * 设置balance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBalance(JAXBElement<Double> value) {
        this.balance = value;
    }

    /**
     * 获取feeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFeeType() {
        return feeType;
    }

    /**
     * 设置feeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFeeType(JAXBElement<Integer> value) {
        this.feeType = value;
    }

    /**
     * 获取flowId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getFlowId() {
        return flowId;
    }

    /**
     * 设置flowId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setFlowId(JAXBElement<Long> value) {
        this.flowId = value;
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
     * 获取lastBalance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getLastBalance() {
        return lastBalance;
    }

    /**
     * 设置lastBalance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setLastBalance(JAXBElement<Double> value) {
        this.lastBalance = value;
    }

    /**
     * 获取operator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperator() {
        return operator;
    }

    /**
     * 设置operator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperator(JAXBElement<String> value) {
        this.operator = value;
    }

    /**
     * 获取operatorLoginIp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperatorLoginIp() {
        return operatorLoginIp;
    }

    /**
     * 设置operatorLoginIp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperatorLoginIp(JAXBElement<String> value) {
        this.operatorLoginIp = value;
    }

    /**
     * 获取payAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPayAmount() {
        return payAmount;
    }

    /**
     * 设置payAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPayAmount(JAXBElement<Double> value) {
        this.payAmount = value;
    }

    /**
     * 获取paymentDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPaymentDate() {
        return paymentDate;
    }

    /**
     * 设置paymentDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPaymentDate(JAXBElement<XMLGregorianCalendar> value) {
        this.paymentDate = value;
    }

    /**
     * 获取paymentID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPaymentID() {
        return paymentID;
    }

    /**
     * 设置paymentID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPaymentID(JAXBElement<Long> value) {
        this.paymentID = value;
    }

    /**
     * 获取paymentMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPaymentMode() {
        return paymentMode;
    }

    /**
     * 设置paymentMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPaymentMode(JAXBElement<Integer> value) {
        this.paymentMode = value;
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
