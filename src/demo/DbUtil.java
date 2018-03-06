package demo;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DbUtil {
	public static final String url="jdbc:mysql://127.0.0.1:3306/test";
	public static final String user="root";
	public static final String password="1111";

	private static Connection conn=null;

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=(Connection) DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
		// TODO 自动生成的 catch 块
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	public static Connection getConnection() {
		return conn;
	}
}
