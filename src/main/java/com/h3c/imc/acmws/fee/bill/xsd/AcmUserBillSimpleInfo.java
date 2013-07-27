
package com.h3c.imc.acmws.fee.bill.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>AcmUserBillSimpleInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AcmUserBillSimpleInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="billStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="billTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="billType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bonusCash" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fixedAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="usageUnit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="usedAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="usedBonusCash" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="usedCash" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
@XmlType(name = "AcmUserBillSimpleInfo", propOrder = {
    "billID",
    "billStatus",
    "billTime",
    "billType",
    "bonusCash",
    "endTime",
    "fixedAmount",
    "serviceName",
    "serviceType",
    "startTime",
    "usageUnit",
    "usedAmount",
    "usedBonusCash",
    "usedCash",
    "userName"
})
public class AcmUserBillSimpleInfo {

    @XmlElementRef(name = "billID", namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> billID;
    @XmlElementRef(name = "billStatus", namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> billStatus;
    @XmlElementRef(name = "billTime", namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> billTime;
    @XmlElementRef(name = "billType", namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> billType;
    @XmlElementRef(name = "bonusCash", namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Double> bonusCash;
    @XmlElementRef(name = "endTime", namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> endTime;
    @XmlElementRef(name = "fixedAmount", namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Double> fixedAmount;
    @XmlElementRef(name = "serviceName", namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> serviceName;
    @XmlElementRef(name = "serviceType", namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> serviceType;
    @XmlElementRef(name = "startTime", namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> startTime;
    @XmlElementRef(name = "usageUnit", namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> usageUnit;
    @XmlElementRef(name = "usedAmount", namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> usedAmount;
    @XmlElementRef(name = "usedBonusCash", namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Double> usedBonusCash;
    @XmlElementRef(name = "usedCash", namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Double> usedCash;
    @XmlElementRef(name = "userName", namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> userName;

    /**
     * ��ȡbillID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getBillID() {
        return billID;
    }

    /**
     * ����billID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setBillID(JAXBElement<Long> value) {
        this.billID = value;
    }

    /**
     * ��ȡbillStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBillStatus() {
        return billStatus;
    }

    /**
     * ����billStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBillStatus(JAXBElement<Integer> value) {
        this.billStatus = value;
    }

    /**
     * ��ȡbillTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBillTime() {
        return billTime;
    }

    /**
     * ����billTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBillTime(JAXBElement<XMLGregorianCalendar> value) {
        this.billTime = value;
    }

    /**
     * ��ȡbillType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBillType() {
        return billType;
    }

    /**
     * ����billType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBillType(JAXBElement<Integer> value) {
        this.billType = value;
    }

    /**
     * ��ȡbonusCash���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getBonusCash() {
        return bonusCash;
    }

    /**
     * ����bonusCash���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setBonusCash(JAXBElement<Double> value) {
        this.bonusCash = value;
    }

    /**
     * ��ȡendTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndTime() {
        return endTime;
    }

    /**
     * ����endTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndTime(JAXBElement<XMLGregorianCalendar> value) {
        this.endTime = value;
    }

    /**
     * ��ȡfixedAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getFixedAmount() {
        return fixedAmount;
    }

    /**
     * ����fixedAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setFixedAmount(JAXBElement<Double> value) {
        this.fixedAmount = value;
    }

    /**
     * ��ȡserviceName���Ե�ֵ��
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
     * ����serviceName���Ե�ֵ��
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
     * ��ȡserviceType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getServiceType() {
        return serviceType;
    }

    /**
     * ����serviceType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setServiceType(JAXBElement<Integer> value) {
        this.serviceType = value;
    }

    /**
     * ��ȡstartTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartTime() {
        return startTime;
    }

    /**
     * ����startTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.startTime = value;
    }

    /**
     * ��ȡusageUnit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUsageUnit() {
        return usageUnit;
    }

    /**
     * ����usageUnit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUsageUnit(JAXBElement<Integer> value) {
        this.usageUnit = value;
    }

    /**
     * ��ȡusedAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getUsedAmount() {
        return usedAmount;
    }

    /**
     * ����usedAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setUsedAmount(JAXBElement<Long> value) {
        this.usedAmount = value;
    }

    /**
     * ��ȡusedBonusCash���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUsedBonusCash() {
        return usedBonusCash;
    }

    /**
     * ����usedBonusCash���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUsedBonusCash(JAXBElement<Double> value) {
        this.usedBonusCash = value;
    }

    /**
     * ��ȡusedCash���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUsedCash() {
        return usedCash;
    }

    /**
     * ����usedCash���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUsedCash(JAXBElement<Double> value) {
        this.usedCash = value;
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
