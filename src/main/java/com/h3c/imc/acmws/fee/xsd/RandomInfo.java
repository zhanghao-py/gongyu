
package com.h3c.imc.acmws.fee.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.h3c.imc.common.ws.xsd.WSCommonResult;


/**
 * <p>RandomInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RandomInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.common.imc.h3c.com/xsd}WSCommonResult">
 *       &lt;sequence>
 *         &lt;element name="random" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RandomInfo", propOrder = {
    "random"
})
public class RandomInfo
    extends WSCommonResult
{

    @XmlElementRef(name = "random", namespace = "http://fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> random;

    /**
     * 获取random属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRandom() {
        return random;
    }

    /**
     * 设置random属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRandom(JAXBElement<String> value) {
        this.random = value;
    }

}
