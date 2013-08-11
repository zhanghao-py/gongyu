<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>callback</title>

</head>
<body>
	<form name="callback" action="cmpay/web.do" method="post">
		<table>
			<tr>
				<td>商户编号</td>
				<td><input name="merId" type="text" readonly="readonly"
					value="888000130000008"></td>
			</tr>

			<tr>
				<td>系统跟踪号</td>
				<td><input name="mid" type="text" value=""></td>
			</tr>
			<tr>
				<td>交易流水号</td>
				<td><input name="omid" type="text" value=""></td>
			</tr>
			<tr>
				<td>业务类型</td>
				<td><input name="txnTyp" type="text" value=""></td>
			</tr>
			<tr>
				<td>支付金额</td>
				<td><input name="amout" type="text" value=""></td>
			</tr>
			<tr>
				<td>原商户订单号</td>
				<td><input name="orderId" type="text" value="<%=request.getParameter("orderId")%>"></td>
			</tr>
			<tr>
				<td>订单日期</td>
				<td><input name="orderDate" type="text" value=""></td>
			</tr>
			<tr>
				<td>财务时间</td>
				<td><input name="payDate" type="text" value=""></td>
			</tr>
			<tr>
				<td>备注</td>
				<td><input name="remark" type="text" value="备注"></td>
			</tr>
			<tr>
				<td>支付结果</td>
				<td><input name="status" type="text" value="SUCCESS"></td>
			</tr>
			<tr>
				<td>SIGN</td>
				<td><input name="SIGN" type="text" value=""></td>
			</tr>
			<tr>
				<td><input name="submit" type="submit" ></td>
			</tr>
		</table>
	</form>
</body>
</html>