package code1405;

import java.sql.*;

public class UpdateCommodityPrice {

	public static void main(String[] args) {
		String url = "jdbc:derby:testDB;create=true";

		Connection con = null;

		Statement stmt = null;

		String query = "SELECT * FROM commodity";



		try {

			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

			con = DriverManager.getConnection(url);

			stmt = con.createStatement();



			stmt.executeUpdate("UPDATE commodity SET price=price*1.1");



			ResultSet rs = stmt.executeQuery(query);



			System.out.println("�۸�����10%֮����Ʒ��Ϣ�б�");

			System.out.println("���\t����\t\t\t�۸�\t״̬");

			while (rs.next()) {

				int id = rs.getInt("id");

				String name = rs.getString("name");

				float price = rs.getFloat("price");

				String status = rs.getString("status");

				System.out.println(id + "\t" + name + "\t" + price + "\t"

						+ status);

			}

		} catch (ClassNotFoundException e) {

			System.err.print("��û���ҵ��쳣��");

			System.err.println(e.getMessage());

		} catch (SQLException e) {

			System.err.println("SQL�쳣��" + e.getMessage());

		} finally {

			if (stmt != null) {

				try {

					stmt.close();

				} catch (SQLException e) {

				}

				stmt = null;

			}

			if (con != null) {

				try {

					con.close();

				} catch (SQLException e) {

				}

				con = null;

			}

		}



	}

}
