
package com.h3c.imc.acmws.user.ldap.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.h3c.imc.common.ws.xsd.WSCommonResult;


/**
 * <p>RetAcmSyncPolicyInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RetAcmSyncPolicyInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.common.imc.h3c.com/xsd}WSCommonResult">
 *       &lt;sequence>
 *         &lt;element name="autoSync" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="configStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="policyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="policyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serverId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="serverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="syncPolicyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetAcmSyncPolicyInfo", propOrder = {
    "autoSync",
    "configStatus",
    "policyId",
    "policyName",
    "serverId",
    "serverName",
    "syncPolicyId",
    "userGroupId"
})
public class RetAcmSyncPolicyInfo
    extends WSCommonResult
{

    @XmlElementRef(name = "autoSync", namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Boolean> autoSync;
    @XmlElementRef(name = "configStatus", namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> configStatus;
    @XmlElementRef(name = "policyId", namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> policyId;
    @XmlElementRef(name = "policyName", namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> policyName;
    @XmlElementRef(name = "serverId", namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> serverId;
    @XmlElementRef(name = "serverName", namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> serverName;
    @XmlElementRef(name = "syncPolicyId", namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Integer> syncPolicyId;
    @XmlElementRef(name = "userGroupId", namespace = "http://ldap.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<Long> userGroupId;

    /**
     * 获取autoSync属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAutoSync() {
        return autoSync;
    }

    /**
     * 设置autoSync属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAutoSync(JAXBElement<Boolean> value) {
        this.autoSync = value;
    }

    /**
     * 获取configStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getConfigStatus() {
        return configStatus;
    }

    /**
     * 设置configStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setConfigStatus(JAXBElement<Integer> value) {
        this.configStatus = value;
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
     * 获取serverId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getServerId() {
        return serverId;
    }

    /**
     * 设置serverId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setServerId(JAXBElement<Long> value) {
        this.serverId = value;
    }

    /**
     * 获取serverName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServerName() {
        return serverName;
    }

    /**
     * 设置serverName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServerName(JAXBElement<String> value) {
        this.serverName = value;
    }

    /**
     * 获取syncPolicyId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSyncPolicyId() {
        return syncPolicyId;
    }

    /**
     * 设置syncPolicyId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSyncPolicyId(JAXBElement<Integer> value) {
        this.syncPolicyId = value;
    }

    /**
     * 获取userGroupId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getUserGroupId() {
        return userGroupId;
    }

    /**
     * 设置userGroupId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setUserGroupId(JAXBElement<Long> value) {
        this.userGroupId = value;
    }

}
