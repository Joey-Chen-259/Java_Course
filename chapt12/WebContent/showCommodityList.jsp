<%@ page language="java" contentType="text/html; charset=gb2312"

    pageEncoding="gb2312"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=gb2312">

<title>��ʾ��Ʒ��Ϣ</title>

</head>

<body>

<jsp:useBean id="commodity" scope="page" class="code1202.CommodityInfoBean"/>

<h1>��Ʒ��Ϣ���£�</h1>

���ƣ�<%=commodity.getName() %>

<br/>

�۸�<%=commodity.getPrice() %>

<br/>

״̬��<jsp:getProperty property="status" name="commodity"/>

<br/>

</body>

</html>

