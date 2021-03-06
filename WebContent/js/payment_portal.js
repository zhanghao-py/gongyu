/***
 * 页面初始化方法
 */
jQuery(function () {

    //判断浏览器是否为safari
	/*
    if(jQuery.browser.safari){
        jQuery.cookie('safariTest',"safariTest");
        var safariTest =jQuery.cookie('safariTest');
        if(safariTest==undefined||safariTest==""||safariTest==null){
            window.location.href=root+'/internetFee_new/jsp/payment/browser_cookie_help.jsp'
        }
    }
    */
	
    //激活菜单
    jQuery('#CZJF_YHKCZ').addClass('active');
    //默认手机号输入框样式
    jQuery('#payPhoneID').removeClass().addClass('lr-zc-inp1 qh');
    //默认已登录用户手机号码
    var msisdn = jQuery('#payPhoneID').val();
    if (isMsisdn(msisdn) == true) {
        jQuery('#payPhoneID').removeClass().addClass('lr-zc-inp1 qh');
//        jQuery('#payPhoneID').focus()
        autheMsisdn();
    } else if (msisdn == "") {
        //获取cookie手机
        var msisdnStr = jQuery.cookie('msisdnStr');
        if (msisdnStr != "" && msisdnStr != undefined) {
            var arr1 = msisdnStr.split(";");
            if (isMsisdn(arr1[0]) == true) {
                jQuery('#payPhoneID').val(arr1[0]);
                jQuery('#payPhoneID').removeClass().addClass('lr-zc-inp1 qh');
                autheMsisdn();
            }
        } else {
            jQuery('#payPhoneID').val("请输入本省手机号");
            jQuery('#payPhoneID').removeClass().addClass('lr-zc-inp');
        }
    }
    //默认选中金额
    var commonPay = jQuery('#commonPay').val();
    if (commonPay != "") {
        jQuery('#YHKJF_YRCZ_UL > li[id^=\'YHKJF_YRCZ\']').removeClass();
        var obj = jQuery('#YHKJF_YRCZ_UL > li[id^=\'YHKJF_YRCZ\'][id$=' + commonPay + ']');
        if (undefined != obj.val() && null != obj) { //选项卡
            obj.addClass('active');
        } else {  //其它金额
            jQuery('input[type=text][id="YHKJF_YRCZ_WDL_QTJE"]').val(commonPay);
        }
    } else {
        jQuery('#commonPay').val(100);
        var obj = jQuery('#YHKJF_YRCZ_UL > li[id^=\'YHKJF_YRCZ\'][id$="100"]').addClass('active');
    }
    //手机号输入框添加事件
    if (jQuery('#payPhoneID').attr('onpropertychange') == null) {
        var payPhoneID = document.getElementById("payPhoneID");
        if ("\v" == "v") {
            payPhoneID.onpropertychange = showXiala;
        } else {
            payPhoneID.addEventListener("input", showXiala, false);
        }
    }
    //验证码
    if (msg.indexOf("验证码") != -1) {
        jQuery('input[type=text][name=imgCode]').focus();
    }

    //手机号码提示层绑定事件
    jQuery('li[id^="cookieMsisdn"]').each(function (i) {
        jQuery(this).bind('mouseover',function () {
            jQuery(this).addClass('xiala-dl');
        }).bind('mouseout',function (i) {
                jQuery(this).removeClass('xiala-dl');
            }).bind('click', function () {
                var str = jQuery(this).attr('custom');
                jQuery('#payPhoneID').val(str);
                jQuery('.xiala').hide();
                autheMsisdn();
//                jQuery('#payPhoneID').blur();
            });
    });
    jQuery('#li_xiala_msisdn').hide().bind('mouseover',function () {
        jQuery(this).addClass('xiala-dl');
    }).bind('mouseout',function (i) {
            jQuery(this).removeClass('xiala-dl');
        }).bind('click', function () {
            jQuery('.xiala').hide();
            autheMsisdn();//
        });
});
/***
 * 选择金额
 */
