
package com.h3c.imc.acm.acmuserservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.h3c.imc.acmws.user.service.xsd.AcmServiceTemplateQueryParam;


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
 *         &lt;element name="param0" type="{http://service.user.acmws.imc.h3c.com/xsd}AcmServiceTemplateQueryParam" minOccurs="0"/>
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
@XmlRootElement(name = "queryServiceTemplateList")
public class QueryServiceTemplateList {

    @XmlElementRef(name = "param0", namespace = "http://acm.imc.h3c.com/acmUserService", type = JAXBElement.class)
    protected JAXBElement<AcmServiceTemplateQueryParam> param0;

    /**
     * 获取param0属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcmServiceTemplateQueryParam }{@code >}
     *     
     */
    public JAXBElement<AcmServiceTemplateQueryParam> getParam0() {
        return param0;
    }

    /**
     * 设置param0属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcmServiceTemplateQueryParam }{@code >}
     *     
     */
    public void setParam0(JAXBElement<AcmServiceTemplateQueryParam> value) {
        this.param0 = value;
    }

}
