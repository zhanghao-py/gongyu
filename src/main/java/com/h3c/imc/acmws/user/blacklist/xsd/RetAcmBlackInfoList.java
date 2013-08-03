
package com.h3c.imc.acmws.user.blacklist.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.h3c.imc.common.ws.xsd.WSCommonResult;


/**
 * <p>RetAcmBlackInfoList complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RetAcmBlackInfoList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.common.imc.h3c.com/xsd}WSCommonResult">
 *       &lt;sequence>
 *         &lt;element name="retAcmBlackInfoList" type="{http://blacklist.user.acmws.imc.h3c.com/xsd}RetAcmBlackInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetAcmBlackInfoList", propOrder = {
    "retAcmBlackInfoList"
})
public class RetAcmBlackInfoList
    extends WSCommonResult
{

    @XmlElement(nillable = true)
    protected List<RetAcmBlackInfo> retAcmBlackInfoList;

    /**
     * Gets the value of the retAcmBlackInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retAcmBlackInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetAcmBlackInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetAcmBlackInfo }
     * 
     * 
     */
    public List<RetAcmBlackInfo> getRetAcmBlackInfoList() {
        if (retAcmBlackInfoList == null) {
            retAcmBlackInfoList = new ArrayList<RetAcmBlackInfo>();
        }
        return this.retAcmBlackInfoList;
    }

}
