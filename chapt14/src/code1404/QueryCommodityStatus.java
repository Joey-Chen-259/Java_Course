package code1404;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.sql.*;


public class QueryCommodityStatus {

	public static void main(String[] args) {
		String url = "jdbc:derby:testDB;create=true";

		Connection con = null;

		PreparedStatement pstm = null;



		try {

// ����JDBC��������

			Class.forName("org.apache.derby.jdbc.EmbeddedDriver"); 

			con = DriverManager.getConnection(url); // ��������

			pstm = con.prepareStatement("SELECT status FROM commodity WHERE name=?"); // ����PreparedStatement���



			System.out.println("������Ҫ��ѯ����Ʒ���ƣ�");

			String inputName = (new BufferedReader(new InputStreamReader(

					System.in))).readLine();

			pstm.setString(1, inputName); // ��SQL����еĲ������и�ֵ

			ResultSet rs = pstm.executeQuery(); // ִ��SQL���

			if (rs.next()) {

				String status = rs.getString("status"); // �������

				System.out.println("��Ʒ\"" + inputName + "\"��״̬�ǣ�" + status);

			} else {

				System.out.println("û����Ʒ\"" + inputName + "\"�������Ϣ��");

			}

		} catch (ClassNotFoundException e) {

			System.err.print("��û���ҵ��쳣��");

			System.err.println(e.getMessage());

		} catch (SQLException e) {

			System.err.println("SQL�쳣��" + e.getMessage());

		} catch (IOException e) {

			System.err.println("IO�쳣��" + e.getMessage());

		} finally {

			if (pstm != null) {

				try {

					pstm.close(); // �ر�PreparedStatement���

				} catch (SQLException e) {

				}

				pstm = null;

			}

			if (con != null) {

				try {

					con.close(); // �ر�����

				} catch (SQLException e) {

				}

				con = null;

			}

		}



	}

}
