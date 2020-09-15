package code1203;

import java.io.IOException;

import java.io.PrintWriter;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;


@WebServlet(name="doGetDemo", urlPatterns="/doGetDemo") 
public class DoGetDemo extends HttpServlet {

	private static final long serialVersionUID = 1L;



	protected void doGet(HttpServletRequest request,

			HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("gb2312");

		response.setContentType("text/html;charset=gb2312");

		PrintWriter out = response.getWriter();

		out.println("�����һ�²���ֵ��name=<br>" + request.getParameter("name"));

		out.flush();

	}

}

