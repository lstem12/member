package common;

import java.sql.*;

public class Connector {
	private static final String URL="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER="c##test";
	private static final String PASSWORD="test";
	private static final String driver_name="oracle.jdbc.driver.OracleDriver";
	
	private static Connection conn;
	
	public static void init() {
		try {
			Class.forName(driver_name);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		if(conn==null) {
		init();
			try {
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	public static void close() {
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		conn = null;
	}
	public static void main(String[] args) throws SQLException {
		Connection con = getConnection();
		Statement stmt = con.createStatement();
		String sql ="select * from board";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println("출력");
		}
	}
}
