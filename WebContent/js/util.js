/***
 * 跳转到缴费充值页面
 */
function btnGoPayMent(path) {
    window.location = path + "/internetfee/login.do";
//    window.location = path + "/paymentAction_pageInit.html";

}


function __doPostBack(method, key, sort) {
    document.forms[0].submit();
}
/***
 * 客服热线div显示与否
 */
function btnShowOrHideHotLine() {
    jQuery('#hotLineTableID').toggle();
}

/**
 * 是否为空串
 */
function isBlank(s) {
	return (s == null || s === "" || s.length === 0);
}

/***
 * 是否为手机号码
 */
function isMsisdn(msisdn) {
    if (msisdn == "" || msisdn.length !== 11) {
        return false;
    }
    return isNumber(msisdn);
}
//正整数判读
function isNumber(str) {
    var patrn = /^[0-9]*[1-9][0-9]*$/;
    if (!patrn.exec(str)) {
        return false;
    } else {
        return true;
    }
}

function isMoney(str) {
    var patrn = /^(([1-9]\d*)|0)(\.\d{2})?$/;
    if (!patrn.exec(str)) {
        return false;
    } else {
        return true;
    }
}

/***
 * 添加手机号码到cookie，最多保留3个按时间顺序排列
 * @param msisdn
 */
function addMsisdnTOCookie(msisdn) {
    var msisdnStr = jQuery.cookie('msisdnStr');
    if (msisdnStr == "" || msisdnStr == undefined) {
        jQuery.cookie('msisdnStr', msisdn, { expires: 365 });
        return;
    }
    var arr1 = msisdnStr.split(";");
    var arr2 = new Array(3);
    arr2[0] = msisdn;
    var j = 0;
    for (var i = 0; i < arr1.length; i++) {
        if (arr1[i] != msisdn) {
            arr2[j + 1] = arr1[i];
            j++;
        }
    }
    msisdnStr = "";
    for (var i = 0; i < 3; i++) {
        if (arr2[i] != undefined && arr2[i] != "undefined") {
            if (i == 0) {
                msisdnStr = arr2[i];
            } else {
                msisdnStr = msisdnStr + ";" + arr2[i];
            }
        }
    }
    jQuery.cookie('msisdnStr', msisdnStr, { expires: 365 });
//    alert(msisdnStr);
}

/***
 * str，flg，sn
 * @param str 表示原字符串变量
 * @param flg 表示要插入的字符串
 * @param sn 表示要插入的位置
 * @return {string}
 */
function insertStr(str, flg, sn) {
    if (str.length < sn) {
        return str;
    }
    var newstr = "";
    newstr = str.substr(0, sn) + flg + str.substr(sn, str.length);
    return newstr;
}

/***
 * 给字符串对象添加一个startsWith()方法
 * @param substring
 * @return {Boolean}
 */
String.prototype.startsWith = function (substring) {
    var reg = new RegExp("^" + substring);
    return reg.test(this);
};

/***
 *  获得字符串真实字节长度，汉字占两个字节
 */
function getStrLength(str) {
    var count = 0;
    for (var i = 0; i < str.length; i++) {
        if (escape(str.charAt(i)).indexOf("%u", 0) != -1) {
            count++;
        }
    }
    count = count * 2 + str.length - count;
    return count;
}



