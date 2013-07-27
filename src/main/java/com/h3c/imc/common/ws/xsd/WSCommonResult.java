
package com.h3c.imc.common.ws.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.h3c.imc.acmws.fee.accessuser.xsd.RetAcmUserServiceList;
import com.h3c.imc.acmws.fee.bill.xsd.RetAcmBillDetailList;
import com.h3c.imc.acmws.fee.bill.xsd.RetAcmUserBillList;
import com.h3c.imc.acmws.fee.paymentrecord.xsd.RetPaymentRecordList;
import com.h3c.imc.acmws.fee.xsd.RandomInfo;
import com.h3c.imc.acmws.fee.xsd.RetUserBalance;


/**
 * <p>WSCommonResult complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WSCommonResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="errorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSCommonResult", propOrder = {
    "description",
    "errorCode",
    "errorMsg"
})
@XmlSeeAlso({
    RetAcmBillDetailList.class,
    RetAcmUserBillList.class,
    RetAcmUserServiceList.class,
    RetPaymentRecordList.class,
    RetUserBalance.class,
    RandomInfo.class
})
public class WSCommonResult {

    @XmlElementRef(name = "description", namespace = "http://ws.common.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> description;
    protected Integer errorCode;
    @XmlElementRef(name = "errorMsg", namespace = "http://ws.common.imc.h3c.com/xsd", type = JAXBElement.class)
    protected JAXBElement<String> errorMsg;

    /**
     * ��ȡdescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * ����description���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * ��ȡerrorCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * ����errorCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErrorCode(Integer value) {
        this.errorCode = value;
    }

    /**
     * ��ȡerrorMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorMsg() {
        return errorMsg;
    }

    /**
     * ����errorMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorMsg(JAXBElement<String> value) {
        this.errorMsg = value;
    }

}
