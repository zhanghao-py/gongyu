
package com.h3c.imc.acm.acmuserservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.h3c.imc.acmws.user.service.xsd.RetCancelServiceInfo;


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
 *         &lt;element name="return" type="{http://service.user.acmws.imc.h3c.com/xsd}RetCancelServiceInfo" minOccurs="0"/>
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
    "_return"
})
@XmlRootElement(name = "cancelServiceResponse")
public class CancelServiceResponse {

    @XmlElementRef(name = "return", namespace = "http://acm.imc.h3c.com/acmUserService", type = JAXBElement.class)
    protected JAXBElement<RetCancelServiceInfo> _return;

    /**
     * 获取return属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetCancelServiceInfo }{@code >}
     *     
     */
    public JAXBElement<RetCancelServiceInfo> getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetCancelServiceInfo }{@code >}
     *     
     */
    public void setReturn(JAXBElement<RetCancelServiceInfo> value) {
        this._return = value;
    }

}
