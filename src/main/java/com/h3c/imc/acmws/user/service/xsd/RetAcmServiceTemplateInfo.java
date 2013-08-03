
package com.h3c.imc.acmws.user.service.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RetAcmServiceTemplateInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RetAcmServiceTemplateInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assignAddress" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ldapPriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="policyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="policyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="safePolicy" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="safePolicyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="serviceSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetAcmServiceTemplateInfo", propOrder = {
    "assignAddress",
    "groupId",
    "ldapPriority",
    "policyId",
    "policyName",
    "safePolicy",
    "safePolicyName",
    "serviceDesc",
    "serviceId",
    "serviceName",
    "serviceStatus",
    "serviceSuffix",
    "type",
    "valid"
})
public class RetAcmServiceTemplateInfo {

    @XmlElementRef(name = "assignAddress", namespace = "http://service.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> assignAddress;
    @XmlElementRef(name = "groupId", namespace = "http://service.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> groupId;
    @XmlElementRef(name = "ldapPriority", namespace = "http://service.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> ldapPriority;
    @XmlElementRef(name = "policyId", namespace = "http://service.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> policyId;
    @XmlElementRef(name = "policyName", namespace = "http://service.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> policyName;
    @XmlElementRef(name = "safePolicy", namespace = "http://service.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> safePolicy;
    @XmlElementRef(name = "safePolicyName", namespace = "http://service.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> safePolicyName;
    @XmlElementRef(name = "serviceDesc", namespace = "http://service.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> serviceDesc;
    @XmlElementRef(name = "serviceId", namespace = "http://service.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> serviceId;
    @XmlElementRef(name = "serviceName", namespace = "http://service.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> serviceName;
    @XmlElementRef(name = "serviceStatus", namespace = "http://service.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> serviceStatus;
    @XmlElementRef(name = "serviceSuffix", namespace = "http://service.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> serviceSuffix;
    @XmlElementRef(name = "type", namespace = "http://service.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> type;
    protected Boolean valid;

    /**
     * 获取assignAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAssignAddress() {
        return assignAddress;
    }

    /**
     * 设置assignAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAssignAddress(JAXBElement<Integer> value) {
        this.assignAddress = value;
    }

    /**
     * 获取groupId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getGroupId() {
        return groupId;
    }

    /**
     * 设置groupId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setGroupId(JAXBElement<Long> value) {
        this.groupId = value;
    }

    /**
     * 获取ldapPriority属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLdapPriority() {
        return ldapPriority;
    }

    /**
     * 设置ldapPriority属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLdapPriority(JAXBElement<Integer> value) {
        this.ldapPriority = value;
    }

    /**
     * 获取policyId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPolicyId() {
        return policyId;
    }

    /**
     * 设置policyId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPolicyId(JAXBElement<Long> value) {
        this.policyId = value;
    }

    /**
     * 获取policyName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyName() {
        return policyName;
    }

    /**
     * 设置policyName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyName(JAXBElement<String> value) {
        this.policyName = value;
    }

    /**
     * 获取safePolicy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSafePolicy() {
        return safePolicy;
    }

    /**
     * 设置safePolicy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSafePolicy(JAXBElement<Long> value) {
        this.safePolicy = value;
    }

    /**
     * 获取safePolicyName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSafePolicyName() {
        return safePolicyName;
    }

    /**
     * 设置safePolicyName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSafePolicyName(JAXBElement<String> value) {
        this.safePolicyName = value;
    }

    /**
     * 获取serviceDesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceDesc() {
        return serviceDesc;
    }

    /**
     * 设置serviceDesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceDesc(JAXBElement<String> value) {
        this.serviceDesc = value;
    }

    /**
     * 获取serviceId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getServiceId() {
        return serviceId;
    }

    /**
     * 设置serviceId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setServiceId(JAXBElement<Long> value) {
        this.serviceId = value;
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
     * 获取serviceStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getServiceStatus() {
        return serviceStatus;
    }

    /**
     * 设置serviceStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setServiceStatus(JAXBElement<Integer> value) {
        this.serviceStatus = value;
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
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setType(JAXBElement<Integer> value) {
        this.type = value;
    }

    /**
     * 获取valid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValid() {
        return valid;
    }

    /**
     * 设置valid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValid(Boolean value) {
        this.valid = value;
    }

}
