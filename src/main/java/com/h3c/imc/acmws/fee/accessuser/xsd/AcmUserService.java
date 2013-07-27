
package com.h3c.imc.acmws.fee.accessuser.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>AcmUserService complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AcmUserService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="curCycleEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="curCycleStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strategyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcmUserService", propOrder = {
    "curCycleEndTime",
    "curCycleStartTime",
    "serviceName",
    "serviceSuffix",
    "strategyName",
    "userIp"
})
public class AcmUserService {

    @XmlElementRef(name = "curCycleEndTime", namespace = "http://accessuser.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> curCycleEndTime;
    @XmlElementRef(name = "curCycleStartTime", namespace = "http://accessuser.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> curCycleStartTime;
    @XmlElementRef(name = "serviceName", namespace = "http://accessuser.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> serviceName;
    @XmlElementRef(name = "serviceSuffix", namespace = "http://accessuser.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> serviceSuffix;
    @XmlElementRef(name = "strategyName", namespace = "http://accessuser.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> strategyName;
    @XmlElementRef(name = "userIp", namespace = "http://accessuser.fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> userIp;

    /**
     * 获取curCycleEndTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCurCycleEndTime() {
        return curCycleEndTime;
    }

    /**
     * 设置curCycleEndTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCurCycleEndTime(JAXBElement<XMLGregorianCalendar> value) {
        this.curCycleEndTime = value;
    }

    /**
     * 获取curCycleStartTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCurCycleStartTime() {
        return curCycleStartTime;
    }

    /**
     * 设置curCycleStartTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCurCycleStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.curCycleStartTime = value;
    }

    /**
     * 获取serviceName属性的值。
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
     * 设置serviceName属性的值。
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
     * 获取serviceSuffix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceSuffix() {
        return serviceSuffix;
    }

    /**
     * 设置serviceSuffix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceSuffix(JAXBElement<String> value) {
        this.serviceSuffix = value;
    }

    /**
     * 获取strategyName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrategyName() {
        return strategyName;
    }

    /**
     * 设置strategyName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrategyName(JAXBElement<String> value) {
        this.strategyName = value;
    }

    /**
     * 获取userIp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserIp() {
        return userIp;
    }

    /**
     * 设置userIp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserIp(JAXBElement<String> value) {
        this.userIp = value;
    }

}
