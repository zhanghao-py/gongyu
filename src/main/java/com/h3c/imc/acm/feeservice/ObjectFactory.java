
package com.h3c.imc.acm.feeservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.h3c.imc.acmws.fee.accessuser.xsd.RetAcmUserServiceList;
import com.h3c.imc.acmws.fee.bill.xsd.RetAcmBillDetailList;
import com.h3c.imc.acmws.fee.bill.xsd.RetAcmUserBillList;
import com.h3c.imc.acmws.fee.paymentrecord.xsd.RetPaymentRecordList;
import com.h3c.imc.acmws.fee.xsd.PaymentInfo;
import com.h3c.imc.acmws.fee.xsd.RandomInfo;
import com.h3c.imc.acmws.fee.xsd.RetUserBalance;
import com.h3c.imc.acmws.fee.xsd.SelfPaymentInfo;
import com.h3c.imc.common.ws.xsd.WSCommonResult;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.h3c.imc.acm.feeservice package. 
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

    private final static QName _QueryBalanceResponseReturn_QNAME = new QName("http://acm.imc.h3c.com/feeService", "return");
    private final static QName _SelfPayParam0_QNAME = new QName("http://acm.imc.h3c.com/feeService", "param0");
    private final static QName _SuspendUserByIdParam1_QNAME = new QName("http://acm.imc.h3c.com/feeService", "param1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.h3c.imc.acm.feeservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryBillDetailByBillId }
     * 
     */
    public QueryBillDetailByBillId createQueryBillDetailByBillId() {
        return new QueryBillDetailByBillId();
    }

    /**
     * Create an instance of {@link QueryBalance }
     * 
     */
    public QueryBalance createQueryBalance() {
        return new QueryBalance();
    }

    /**
     * Create an instance of {@link RandomReqResponse }
     * 
     */
    public RandomReqResponse createRandomReqResponse() {
        return new RandomReqResponse();
    }

    /**
     * Create an instance of {@link SelfPayResponse }
     * 
     */
    public SelfPayResponse createSelfPayResponse() {
        return new SelfPayResponse();
    }

    /**
     * Create an instance of {@link QueryAcmUserServiceResponse }
     * 
     */
    public QueryAcmUserServiceResponse createQueryAcmUserServiceResponse() {
        return new QueryAcmUserServiceResponse();
    }

    /**
     * Create an instance of {@link CancelSuspendUserById }
     * 
     */
    public CancelSuspendUserById createCancelSuspendUserById() {
        return new CancelSuspendUserById();
    }

    /**
     * Create an instance of {@link QueryPaymentRecordResponse }
     * 
     */
    public QueryPaymentRecordResponse createQueryPaymentRecordResponse() {
        return new QueryPaymentRecordResponse();
    }

    /**
     * Create an instance of {@link SelfPay }
     * 
     */
    public SelfPay createSelfPay() {
        return new SelfPay();
    }

    /**
     * Create an instance of {@link QueryBillByUserIdResponse }
     * 
     */
    public QueryBillByUserIdResponse createQueryBillByUserIdResponse() {
        return new QueryBillByUserIdResponse();
    }

    /**
     * Create an instance of {@link SuspendUserById }
     * 
     */
    public SuspendUserById createSuspendUserById() {
        return new SuspendUserById();
    }

    /**
     * Create an instance of {@link QueryBillByUserId }
     * 
     */
    public QueryBillByUserId createQueryBillByUserId() {
        return new QueryBillByUserId();
    }

    /**
     * Create an instance of {@link QueryBillDetailByBillIdResponse }
     * 
     */
    public QueryBillDetailByBillIdResponse createQueryBillDetailByBillIdResponse() {
        return new QueryBillDetailByBillIdResponse();
    }

    /**
     * Create an instance of {@link PayResponse }
     * 
     */
    public PayResponse createPayResponse() {
        return new PayResponse();
    }

    /**
     * Create an instance of {@link QueryBalanceResponse }
     * 
     */
    public QueryBalanceResponse createQueryBalanceResponse() {
        return new QueryBalanceResponse();
    }

    /**
     * Create an instance of {@link SuspendUserByIdResponse }
     * 
     */
    public SuspendUserByIdResponse createSuspendUserByIdResponse() {
        return new SuspendUserByIdResponse();
    }

    /**
     * Create an instance of {@link Pay }
     * 
     */
    public Pay createPay() {
        return new Pay();
    }

    /**
     * Create an instance of {@link QueryAcmUserService }
     * 
     */
    public QueryAcmUserService createQueryAcmUserService() {
        return new QueryAcmUserService();
    }

    /**
     * Create an instance of {@link CancelSuspendUserByIdResponse }
     * 
     */
    public CancelSuspendUserByIdResponse createCancelSuspendUserByIdResponse() {
        return new CancelSuspendUserByIdResponse();
    }

    /**
     * Create an instance of {@link QueryPaymentRecord }
     * 
     */
    public QueryPaymentRecord createQueryPaymentRecord() {
        return new QueryPaymentRecord();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetUserBalance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/feeService", name = "return", scope = QueryBalanceResponse.class)
    public JAXBElement<RetUserBalance> createQueryBalanceResponseReturn(RetUserBalance value) {
        return new JAXBElement<RetUserBalance>(_QueryBalanceResponseReturn_QNAME, RetUserBalance.class, QueryBalanceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetAcmUserBillList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/feeService", name = "return", scope = QueryBillByUserIdResponse.class)
    public JAXBElement<RetAcmUserBillList> createQueryBillByUserIdResponseReturn(RetAcmUserBillList value) {
        return new JAXBElement<RetAcmUserBillList>(_QueryBalanceResponseReturn_QNAME, RetAcmUserBillList.class, QueryBillByUserIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetPaymentRecordList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/feeService", name = "return", scope = QueryPaymentRecordResponse.class)
    public JAXBElement<RetPaymentRecordList> createQueryPaymentRecordResponseReturn(RetPaymentRecordList value) {
        return new JAXBElement<RetPaymentRecordList>(_QueryBalanceResponseReturn_QNAME, RetPaymentRecordList.class, QueryPaymentRecordResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCommonResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/feeService", name = "return", scope = SelfPayResponse.class)
    public JAXBElement<WSCommonResult> createSelfPayResponseReturn(WSCommonResult value) {
        return new JAXBElement<WSCommonResult>(_QueryBalanceResponseReturn_QNAME, WSCommonResult.class, SelfPayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCommonResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/feeService", name = "return", scope = PayResponse.class)
    public JAXBElement<WSCommonResult> createPayResponseReturn(WSCommonResult value) {
        return new JAXBElement<WSCommonResult>(_QueryBalanceResponseReturn_QNAME, WSCommonResult.class, PayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetAcmBillDetailList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/feeService", name = "return", scope = QueryBillDetailByBillIdResponse.class)
    public JAXBElement<RetAcmBillDetailList> createQueryBillDetailByBillIdResponseReturn(RetAcmBillDetailList value) {
        return new JAXBElement<RetAcmBillDetailList>(_QueryBalanceResponseReturn_QNAME, RetAcmBillDetailList.class, QueryBillDetailByBillIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCommonResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/feeService", name = "return", scope = SuspendUserByIdResponse.class)
    public JAXBElement<WSCommonResult> createSuspendUserByIdResponseReturn(WSCommonResult value) {
        return new JAXBElement<WSCommonResult>(_QueryBalanceResponseReturn_QNAME, WSCommonResult.class, SuspendUserByIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelfPaymentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/feeService", name = "param0", scope = SelfPay.class)
    public JAXBElement<SelfPaymentInfo> createSelfPayParam0(SelfPaymentInfo value) {
        return new JAXBElement<SelfPaymentInfo>(_SelfPayParam0_QNAME, SelfPaymentInfo.class, SelfPay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/feeService", name = "param0", scope = QueryBalance.class)
    public JAXBElement<String> createQueryBalanceParam0(String value) {
        return new JAXBElement<String>(_SelfPayParam0_QNAME, String.class, QueryBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/feeService", name = "param0", scope = QueryAcmUserService.class)
    public JAXBElement<String> createQueryAcmUserServiceParam0(String value) {
        return new JAXBElement<String>(_SelfPayParam0_QNAME, String.class, QueryAcmUserService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/feeService", name = "param1", scope = SuspendUserById.class)
    public JAXBElement<XMLGregorianCalendar> createSuspendUserByIdParam1(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SuspendUserByIdParam1_QNAME, XMLGregorianCalendar.class, SuspendUserById.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCommonResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/feeService", name = "return", scope = CancelSuspendUserByIdResponse.class)
    public JAXBElement<WSCommonResult> createCancelSuspendUserByIdResponseReturn(WSCommonResult value) {
        return new JAXBElement<WSCommonResult>(_QueryBalanceResponseReturn_QNAME, WSCommonResult.class, CancelSuspendUserByIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RandomInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/feeService", name = "return", scope = RandomReqResponse.class)
    public JAXBElement<RandomInfo> createRandomReqResponseReturn(RandomInfo value) {
        return new JAXBElement<RandomInfo>(_QueryBalanceResponseReturn_QNAME, RandomInfo.class, RandomReqResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetAcmUserServiceList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/feeService", name = "return", scope = QueryAcmUserServiceResponse.class)
    public JAXBElement<RetAcmUserServiceList> createQueryAcmUserServiceResponseReturn(RetAcmUserServiceList value) {
        return new JAXBElement<RetAcmUserServiceList>(_QueryBalanceResponseReturn_QNAME, RetAcmUserServiceList.class, QueryAcmUserServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://acm.imc.h3c.com/feeService", name = "param0", scope = Pay.class)
    public JAXBElement<PaymentInfo> createPayParam0(PaymentInfo value) {
        return new JAXBElement<PaymentInfo>(_SelfPayParam0_QNAME, PaymentInfo.class, Pay.class, value);
    }

}
