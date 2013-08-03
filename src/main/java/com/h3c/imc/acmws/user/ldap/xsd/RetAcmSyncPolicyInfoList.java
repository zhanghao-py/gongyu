
package com.h3c.imc.acmws.user.ldap.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.h3c.imc.common.ws.xsd.WSCommonResult;


/**
 * <p>RetAcmSyncPolicyInfoList complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RetAcmSyncPolicyInfoList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.common.imc.h3c.com/xsd}WSCommonResult">
 *       &lt;sequence>
 *         &lt;element name="retAcmSyncPolicyInfoList" type="{http://ldap.user.acmws.imc.h3c.com/xsd}RetAcmSyncPolicyInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetAcmSyncPolicyInfoList", propOrder = {
    "retAcmSyncPolicyInfoList"
})
public class RetAcmSyncPolicyInfoList
    extends WSCommonResult
{

    @XmlElement(nillable = true)
    protected List<RetAcmSyncPolicyInfo> retAcmSyncPolicyInfoList;

    /**
     * Gets the value of the retAcmSyncPolicyInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retAcmSyncPolicyInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetAcmSyncPolicyInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetAcmSyncPolicyInfo }
     * 
     * 
     */
    public List<RetAcmSyncPolicyInfo> getRetAcmSyncPolicyInfoList() {
        if (retAcmSyncPolicyInfoList == null) {
            retAcmSyncPolicyInfoList = new ArrayList<RetAcmSyncPolicyInfo>();
        }
        return this.retAcmSyncPolicyInfoList;
    }

}
