
package com.h3c.imc.acm.acmuserservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.h3c.imc.acmws.user.accessuser.xsd.AcmUserListQueryParam;
import com.h3c.imc.acmws.user.accessuser.xsd.AddAcmUserParam;
import com.h3c.imc.acmws.user.accessuser.xsd.CancelAcmUserParam;
import com.h3c.imc.acmws.user.accessuser.xsd.ModifyAcmUserParam;
import com.h3c.imc.acmws.user.accessuser.xsd.ModifyUserPsdParam;
import com.h3c.imc.acmws.user.accessuser.xsd.RetAcmUser;
import com.h3c.imc.acmws.user.accessuser.xsd.RetAcmUserFullInfo;
import com.h3c.imc.acmws.user.accessuser.xsd.RetAcmUserList;
import com.h3c.imc.acmws.user.accessuser.xsd.RetAcmUserService;
import com.h3c.imc.acmws.user.accessuser.xsd.RetCancelUserInfo;
import com.h3c.imc.acmws.user.accessuser.xsd.RetPassword;
import com.h3c.imc.acmws.user.blacklist.xsd.AcmBlackQueryParam;
import com.h3c.imc.acmws.user.blacklist.xsd.RetAcmBlackInfoList;
import com.h3c.imc.acmws.user.ldap.xsd.AcmSyncPolicyQueryParam;
import com.h3c.imc.acmws.user.ldap.xsd.AcmSyncPolicyUserQueryParam;
import com.h3c.imc.acmws.user.ldap.xsd.RetAcmSyncPolicyInfoList;
import com.h3c.imc.acmws.user.ldap.xsd.RetAcmSyncPolicyUserInfoList;
import com.h3c.imc.acmws.user.onlineuser.xsd.AcmAccessDetailQueryParam;
import com.h3c.imc.acmws.user.onlineuser.xsd.AcmOnlineUserQueryParam;
import com.h3c.imc.acmws.user.onlineuser.xsd.RetAcmAccessDetailList;
import com.h3c.imc.acmws.user.onlineuser.xsd.RetAcmOnlineUserList;
import com.h3c.imc.acmws.user.parameter.xsd.RetSystemParameter;
import com.h3c.imc.acmws.user.security.xsd.RetRandomInfo;
import com.h3c.imc.acmws.user.service.xsd.AcmServiceTemplateQueryParam;
import com.h3c.imc.acmws.user.service.xsd.ApplyServiceParam;
import com.h3c.imc.acmws.user.service.xsd.CancelServiceParam;
import com.h3c.imc.acmws.user.service.xsd.RetAcmServiceTemplateInfoList;
import com.h3c.imc.acmws.user.service.xsd.RetCancelServiceInfo;
import com.h3c.imc.common.ws.xsd.WSCommonResult;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.h3c.imc.acm.acmuserservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ForceDeleteParam0_QNAME = new QName("http://acm.imc.h3c.com/acmUserService", "param0");
    private final static QName _QueryAcmUserServiceInfoResponseReturn_QNAME = new QName("http://acm.imc.h3c.com/acmUserService", "return");
    private final static QName _ModifyAcmUserCreateTimeParam1_QNAME = new QName("http://acm.imc.h3c.com/acmUserService", "param1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.h3c.imc.acm.acmuserservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryBlackListResponse }
     * 
     */
    public QueryBlackListResponse createQueryBlackListResponse() {
        return new QueryBlackListResponse();
    }

    /**
     * Create an instance of {@link QueryAcmAccessDetailList }
     * 
     */
    public QueryAcmAccessDetailList createQueryAcmAccessDetailList() {
        return new QueryAcmAccessDetailList();
    }

    /**
     * Create an instance of {@link CancelAcmUser }
     * 
     */
    public CancelAcmUser createCancelAcmUser() {
        return new CancelAcmUser();
    }

    /**
     * Create an instance of {@link QueryAcmUserFullInfo }
     * 
     */
    public QueryAcmUserFullInfo createQueryAcmUserFullInfo() {
        return new QueryAcmUserFullInfo();
    }

    /**
     * Create an instance of {@link QueryAcmUserServiceInfoResponse }
     * 
     */
    public QueryAcmUserServiceInfoResponse createQueryAcmUserServiceInfoResponse() {
        return new QueryAcmUserServiceInfoResponse();
    }

    /**
     * Create an instance of {@link CancelAcctUserResponse }
     * 
     */
    public CancelAcctUserResponse createCancelAcctUserResponse() {
        return new CancelAcctUserResponse();
    }

    /**
     * Create an instance of {@link CancelBindingUser }
     * 
     */
    public CancelBindingUser createCancelBindingUser() {
        return new CancelBindingUser();
    }

    /**
     * Create an instance of {@link SendMessage }
     * 
     */
    public SendMessage createSendMessage() {
        return new SendMessage();
    }

    /**
     * Create an instance of {@link QueryAcmUserResponse }
     * 
     */
    public QueryAcmUserResponse createQueryAcmUserResponse() {
        return new QueryAcmUserResponse();
    }

    /**
     * Create an instance of {@link CancelBindingUserResponse }
     * 
     */
    public CancelBindingUserResponse createCancelBindingUserResponse() {
        return new CancelBindingUserResponse();
    }

    /**
     * Create an instance of {@link AddBindingUser }
     * 
     */
    public AddBindingUser createAddBindingUser() {
        return new AddBindingUser();
    }

    /**
     * Create an instance of {@link QueryAcmUserList }
     * 
     */
    public QueryAcmUserList createQueryAcmUserList() {
        return new QueryAcmUserList();
    }

    /**
     * Create an instance of {@link CancelAcmUserResponse }
     * 
     */
    public CancelAcmUserResponse createCancelAcmUserResponse() {
        return new CancelAcmUserResponse();
    }

    /**
     * Create an instance of {@link ModifyInvalidTimeResponse }
     * 
     */
    public ModifyInvalidTimeResponse createModifyInvalidTimeResponse() {
        return new ModifyInvalidTimeResponse();
    }

    /**
     * Create an instance of {@link RandomReqResponse }
     * 
     */
    public RandomReqResponse createRandomReqResponse() {
        return new RandomReqResponse();
    }

    /**
     * Create an instance of {@link QueryParameterByName }
     * 
     */
    public QueryParameterByName createQueryParameterByName() {
        return new QueryParameterByName();
    }

    /**
     * Create an instance of {@link QuerySyncPolicyInfoList }
     * 
     */
    public QuerySyncPolicyInfoList createQuerySyncPolicyInfoList() {
        return new QuerySyncPolicyInfoList();
    }

    /**
     * Create an instance of {@link QueryAcmUserPasswordResponse }
     * 
     */
    public QueryAcmUserPasswordResponse createQueryAcmUserPasswordResponse() {
        return new QueryAcmUserPasswordResponse();
    }

    /**
     * Create an instance of {@link AddAcmUser }
     * 
     */
    public AddAcmUser createAddAcmUser() {
        return new AddAcmUser();
    }

    /**
     * Create an instance of {@link QueryAcmAccessDetailListResponse }
     * 
     */
    public QueryAcmAccessDetailListResponse createQueryAcmAccessDetailListResponse() {
        return new QueryAcmAccessDetailListResponse();
    }

    /**
     * Create an instance of {@link QuerySyncPolicyUserInfoListResponse }
     * 
     */
    public QuerySyncPolicyUserInfoListResponse createQuerySyncPolicyUserInfoListResponse() {
        return new QuerySyncPolicyUserInfoListResponse();
    }

    /**
     * Create an instance of {@link CancelServiceResponse }
     * 
     */
    public CancelServiceResponse createCancelServiceResponse() {
        return new CancelServiceResponse();
    }

    /**
     * Create an instance of {@link AddBindingUserResponse }
     * 
     */
    public AddBindingUserResponse createAddBindingUserResponse() {
        return new AddBindingUserResponse();
    }

    /**
     * Create an instance of {@link ForceDeleteResponse }
     * 
     */
    public ForceDeleteResponse createForceDeleteResponse() {
        return new ForceDeleteResponse();
    }

    /**
     * Create an instance of {@link SendMessageResponse }
     * 
     */
    public SendMessageResponse createSendMessageResponse() {
        return new SendMessageResponse();
    }

    /**
     * Create an instance of {@link KickOutResponse }
     * 
     */
    public KickOutResponse createKickOutResponse() {
        return new KickOutResponse();
    }

    /**
     * Create an instance of {@link ClearOnlineInfo }
     * 
     */
    public ClearOnlineInfo createClearOnlineInfo() {
        return new ClearOnlineInfo();
    }

    /**
     * Create an instance of {@link ModifyAcmUserCreateTimeResponse }
     * 
     */
    public ModifyAcmUserCreateTimeResponse createModifyAcmUserCreateTimeResponse() {
        return new ModifyAcmUserCreateTimeResponse();
    }

    /**
     * Create an instance of {@link RemoveBlackListResponse }
     * 
     */
    public RemoveBlackListResponse createRemoveBlackListResponse() {
        return new RemoveBlackListResponse();
    }

    /**
     * Create an instance of {@link QueryAcmUserFullInfoResponse }
     * 
     */
    public QueryAcmUserFullInfoResponse createQueryAcmUserFullInfoResponse() {
        return new QueryAcmUserFullInfoResponse();
    }

    /**
     * Create an instance of {@link AddBlackListResponse }
     * 
     */
    public AddBlackListResponse createAddBlackListResponse() {
        return new AddBlackListResponse();
    }

    /**
     * Create an instance of {@link KickOut }
     * 
     */
    public KickOut createKickOut() {
        return new KickOut();
    }

    /**
     * Create an instance of {@link QueryAcmUserByPlatUserId }
     * 
     */
    public QueryAcmUserByPlatUserId createQueryAcmUserByPlatUserId() {
        return new QueryAcmUserByPlatUserId();
    }

    /**
     * Create an instance of {@link CancelService }
     * 
     */
    public CancelService createCancelService() {
        return new CancelService();
    }

    /**
     * Create an instance of {@link QueryParameterByNameResponse }
     * 
     */
    public QueryParameterByNameResponse createQueryParameterByNameResponse() {
        return new QueryParameterByNameResponse();
    }

    /**
     * Create an instance of {@link QueryAcmOnlineUserList }
     * 
     */
    public QueryAcmOnlineUserList createQueryAcmOnlineUserList() {
        return new QueryAcmOnlineUserList();
    }

    /**
     * Create an instance of {@link ModifyAcmUserCreateTime }
     * 
     */
    public ModifyAcmUserCreateTime createModifyAcmUserCreateTime() {
        return new ModifyAcmUserCreateTime();
    }

    /**
     * Create an instance of {@link ModifyAcmUser }
     * 
     */
    public ModifyAcmUser createModifyAcmUser() {
        return new ModifyAcmUser();
    }

    /**
     * Create an instance of {@link ForceLogoutResponse }
     * 
     */
    public ForceLogoutResponse createForceLogoutResponse() {
        return new ForceLogoutResponse();
    }

    /**
     * Create an instance of {@link ForceLogout }
     * 
     */
    public ForceLogout createForceLogout() {
        return new ForceLogout();
    }

    /**
     * Create an instance of {@link QueryAcmOnlineUserListResponse }
     * 
     */
    public QueryAcmOnlineUserListResponse createQueryAcmOnlineUserListResponse() {
        return new QueryAcmOnlineUserListResponse();
    }

    /**
     * Create an instance of {@link ApplyService }
     * 
     */
    public ApplyService createApplyService() {
        return new ApplyService();
    }

    /**
     * Create an instance of {@link QueryServiceTemplateList }
     * 
     */
    public QueryServiceTemplateList createQueryServiceTemplateList() {
        return new QueryServiceTemplateList();
    }

    /**
     * Create an instance of {@link QueryAcmUserServiceInfo }
     * 
     */
    public QueryAcmUserServiceInfo createQueryAcmUserServiceInfo() {
        return new QueryAcmUserServiceInfo();
    }

    /**
     * Create an instance of {@link ModifyAcmUserResponse }
     * 
     */
    public ModifyAcmUserResponse createModifyAcmUserResponse() {
        return new ModifyAcmUserResponse();
    }

    /**
     * Create an instance of {@link QuerySyncPolicyInfoListResponse }
     * 
     */
    public QuerySyncPolicyInfoListResponse createQuerySyncPolicyInfoListResponse() {
        return new QuerySyncPolicyInfoListResponse();
    }

    /**
     * Create an instance of {@link ApplyServiceResponse }
     * 
     */
    public ApplyServiceResponse createApplyServiceResponse() {
        return new ApplyServiceResponse();
    }

    /**
     * Create an instance of {@link QueryAcmUser }
     * 
     */
    public QueryAcmUser createQueryAcmUser() {
        return new QueryAcmUser();
    }

    /**
     * Create an instance of {@link ModifyInvalidTime }
     * 
     */
    public ModifyInvalidTime createModifyInvalidTime() {
        return new ModifyInvalidTime();
    }

    /**
     * Create an instance of {@link QueryAcmUserPassword }
     * 
     */
    public QueryAcmUserPassword createQueryAcmUserPassword() {
        return new QueryAcmUserPassword();
    }

    /**
     * Create an instance of {@link RemoveBlackList }
     * 
     */
    public RemoveBlackList createRemoveBlackList() {
        return new RemoveBlackList();
    }

    /**
     * Create an instance of {@link QueryBlackList }
     * 
     */
    public QueryBlackList createQueryBlackList() {
        return new QueryBlackList();
    }

    /**
     * Create an instance of {@link QueryServiceTemplateListResponse }
     * 
     */
    public QueryServiceTemplateListResponse createQueryServiceTemplateListResponse() {
        return new QueryServiceTemplateListResponse();
    }

    /**
     * Create an instance of {@link ModifyUserPassword }
     * 
     */
    public ModifyUserPassword createModifyUserPassword() {
        return new ModifyUserPassword();
    }

    /**
     * Create an instance of {@link QuerySyncPolicyUserInfoList }
     * 
     */
    public QuerySyncPolicyUserInfoList createQuerySyncPolicyUserInfoList() {
        return new QuerySyncPolicyUserInfoList();
    }

    /**
     * Create an instance of {@link AddBlackList }
     * 
     */
    public AddBlackList createAddBlackList() {
        return new AddBlackList();
    }

    /**
     * Create an instance of {@link ClearOnlineInfoResponse }
     * 
     */
    public ClearOnlineInfoResponse createClearOnlineInfoResponse() {
        return new ClearOnlineInfoResponse();
    }

    /**
     * Create an instance of {@link QueryAcmUserByPlatUserIdResponse }
     * 
     */
    public QueryAcmUserByPlatUserIdResponse createQueryAcmUserByPlatUserIdResponse() {
        return new QueryAcmUserByPlatUserIdResponse();
    }

    /**
     * Create an instance of {@link AddAcmUserResponse }
     * 
     */
    public AddAcmUserResponse createAddAcmUserResponse() {
        return new AddAcmUserResponse();
    }

    /**
     * Create an instance of {@link ModifyUserPasswordResponse }
     * 
     */
    public ModifyUserPasswordResponse createModifyUserPasswordResponse() {
        return new ModifyUserPasswordResponse();
    }

    /**
     * Create an instance of {@link CancelAcctUser }
     * 
     */
    public CancelAcctUser createCancelAcctUser() {
        return new CancelAcctUser();
    }

    /**
     * Create an instance of {@link QueryAcmUserListResponse }
     * 
     */
    public QueryAcmUserListResponse createQueryAcmUserListResponse() {
        return new QueryAcmUserListResponse();
    }

    /**
     * Create an instance of {@link ForceDelete }
     * 
     */
    public ForceDelete createForceDelete() {
        return new ForceDelete();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "param0", scope = ForceDelete.class)
    public JAXBElement<String> createForceDeleteParam0(String value) {
        return new JAXBElement<String>(_ForceDeleteParam0_QNAME, String.class, ForceDelete.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "param0", scope = RemoveBlackList.class)
    public JAXBElement<String> createRemoveBlackListParam0(String value) {
        return new JAXBElement<String>(_ForceDeleteParam0_QNAME, String.class, RemoveBlackList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetAcmUserService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = QueryAcmUserServiceInfoResponse.class)
    public JAXBElement<RetAcmUserService> createQueryAcmUserServiceInfoResponseReturn(RetAcmUserService value) {
        return new JAXBElement<RetAcmUserService>(_QueryAcmUserServiceInfoResponseReturn_QNAME, RetAcmUserService.class, QueryAcmUserServiceInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetAcmSyncPolicyInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = QuerySyncPolicyInfoListResponse.class)
    public JAXBElement<RetAcmSyncPolicyInfoList> createQuerySyncPolicyInfoListResponseReturn(RetAcmSyncPolicyInfoList value) {
        return new JAXBElement<RetAcmSyncPolicyInfoList>(_QueryAcmUserServiceInfoResponseReturn_QNAME, RetAcmSyncPolicyInfoList.class, QuerySyncPolicyInfoListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCommonResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = ForceDeleteResponse.class)
    public JAXBElement<WSCommonResult> createForceDeleteResponseReturn(WSCommonResult value) {
        return new JAXBElement<WSCommonResult>(_QueryAcmUserServiceInfoResponseReturn_QNAME, WSCommonResult.class, ForceDeleteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyUserPsdParam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "param0", scope = ModifyUserPassword.class)
    public JAXBElement<ModifyUserPsdParam> createModifyUserPasswordParam0(ModifyUserPsdParam value) {
        return new JAXBElement<ModifyUserPsdParam>(_ForceDeleteParam0_QNAME, ModifyUserPsdParam.class, ModifyUserPassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcmServiceTemplateQueryParam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "param0", scope = QueryServiceTemplateList.class)
    public JAXBElement<AcmServiceTemplateQueryParam> createQueryServiceTemplateListParam0(AcmServiceTemplateQueryParam value) {
        return new JAXBElement<AcmServiceTemplateQueryParam>(_ForceDeleteParam0_QNAME, AcmServiceTemplateQueryParam.class, QueryServiceTemplateList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCommonResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = AddBindingUserResponse.class)
    public JAXBElement<WSCommonResult> createAddBindingUserResponseReturn(WSCommonResult value) {
        return new JAXBElement<WSCommonResult>(_QueryAcmUserServiceInfoResponseReturn_QNAME, WSCommonResult.class, AddBindingUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetAcmUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = QueryAcmUserResponse.class)
    public JAXBElement<RetAcmUser> createQueryAcmUserResponseReturn(RetAcmUser value) {
        return new JAXBElement<RetAcmUser>(_QueryAcmUserServiceInfoResponseReturn_QNAME, RetAcmUser.class, QueryAcmUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetAcmSyncPolicyUserInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = QuerySyncPolicyUserInfoListResponse.class)
    public JAXBElement<RetAcmSyncPolicyUserInfoList> createQuerySyncPolicyUserInfoListResponseReturn(RetAcmSyncPolicyUserInfoList value) {
        return new JAXBElement<RetAcmSyncPolicyUserInfoList>(_QueryAcmUserServiceInfoResponseReturn_QNAME, RetAcmSyncPolicyUserInfoList.class, QuerySyncPolicyUserInfoListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelServiceParam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "param0", scope = CancelService.class)
    public JAXBElement<CancelServiceParam> createCancelServiceParam0(CancelServiceParam value) {
        return new JAXBElement<CancelServiceParam>(_ForceDeleteParam0_QNAME, CancelServiceParam.class, CancelService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetCancelServiceInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = CancelServiceResponse.class)
    public JAXBElement<RetCancelServiceInfo> createCancelServiceResponseReturn(RetCancelServiceInfo value) {
        return new JAXBElement<RetCancelServiceInfo>(_QueryAcmUserServiceInfoResponseReturn_QNAME, RetCancelServiceInfo.class, CancelServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcmAccessDetailQueryParam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "param0", scope = QueryAcmAccessDetailList.class)
    public JAXBElement<AcmAccessDetailQueryParam> createQueryAcmAccessDetailListParam0(AcmAccessDetailQueryParam value) {
        return new JAXBElement<AcmAccessDetailQueryParam>(_ForceDeleteParam0_QNAME, AcmAccessDetailQueryParam.class, QueryAcmAccessDetailList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetRandomInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = RandomReqResponse.class)
    public JAXBElement<RetRandomInfo> createRandomReqResponseReturn(RetRandomInfo value) {
        return new JAXBElement<RetRandomInfo>(_QueryAcmUserServiceInfoResponseReturn_QNAME, RetRandomInfo.class, RandomReqResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "param0", scope = ModifyAcmUserCreateTime.class)
    public JAXBElement<String> createModifyAcmUserCreateTimeParam0(String value) {
        return new JAXBElement<String>(_ForceDeleteParam0_QNAME, String.class, ModifyAcmUserCreateTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "param1", scope = ModifyAcmUserCreateTime.class)
    public JAXBElement<XMLGregorianCalendar> createModifyAcmUserCreateTimeParam1(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ModifyAcmUserCreateTimeParam1_QNAME, XMLGregorianCalendar.class, ModifyAcmUserCreateTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCommonResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = SendMessageResponse.class)
    public JAXBElement<WSCommonResult> createSendMessageResponseReturn(WSCommonResult value) {
        return new JAXBElement<WSCommonResult>(_QueryAcmUserServiceInfoResponseReturn_QNAME, WSCommonResult.class, SendMessageResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetAcmAccessDetailList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = QueryAcmAccessDetailListResponse.class)
    public JAXBElement<RetAcmAccessDetailList> createQueryAcmAccessDetailListResponseReturn(RetAcmAccessDetailList value) {
        return new JAXBElement<RetAcmAccessDetailList>(_QueryAcmUserServiceInfoResponseReturn_QNAME, RetAcmAccessDetailList.class, QueryAcmAccessDetailListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCommonResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = ModifyUserPasswordResponse.class)
    public JAXBElement<WSCommonResult> createModifyUserPasswordResponseReturn(WSCommonResult value) {
        return new JAXBElement<WSCommonResult>(_QueryAcmUserServiceInfoResponseReturn_QNAME, WSCommonResult.class, ModifyUserPasswordResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCommonResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = ModifyAcmUserResponse.class)
    public JAXBElement<WSCommonResult> createModifyAcmUserResponseReturn(WSCommonResult value) {
        return new JAXBElement<WSCommonResult>(_QueryAcmUserServiceInfoResponseReturn_QNAME, WSCommonResult.class, ModifyAcmUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcmUserListQueryParam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "param0", scope = QueryAcmUserList.class)
    public JAXBElement<AcmUserListQueryParam> createQueryAcmUserListParam0(AcmUserListQueryParam value) {
        return new JAXBElement<AcmUserListQueryParam>(_ForceDeleteParam0_QNAME, AcmUserListQueryParam.class, QueryAcmUserList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "param0", scope = ForceLogout.class)
    public JAXBElement<String> createForceLogoutParam0(String value) {
        return new JAXBElement<String>(_ForceDeleteParam0_QNAME, String.class, ForceLogout.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetPassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = QueryAcmUserPasswordResponse.class)
    public JAXBElement<RetPassword> createQueryAcmUserPasswordResponseReturn(RetPassword value) {
        return new JAXBElement<RetPassword>(_QueryAcmUserServiceInfoResponseReturn_QNAME, RetPassword.class, QueryAcmUserPasswordResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetAcmOnlineUserList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = QueryAcmOnlineUserListResponse.class)
    public JAXBElement<RetAcmOnlineUserList> createQueryAcmOnlineUserListResponseReturn(RetAcmOnlineUserList value) {
        return new JAXBElement<RetAcmOnlineUserList>(_QueryAcmUserServiceInfoResponseReturn_QNAME, RetAcmOnlineUserList.class, QueryAcmOnlineUserListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcmSyncPolicyUserQueryParam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "param0", scope = QuerySyncPolicyUserInfoList.class)
    public JAXBElement<AcmSyncPolicyUserQueryParam> createQuerySyncPolicyUserInfoListParam0(AcmSyncPolicyUserQueryParam value) {
        return new JAXBElement<AcmSyncPolicyUserQueryParam>(_ForceDeleteParam0_QNAME, AcmSyncPolicyUserQueryParam.class, QuerySyncPolicyUserInfoList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "param1", scope = SendMessage.class)
    public JAXBElement<String> createSendMessageParam1(String value) {
        return new JAXBElement<String>(_ModifyAcmUserCreateTimeParam1_QNAME, String.class, SendMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetAcmServiceTemplateInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = QueryServiceTemplateListResponse.class)
    public JAXBElement<RetAcmServiceTemplateInfoList> createQueryServiceTemplateListResponseReturn(RetAcmServiceTemplateInfoList value) {
        return new JAXBElement<RetAcmServiceTemplateInfoList>(_QueryAcmUserServiceInfoResponseReturn_QNAME, RetAcmServiceTemplateInfoList.class, QueryServiceTemplateListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetSystemParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = QueryParameterByNameResponse.class)
    public JAXBElement<RetSystemParameter> createQueryParameterByNameResponseReturn(RetSystemParameter value) {
        return new JAXBElement<RetSystemParameter>(_QueryAcmUserServiceInfoResponseReturn_QNAME, RetSystemParameter.class, QueryParameterByNameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcmOnlineUserQueryParam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "param0", scope = QueryAcmOnlineUserList.class)
    public JAXBElement<AcmOnlineUserQueryParam> createQueryAcmOnlineUserListParam0(AcmOnlineUserQueryParam value) {
        return new JAXBElement<AcmOnlineUserQueryParam>(_ForceDeleteParam0_QNAME, AcmOnlineUserQueryParam.class, QueryAcmOnlineUserList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "param0", scope = CancelAcmUser.class)
    public JAXBElement<String> createCancelAcmUserParam0(String value) {
        return new JAXBElement<String>(_ForceDeleteParam0_QNAME, String.class, CancelAcmUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyAcmUserParam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "param0", scope = ModifyAcmUser.class)
    public JAXBElement<ModifyAcmUserParam> createModifyAcmUserParam0(ModifyAcmUserParam value) {
        return new JAXBElement<ModifyAcmUserParam>(_ForceDeleteParam0_QNAME, ModifyAcmUserParam.class, ModifyAcmUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcmSyncPolicyQueryParam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "param0", scope = QuerySyncPolicyInfoList.class)
    public JAXBElement<AcmSyncPolicyQueryParam> createQuerySyncPolicyInfoListParam0(AcmSyncPolicyQueryParam value) {
        return new JAXBElement<AcmSyncPolicyQueryParam>(_ForceDeleteParam0_QNAME, AcmSyncPolicyQueryParam.class, QuerySyncPolicyInfoList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetCancelUserInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = CancelAcctUserResponse.class)
    public JAXBElement<RetCancelUserInfo> createCancelAcctUserResponseReturn(RetCancelUserInfo value) {
        return new JAXBElement<RetCancelUserInfo>(_QueryAcmUserServiceInfoResponseReturn_QNAME, RetCancelUserInfo.class, CancelAcctUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "param0", scope = QueryAcmUserServiceInfo.class)
    public JAXBElement<String> createQueryAcmUserServiceInfoParam0(String value) {
        return new JAXBElement<String>(_ForceDeleteParam0_QNAME, String.class, QueryAcmUserServiceInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCommonResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = RemoveBlackListResponse.class)
    public JAXBElement<WSCommonResult> createRemoveBlackListResponseReturn(WSCommonResult value) {
        return new JAXBElement<WSCommonResult>(_QueryAcmUserServiceInfoResponseReturn_QNAME, WSCommonResult.class, RemoveBlackListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCommonResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = ApplyServiceResponse.class)
    public JAXBElement<WSCommonResult> createApplyServiceResponseReturn(WSCommonResult value) {
        return new JAXBElement<WSCommonResult>(_QueryAcmUserServiceInfoResponseReturn_QNAME, WSCommonResult.class, ApplyServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCommonResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = ClearOnlineInfoResponse.class)
    public JAXBElement<WSCommonResult> createClearOnlineInfoResponseReturn(WSCommonResult value) {
        return new JAXBElement<WSCommonResult>(_QueryAcmUserServiceInfoResponseReturn_QNAME, WSCommonResult.class, ClearOnlineInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelAcmUserParam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "param0", scope = CancelAcctUser.class)
    public JAXBElement<CancelAcmUserParam> createCancelAcctUserParam0(CancelAcmUserParam value) {
        return new JAXBElement<CancelAcmUserParam>(_ForceDeleteParam0_QNAME, CancelAcmUserParam.class, CancelAcctUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetAcmBlackInfoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = QueryBlackListResponse.class)
    public JAXBElement<RetAcmBlackInfoList> createQueryBlackListResponseReturn(RetAcmBlackInfoList value) {
        return new JAXBElement<RetAcmBlackInfoList>(_QueryAcmUserServiceInfoResponseReturn_QNAME, RetAcmBlackInfoList.class, QueryBlackListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCommonResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = KickOutResponse.class)
    public JAXBElement<WSCommonResult> createKickOutResponseReturn(WSCommonResult value) {
        return new JAXBElement<WSCommonResult>(_QueryAcmUserServiceInfoResponseReturn_QNAME, WSCommonResult.class, KickOutResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "param0", scope = QueryParameterByName.class)
    public JAXBElement<String> createQueryParameterByNameParam0(String value) {
        return new JAXBElement<String>(_ForceDeleteParam0_QNAME, String.class, QueryParameterByName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCommonResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = ModifyInvalidTimeResponse.class)
    public JAXBElement<WSCommonResult> createModifyInvalidTimeResponseReturn(WSCommonResult value) {
        return new JAXBElement<WSCommonResult>(_QueryAcmUserServiceInfoResponseReturn_QNAME, WSCommonResult.class, ModifyInvalidTimeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAcmUserParam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "param0", scope = AddAcmUser.class)
    public JAXBElement<AddAcmUserParam> createAddAcmUserParam0(AddAcmUserParam value) {
        return new JAXBElement<AddAcmUserParam>(_ForceDeleteParam0_QNAME, AddAcmUserParam.class, AddAcmUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCommonResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = ModifyAcmUserCreateTimeResponse.class)
    public JAXBElement<WSCommonResult> createModifyAcmUserCreateTimeResponseReturn(WSCommonResult value) {
        return new JAXBElement<WSCommonResult>(_QueryAcmUserServiceInfoResponseReturn_QNAME, WSCommonResult.class, ModifyAcmUserCreateTimeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetAcmUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = QueryAcmUserByPlatUserIdResponse.class)
    public JAXBElement<RetAcmUser> createQueryAcmUserByPlatUserIdResponseReturn(RetAcmUser value) {
        return new JAXBElement<RetAcmUser>(_QueryAcmUserServiceInfoResponseReturn_QNAME, RetAcmUser.class, QueryAcmUserByPlatUserIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "param0", scope = QueryAcmUser.class)
    public JAXBElement<String> createQueryAcmUserParam0(String value) {
        return new JAXBElement<String>(_ForceDeleteParam0_QNAME, String.class, QueryAcmUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "param0", scope = AddBlackList.class)
    public JAXBElement<String> createAddBlackListParam0(String value) {
        return new JAXBElement<String>(_ForceDeleteParam0_QNAME, String.class, AddBlackList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCommonResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = AddBlackListResponse.class)
    public JAXBElement<WSCommonResult> createAddBlackListResponseReturn(WSCommonResult value) {
        return new JAXBElement<WSCommonResult>(_QueryAcmUserServiceInfoResponseReturn_QNAME, WSCommonResult.class, AddBlackListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetAcmUserList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = QueryAcmUserListResponse.class)
    public JAXBElement<RetAcmUserList> createQueryAcmUserListResponseReturn(RetAcmUserList value) {
        return new JAXBElement<RetAcmUserList>(_QueryAcmUserServiceInfoResponseReturn_QNAME, RetAcmUserList.class, QueryAcmUserListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCommonResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = CancelAcmUserResponse.class)
    public JAXBElement<WSCommonResult> createCancelAcmUserResponseReturn(WSCommonResult value) {
        return new JAXBElement<WSCommonResult>(_QueryAcmUserServiceInfoResponseReturn_QNAME, WSCommonResult.class, CancelAcmUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCommonResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = CancelBindingUserResponse.class)
    public JAXBElement<WSCommonResult> createCancelBindingUserResponseReturn(WSCommonResult value) {
        return new JAXBElement<WSCommonResult>(_QueryAcmUserServiceInfoResponseReturn_QNAME, WSCommonResult.class, CancelBindingUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCommonResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = ForceLogoutResponse.class)
    public JAXBElement<WSCommonResult> createForceLogoutResponseReturn(WSCommonResult value) {
        return new JAXBElement<WSCommonResult>(_QueryAcmUserServiceInfoResponseReturn_QNAME, WSCommonResult.class, ForceLogoutResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplyServiceParam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "param0", scope = ApplyService.class)
    public JAXBElement<ApplyServiceParam> createApplyServiceParam0(ApplyServiceParam value) {
        return new JAXBElement<ApplyServiceParam>(_ForceDeleteParam0_QNAME, ApplyServiceParam.class, ApplyService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "param0", scope = QueryAcmUserPassword.class)
    public JAXBElement<String> createQueryAcmUserPasswordParam0(String value) {
        return new JAXBElement<String>(_ForceDeleteParam0_QNAME, String.class, QueryAcmUserPassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetAcmUserFullInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = QueryAcmUserFullInfoResponse.class)
    public JAXBElement<RetAcmUserFullInfo> createQueryAcmUserFullInfoResponseReturn(RetAcmUserFullInfo value) {
        return new JAXBElement<RetAcmUserFullInfo>(_QueryAcmUserServiceInfoResponseReturn_QNAME, RetAcmUserFullInfo.class, QueryAcmUserFullInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCommonResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "return", scope = AddAcmUserResponse.class)
    public JAXBElement<WSCommonResult> createAddAcmUserResponseReturn(WSCommonResult value) {
        return new JAXBElement<WSCommonResult>(_QueryAcmUserServiceInfoResponseReturn_QNAME, WSCommonResult.class, AddAcmUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcmBlackQueryParam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "param0", scope = QueryBlackList.class)
    public JAXBElement<AcmBlackQueryParam> createQueryBlackListParam0(AcmBlackQueryParam value) {
        return new JAXBElement<AcmBlackQueryParam>(_ForceDeleteParam0_QNAME, AcmBlackQueryParam.class, QueryBlackList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "param1", scope = ModifyInvalidTime.class)
    public JAXBElement<XMLGregorianCalendar> createModifyInvalidTimeParam1(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ModifyAcmUserCreateTimeParam1_QNAME, XMLGregorianCalendar.class, ModifyInvalidTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/acmUserService", name = "param0", scope = QueryAcmUserFullInfo.class)
    public JAXBElement<String> createQueryAcmUserFullInfoParam0(String value) {
        return new JAXBElement<String>(_ForceDeleteParam0_QNAME, String.class, QueryAcmUserFullInfo.class, value);
    }

}
