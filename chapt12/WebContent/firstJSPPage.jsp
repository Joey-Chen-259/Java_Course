<%@ page language="java" contentType="text/html; charset=gb2312" pageEncoding= "gb2312"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=gb2312">

<title>��һ��JSPҳ��</title>

</head>

<body>

<table>

	<tr>

		<td>id</td>

		<td>����</td>

	</tr>

	<%

		String color1 = "99ccff";

		String color2 = "88cc33";

		for (int i = 1; i <= 10; i++) {

			String color = "";

			if (i % 2 == 0) {

				color = color1;

			} else {

				color = color2;

			}

			out.println("<tr bgcolor=" + color + ">");

			out.println("<td>" + i + "</td>");

			out.println("<td>����" + i + "</td>");

			out.println("</tr>");

		}

	%>

</table>

</body>

</html>

