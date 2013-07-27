
package com.h3c.imc.acm.feeservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.h3c.imc.acmws.fee.xsd.SelfPaymentInfo;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="param0" type="{http://fee.acmws.imc.h3c.com/xsd}SelfPaymentInfo" minOccurs="0"/>
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
@XmlRootElement(name = "selfPay")
public class SelfPay {

    @XmlElementRef(name = "param0", namespace = "http://acm.imc.h3c.com/feeService", type = JAXBElement.class)
    protected JAXBElement<SelfPaymentInfo> param0;

    /**
     * ��ȡparam0���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SelfPaymentInfo }{@code >}
     *     
     */
    public JAXBElement<SelfPaymentInfo> getParam0() {
        return param0;
    }

    /**
     * ����param0���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SelfPaymentInfo }{@code >}
     *     
     */
    public void setParam0(JAXBElement<SelfPaymentInfo> value) {
        this.param0 = value;
    }

}
