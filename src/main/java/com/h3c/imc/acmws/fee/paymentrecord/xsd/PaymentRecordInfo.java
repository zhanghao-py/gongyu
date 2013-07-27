
package com.h3c.imc.acmws.fee.paymentrecord.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>PaymentRecordInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡbalance���Ե�ֵ��
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
     * ����balance���Ե�ֵ��
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
     * ��ȡfeeType���Ե�ֵ��
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
     * ����feeType���Ե�ֵ��
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
     * ��ȡflowId���Ե�ֵ��
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
     * ����flowId���Ե�ֵ��
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
     * ��ȡfullName���Ե�ֵ��
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
     * ����fullName���Ե�ֵ��
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
     * ��ȡlastBalance���Ե�ֵ��
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
     * ����lastBalance���Ե�ֵ��
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
     * ��ȡoperator���Ե�ֵ��
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
     * ����operator���Ե�ֵ��
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
     * ��ȡoperatorLoginIp���Ե�ֵ��
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
     * ����operatorLoginIp���Ե�ֵ��
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
     * ��ȡpayAmount���Ե�ֵ��
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
     * ����payAmount���Ե�ֵ��
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
     * ��ȡpaymentDate���Ե�ֵ��
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
     * ����paymentDate���Ե�ֵ��
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
     * ��ȡpaymentID���Ե�ֵ��
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
     * ����paymentID���Ե�ֵ��
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
     * ��ȡpaymentMode���Ե�ֵ��
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
     * ����paymentMode���Ե�ֵ��
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
     * ��ȡuserName���Ե�ֵ��
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
     * ����userName���Ե�ֵ��
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