function selectAmount(amount) {
    if (isNumber(amount) == true) {
        jQuery('#pay_amount_div').html('<img src="' + imagesPath + '/loading.gif"/>');
        jQuery('#account_amount_div').html('<img src="' + imagesPath + '/loading.gif"/>');
        jQuery('#YHKJF_YRCZ_UL > li[id^=\'YHKJF_YRCZ\']').removeClass();
        jQuery('#YHKJF_YRCZ_UL > li[id^=\'YHKJF_YRCZ\'][id$=' + amount + ']').addClass('active');
        //缴纳欠费
        jQuery('#YHKJF_YRCZ_UL > li[id=\'YHKJF_YRCZ_YDL_JNQF\']').addClass('txt1');
        //其它金额处理
        jQuery('#otherMoney_tip').removeClass().addClass('lr-zc-fwt');
        jQuery('input[type=text][name="otherMoney"]').val('');
        //隐藏表单
        jQuery('#commonPay').val(parseFloat(amount).toFixed(2));
    } else if (amount == 'otherMoney') {
        var otherMoney = jQuery('input[type=text][id="YHKJF_YRCZ_WDL_QTJE"]').val();
        if (otherMoney != "") {
            jQuery('#commonPay').val(otherMoney);
            jQuery('#YHKJF_YRCZ_UL > li[id^=\'YHKJF_YRCZ\']').removeClass();
            //缴纳欠费
            jQuery('#YHKJF_YRCZ_UL > li[id=\'YHKJF_YRCZ_YDL_JNQF\']').addClass('txt1');
            if (isMoney(otherMoney) == false || otherMoney < 0.01 || otherMoney > 500.00) {
//            if (otherMoney < 0.01 || otherMoney > 3000) {
                jQuery('#otherMoney_tip').removeClass().addClass('lr-zc-fwt red');
                jQuery('input[type=text][name="otherMoney"]').focus();
                jQuery('#pay_amount_div').html('');
                jQuery('#account_amount_div').html('');
                return false;
            } else {
                jQuery('#otherMoney_tip').removeClass().addClass('lr-zc-fwt');
            }
        }
    }
}
/***
 * 是否显示查余额提示
 */
function isShowCYETips() {
    jQuery('#cye_tip_div').toggle();
}


/***
 * 校验手机号码
 */
function autheMsisdn() {
    isPayPhoneFoucs = false;
//    jQuery('.xiala').hover(null,function(){
//        test();
//    });
    var msisdn = jQuery('#payPhoneID').val();

    if (isMsisdn(msisdn) == false) {
        jQuery('#sjh_tip_div').removeClass().addClass('lr-zc-ts1').html('请输入正确的手机号');
//        jQuery('#payPhoneID').focus();
//        jQuery('.xiala').hide();
        return false;
    }
}

/***
 * 关闭登录窗口
 */
function closeLoginWindow() {
    jQuery.unblockUI();
}
/***
 *开始充值
 */
function btnSubmit() {
    //手机号校验
    var msisdn = jQuery('#payPhoneID').val();
    if ( isBlank(msisdn) ) {
        jQuery('#sjh_tip_div').removeClass().addClass('lr-zc-ts1').html('请输入正确的充值账号');
        jQuery('#error_tip').html('请输入正确的充值账号').css("display", "block");
        jQuery('#payPhoneID').focus();
        return false;
    }
    if (jQuery('#sjh_tip_div').html() == '请输入正确的充值账号') {
    	jQuery('#error_tip').html('请输入正确的充值账号').css("display", "block");
        jQuery('#payPhoneID').focus();
        return false;
    }
    
    //缴费
	var amount = jQuery('#commonPay').val();
	if (amount == "" || isMoney(amount) == false) {
		jQuery('#otherMoney_tip').removeClass().addClass('lr-zc-fwt red');
		jQuery('input[type=text][name="otherMoney"]').focus();
		jQuery('#error_tip').html('金额只能由数字组成且带有2位小数，格式为0.00').css("display", "block");
		return false;		
	}
	if (amount < 0.01 || amount > 500.00) {
		jQuery('#otherMoney_tip').removeClass().addClass('lr-zc-fwt red');
		jQuery('input[type=text][name="otherMoney"]').focus();
		jQuery('#error_tip').html('金额需在0.01与500.00之间，请正确输入缴费金额').css("display", "block");
		return false;
	}
	
    var collegeId = jQuery('select[name="collegeId"]').val();
    var collegeName = jQuery('select[name="collegeId"]').find("option:selected").text();
    
    var imgCode = jQuery('input[type=text][name=imgCode]').val();
    if (imgCode == "" || imgCode.length != 4) {
    	jQuery('#error_tip').html('验证码格式不正确！').css("display", "block");
        jQuery('input[type=text][name=imgCode]').focus();
        return false;
    }
    
	var token = jQuery('input[type=hidden][name="token"]').val();
	
	//记录cookie
	addMsisdnTOCookie(msisdn);
	
//	var url = jQuery('form[name="paymentForm"]').attr('action');
//	var forwardUrl = "createAndPayOrderPortal.do";
	
	jQuery.ajax({
		url : checkOrderFormUrl,
		type : "post",
		dataType: "json",
		data : {
			account : msisdn,
			collegeId : collegeId,
			collegeName : collegeName,
			money : amount,
			imgCode : imgCode,
			token : token
		},
		success : function(msg) {
			var status = msg.status;
			var statusInfo = msg.statusInfo;
			
			if (status > 0) {
				jQuery('#error_tip').html(statusInfo).css("display", "block");
			} else {
				location.href = createAndPayOrderPortalUrl;
			}
		},
		error : function(msg) {
			jQuery('#error_tip').html('系统出错了，请联系管理员！').css("display", "block");
		},
		beforeSend : function() {
			jQuery('#loading_panel').showLoading();
		},
		complete : function() {
			jQuery('#loading_panel').hideLoading();
		}
	});
}

// 刷新验证码
function reloadRandImg() {
    var cache = new Date().getTime();
    var path = jQuery('#randImg').attr('src');
    jQuery('#randImg').attr('src', path + '?cache=' + cache);
}




