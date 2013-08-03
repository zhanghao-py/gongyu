
package com.h3c.imc.acmws.user.ldap.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.h3c.imc.common.ws.xsd.WSCommonResult;


/**
 * <p>RetAcmSyncPolicyUserInfoList complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RetAcmSyncPolicyUserInfoList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.common.imc.h3c.com/xsd}WSCommonResult">
 *       &lt;sequence>
 *         &lt;element name="retAcmSyncPolicyUserInfoList" type="{http://ldap.user.acmws.imc.h3c.com/xsd}RetAcmSyncPolicyUserInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetAcmSyncPolicyUserInfoList", propOrder = {
    "retAcmSyncPolicyUserInfoList"
})
public class RetAcmSyncPolicyUserInfoList
    extends WSCommonResult
{

    @XmlElement(nillable = true)
    protected List<RetAcmSyncPolicyUserInfo> retAcmSyncPolicyUserInfoList;

    /**
     * Gets the value of the retAcmSyncPolicyUserInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retAcmSyncPolicyUserInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetAcmSyncPolicyUserInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetAcmSyncPolicyUserInfo }
     * 
     * 
     */
    public List<RetAcmSyncPolicyUserInfo> getRetAcmSyncPolicyUserInfoList() {
        if (retAcmSyncPolicyUserInfoList == null) {
            retAcmSyncPolicyUserInfoList = new ArrayList<RetAcmSyncPolicyUserInfo>();
        }
        return this.retAcmSyncPolicyUserInfoList;
    }

}
