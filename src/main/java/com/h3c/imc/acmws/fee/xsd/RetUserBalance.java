
package com.h3c.imc.acmws.fee.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.h3c.imc.common.ws.xsd.WSCommonResult;


/**
 * <p>RetUserBalance complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RetUserBalance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.common.imc.h3c.com/xsd}WSCommonResult">
 *       &lt;sequence>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetUserBalance", propOrder = {
    "balance"
})
public class RetUserBalance
    extends WSCommonResult
{

    @XmlElementRef(name = "balance", namespace = "http://fee.acmws.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> balance;

    /**
     * 获取balance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBalance() {
        return balance;
    }

    /**
     * 设置balance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBalance(JAXBElement<String> value) {
        this.balance = value;
    }

}
