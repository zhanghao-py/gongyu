
package com.h3c.imc.acmws.user.accessuser.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.h3c.imc.common.ws.xsd.WSCommonResult;


/**
 * <p>RetAcmUserList complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RetAcmUserList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.common.imc.h3c.com/xsd}WSCommonResult">
 *       &lt;sequence>
 *         &lt;element name="userSimpleInfoArray" type="{http://accessuser.user.acmws.imc.h3c.com/xsd}AcmUserSimpleInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetAcmUserList", propOrder = {
    "userSimpleInfoArray"
})
public class RetAcmUserList
    extends WSCommonResult
{

    @XmlElement(nillable = true)
    protected List<AcmUserSimpleInfo> userSimpleInfoArray;

    /**
     * Gets the value of the userSimpleInfoArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSimpleInfoArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSimpleInfoArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcmUserSimpleInfo }
     * 
     * 
     */
    public List<AcmUserSimpleInfo> getUserSimpleInfoArray() {
        if (userSimpleInfoArray == null) {
            userSimpleInfoArray = new ArrayList<AcmUserSimpleInfo>();
        }
        return this.userSimpleInfoArray;
    }

}
