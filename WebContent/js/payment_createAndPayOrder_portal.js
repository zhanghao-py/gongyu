/***
 * 页面初始化方法
 */
jQuery(function () {
    //激活菜单
    jQuery('#CZJF_YHKCZ').addClass('active');
    //默认银行
    var lastBank = jQuery.cookie('lastBank');
    if (lastBank == "" || jQuery('#' + lastBank).val() == undefined) {  //没有记录，或者找不到响应银行
        jQuery('input[type=radio][id=YHKJF_YRCZ_SJZF]').attr('checked', true);
    } else {
        jQuery('input[type=radio][name=pay_bank_id][id=' + lastBank + ']').attr('checked', true);
        /***
         * 显示快捷支付信用卡支付
         */
        if (lastBank != undefined && lastBank.startsWith("YHKJF_YRCZ_KJZF_XYK") == true) {

            jQuery('#KJZF_TAB_DIV').find('li').each(function (i) {
                if (i == 0) {
                    jQuery(this).removeClass('cur');
                } else if (i == 1) {
                    jQuery(this).addClass('cur');
                }
            });
            jQuery('#kjzf_cxk_ul').hide();
            jQuery('#kjzf_xyk_ul').show();
        }
    }
});
/***
 * 返回修改
 */
function btnGobakck() {
	var forwardUrl = "portal.do";
	location.href = forwardUrl;
}
/***
 * 立即支付
 */
function btnSubmit() {
    var bank = jQuery('input[type=radio][name=pay_bank_id]:checked').val();
    if (bank == null || bank == undefined) {
        jQuery('#error_tip').html('请选择支付方式').css("display", "block");
        return false;
    }

    var bank_id = jQuery('input[type=radio][name=pay_bank_id]:checked').attr('id');
    jQuery.cookie('lastBank', bank_id, { expires: 365 });

	var url = jQuery('form[name="paymentForm"]').attr('action');
	
	jQuery.ajax({
		url : url,
		type : "post",
		dataType: "json",
		success : function(msg) {
			var status = msg.status;
			var statusInfo = msg.statusInfo;
			var data = msg.data;
			
			if (status > 0) {
				jQuery('#error_tip').html(statusInfo).css("display", "block");
			} else {
				popWindow();
//				var orderId = data.id;
//				alert("跳转到cmpay付款, orderId = " + orderId);
				var forwardUrl = 'http://www.baidu.com';
				window.open(forwardUrl, "_blank");
			}
		},
		error : function(msg) {
			jQuery('#error_tip').html('系统出错了，请联系管理员').css("display", "block");
		},
		beforeSend : function() {
			jQuery('#loading_panel').showLoading();
		},
		complete : function() {
			jQuery('#loading_panel').hideLoading();
		}
	});
    
}

/***
 * 弹出遮盖层
 * @type {*}
 */
function popWindow() {
    jQuery.blockUI({
        message: jQuery('#div_zhifu'),
        css: {left: '35%', top: '20%', cursor: 'default' }
    });
}

/***
 * 关闭登录窗口
 */
function closeWindow() {
    jQuery.unblockUI();
    //恢复按钮样式
    var obj = jQuery('img[id="YHKJF_YRCZ_LJZF"]');
    obj.attr('disabled', false);
    obj.css('filter', '');
    obj.css('cursor', 'pointer');
}

/***
 * 已完成支付
 */
function completePayment() {
	var forwardUrl = "doneOrderPortal.do";
	window.location = forwardUrl;
}

/***
 * 快捷支付页签切换
 */
function btnKjzfTabChange() {
    jQuery('#KJZF_TAB_DIV').find('li').toggleClass('cur');
    jQuery('ul[class=pay_list_con][id*=kjzf_]').toggle().each(function (i) {
        if (jQuery(this).is(':hidden')) {
            jQuery(this).find('input[type=radio]').each(function (j) {
                jQuery(this).attr('checked', false);
            });
        }
    });

}