
package com.h3c.imc.acmws.fee.bill.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>AcmBillDetailSimpleInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡaccessEndTime���Ե�ֵ��
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
     * ����accessEndTime���Ե�ֵ��
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
     * ��ȡaccessSessionTime���Ե�ֵ��
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
     * ����accessSessionTime���Ե�ֵ��
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
     * ��ȡaccessStartTime���Ե�ֵ��
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
     * ����accessStartTime���Ե�ֵ��
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
     * ��ȡfeeSessionId���Ե�ֵ��
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
     * ����feeSessionId���Ե�ֵ��
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
     * ��ȡinfluxByte���Ե�ֵ��
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
     * ����influxByte���Ե�ֵ��
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
     * ��ȡoutfluxByte���Ե�ֵ��
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
     * ����outfluxByte���Ե�ֵ��
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

}
