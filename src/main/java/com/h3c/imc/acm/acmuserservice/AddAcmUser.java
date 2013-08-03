
package com.h3c.imc.acm.acmuserservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.h3c.imc.acmws.user.accessuser.xsd.AddAcmUserParam;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="param0" type="{http://accessuser.user.acmws.imc.h3c.com/xsd}AddAcmUserParam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "param0"
})
@XmlRootElement(name = "addAcmUser")
public class AddAcmUser {

    @XmlElementRef(name = "param0", namespace = "http://acm.imc.h3c.com/acmUserService", type = JAXBElement.class)
    protected JAXBElement<AddAcmUserParam> param0;

    /**
     * 获取param0属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddAcmUserParam }{@code >}
     *     
     */
    public JAXBElement<AddAcmUserParam> getParam0() {
        return param0;
    }

    /**
     * 设置param0属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddAcmUserParam }{@code >}
     *     
     */
    public void setParam0(JAXBElement<AddAcmUserParam> value) {
        this.param0 = value;
    }

}
