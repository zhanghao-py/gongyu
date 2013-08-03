
package com.h3c.imc.acmws.user.ldap.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AcmSyncPolicyQueryParam complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AcmSyncPolicyQueryParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="resultNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="resultSort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="resultSortType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcmSyncPolicyQueryParam", propOrder = {
    "resultIndex",
    "resultNumber",
    "resultSort",
    "resultSortType"
})
public class AcmSyncPolicyQueryParam {

    @XmlElementRef(name = "resultIndex", namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> resultIndex;
    @XmlElementRef(name = "resultNumber", namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> resultNumber;
    @XmlElementRef(name = "resultSort", namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> resultSort;
    @XmlElementRef(name = "resultSortType", namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> resultSortType;

    /**
     * 获取resultIndex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getResultIndex() {
        return resultIndex;
    }

    /**
     * 设置resultIndex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setResultIndex(JAXBElement<Integer> value) {
        this.resultIndex = value;
    }

    /**
     * 获取resultNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getResultNumber() {
        return resultNumber;
    }

    /**
     * 设置resultNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setResultNumber(JAXBElement<Integer> value) {
        this.resultNumber = value;
    }

    /**
     * 获取resultSort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getResultSort() {
        return resultSort;
    }

    /**
     * 设置resultSort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setResultSort(JAXBElement<Integer> value) {
        this.resultSort = value;
    }

    /**
     * 获取resultSortType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getResultSortType() {
        return resultSortType;
    }

    /**
     * 设置resultSortType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setResultSortType(JAXBElement<Integer> value) {
        this.resultSortType = value;
    }

}
