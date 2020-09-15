package code1405;

import java.sql.*;

public class InsertNewCommodity {

	public static void main(String[] args) {
		String url = "jdbc:derby:testDB;create=true";

		Connection con = null;

		Statement stmt = null;

		String query = "SELECT * FROM commodity";



		try {

			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

			con = DriverManager.getConnection(url);

			stmt = con.createStatement();



			stmt.executeUpdate("INSERT INTO commodity "

					+ "VALUES(1,'����ʼǱ�����G450L-TTH',2699, 'ͣ��')");

			stmt.executeUpdate("INSERT INTO commodity "

					+ "VALUES(2,'���ձʼǱ�����CQ515',2950, '����')");

			stmt.executeUpdate("INSERT INTO commodity "

					+ "VALUES(3,'����ʼǱ�����VPCEA27EC',5259, '����')");



			ResultSet rs = stmt.executeQuery(query);



			System.out.println("��Ʒ��Ϣ�б�");

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
