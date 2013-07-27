/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-5-3
 * Time: 下午1:24
 * To change this template use File | Settings | File Templates.
 */
/***
 * 展示cookie手机号码
 */
function showCookieMsisdn() {
    isPayPhoneFoucs=true;
    var msisdn = jQuery('#payPhoneID').val();
    var msisdnStr = jQuery.cookie('msisdnStr');
    jQuery('.xiala').show();
    if (msisdnStr != ""&&msisdnStr!=undefined) {
        var arr = msisdnStr.split(";");
        var j = 1;
        for (var i = 0; i < arr.length; i++) {
            if (isMsisdn(arr[i])) {
                var str = arr[i].substr(0, 3) + "-" + arr[i].substr(3, 4) + "-" + arr[i].substr(7, 4);
                jQuery('#cookieMsisdn' + j).html(str).show();
                jQuery('#cookieMsisdn' + j).attr('custom', arr[i]);
                j++;
            }
        }
    }
    if(msisdn!=undefined&&msisdn!=""&&msisdn.length==11){
        jQuery('#payPhoneID').select();
    }
}
/***
 * 号码提示
 * @return {boolean}
 */
function showXiala() {
    var msisdn = jQuery('#payPhoneID').val();
    var msisdnStr = jQuery.cookie('msisdnStr');
    if (msisdn == '请输入本省手机号') {
        return false;
    } else if (msisdn == "") {
        jQuery('#li_xiala_msisdn').hide();

//        showCookieMsisdn();
    }
    if(msisdn!=""){
        jQuery('#xiala-nologin_tip').hide();
    }

    if (isNumber(msisdn) && msisdn.length < 11) {
        jQuery('.xiala').show();
        if (msisdnStr!=undefined&&msisdnStr.startsWith(msisdn) == true) {
            jQuery('#li_xiala_msisdn').hide();
            jQuery('li[id^="cookieMsisdn"]').each(function (i) {
                var tem = jQuery(this).attr('custom');
                if (tem != "" && tem.indexOf(msisdn) != -1) {
                    var index = msisdn.length;
                    tem = tem.substr(0, 3) + "-" + tem.substr(3, 4) + '-' + tem.substr(7, 4);
                    var str = '';
                    if (index < 3) {
                        str = insertStr(tem, '</span>', index);
                    } else if (index >= 3 && index < 7) {
                        str = insertStr(tem, '</span>', index + 1);
                    } else if (index >= 7) {
                        str = insertStr(tem, '</span>', index + 2);
                    }  //
                    str = '<span class="orange">' + str;
                    jQuery(this).html(str);
                    jQuery('.xiala').show();
                    jQuery(this).show();

                } else {
                    jQuery(this).hide()
                }
            });
        } else {
            jQuery('li[id^="cookieMsisdn"]').each(function (i) {
                jQuery(this).hide();
            })
            var str = '<span class="orange">';
            if (msisdn.length <= 3) {
                str = str + msisdn;
            } else if (3 < msisdn.length && msisdn.length <= 7) {
                str = str + msisdn.substr(0, 3) + "-" + msisdn.substr(3, msisdn.length);
            } else if (7 < msisdn.length && msisdn.length <= 11) {
//            alert( msisdn.substr(3, 5))
                str = str + msisdn.substr(0, 3) + "-" + msisdn.substr(3, 4) + "-" + msisdn.substr(7, 4);
            }
            str = str + '</span>';
            jQuery('#li_xiala_msisdn > div:first').html(str);
            jQuery('#li_xiala_msisdn').show();
        }

    } else if (isMsisdn(msisdn)) {
        jQuery('#li_xiala_msisdn').hide();
        jQuery('li[id^="cookieMsisdn"]').each(function (i) {
            jQuery(this).hide();
        })
    } else {
        jQuery('#sjh_tip_div').removeClass().addClass('lr-zc-ts1').html('请输入正确的手机号');
//        jQuery('#payPhoneID').focus();
        return false;
    }
}
