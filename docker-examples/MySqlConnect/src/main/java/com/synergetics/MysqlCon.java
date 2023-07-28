package com.synergetics;

import java.sql.*;

class MysqlCon {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://4.246.189.7:3306/data", "makarand", "makarand@1234");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employees");
			while (rs.next())
				System.out.println(rs.getString(1) + "  " + rs.getString(2));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}