
package com.h3c.imc.acmws.user.accessuser.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.h3c.imc.common.ws.xsd.WSCommonResult;


/**
 * <p>RetAcmUser complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RetAcmUser">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.common.imc.h3c.com/xsd}WSCommonResult">
 *       &lt;sequence>
 *         &lt;element name="acmUser" type="{http://accessuser.user.acmws.imc.h3c.com/xsd}AcmUser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetAcmUser", propOrder = {
    "acmUser"
})
public class RetAcmUser
    extends WSCommonResult
{

    @XmlElementRef(name = "acmUser", namespace = "http://accessuser.user.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<AcmUser> acmUser;

    /**
     * 获取acmUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcmUser }{@code >}
     *     
     */
    public JAXBElement<AcmUser> getAcmUser() {
        return acmUser;
    }

    /**
     * 设置acmUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcmUser }{@code >}
     *     
     */
    public void setAcmUser(JAXBElement<AcmUser> value) {
        this.acmUser = value;
    }

}
