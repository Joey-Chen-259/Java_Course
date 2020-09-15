package code1205;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/userLogin")
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");

		String password = request.getParameter("password");

		

		UserBean user = new UserBean();

		user.setValidUserName("admin"); // ���úϷ��û�����Ϣ

		user.setValidUserPassword("admin");

		

		response.setCharacterEncoding("gb2312");

		response.setContentType("text/html;charset=gb2312");

		PrintWriter out = response.getWriter();

		if(user.isValidUser(name, password)){  // ����JavaBean�ķ�������֤�û�

			out.println("��¼�ɹ���");

		}else{

			out.println("�û��������������<a href='login.jsp'>�����ԡ�</a>");

		}		

	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request,response);

	}



}
