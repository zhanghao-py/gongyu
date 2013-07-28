
package com.h3c.imc.acmws.fee.bill.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>AcmBillDetailSimpleInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AcmBillDetailSimpleInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="accessSessionTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="accessStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="bonusCash" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="feeSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="influxByte" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="outfluxByte" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="usedBonusCash" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="usedCash" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcmBillDetailSimpleInfo", propOrder = {
    "accessEndTime",
    "accessSessionTime",
    "accessStartTime",
    "bonusCash",
    "feeSessionId",
    "influxByte",
    "outfluxByte",
    "usedBonusCash",
    "usedCash"
})
public class AcmBillDetailSimpleInfo {

    @XmlElementRef(name = "accessEndTime", namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> accessEndTime;
    @XmlElementRef(name = "accessSessionTime", namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> accessSessionTime;
    @XmlElementRef(name = "accessStartTime", namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> accessStartTime;
    @XmlElementRef(name = "bonusCash", namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Double> bonusCash;
    @XmlElementRef(name = "feeSessionId", namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> feeSessionId;
    @XmlElementRef(name = "influxByte", namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> influxByte;
    @XmlElementRef(name = "outfluxByte", namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> outfluxByte;
    @XmlElementRef(name = "usedBonusCash", namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Double> usedBonusCash;
    @XmlElementRef(name = "usedCash", namespace = "http://bill.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Double> usedCash;

    /**
     * 获取accessEndTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAccessEndTime() {
        return accessEndTime;
    }

    /**
     * 设置accessEndTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAccessEndTime(JAXBElement<XMLGregorianCalendar> value) {
        this.accessEndTime = value;
    }

    /**
     * 获取accessSessionTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAccessSessionTime() {
        return accessSessionTime;
    }

    /**
     * 设置accessSessionTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAccessSessionTime(JAXBElement<Long> value) {
        this.accessSessionTime = value;
    }

    /**
     * 获取accessStartTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAccessStartTime() {
        return accessStartTime;
    }

    /**
     * 设置accessStartTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAccessStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.accessStartTime = value;
    }

    /**
     * 获取bonusCash属性的值。
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
     * 设置bonusCash属性的值。
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
     * 获取feeSessionId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFeeSessionId() {
        return feeSessionId;
    }

    /**
     * 设置feeSessionId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFeeSessionId(JAXBElement<String> value) {
        this.feeSessionId = value;
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
     * 获取usedBonusCash属性的值。
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
     * 设置usedBonusCash属性的值。
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
     * 获取usedCash属性的值。
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
     * 设置usedCash属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUsedCash(JAXBElement<Double> value) {
        this.usedCash = value;
    }

}
