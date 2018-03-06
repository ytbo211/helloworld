package tool.jdbc.db;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DBUtil {
	private static final String url="jdbc:mysql://127.0.0.1:3306/test";
	private static final String user="root";
	private static final String password="1111";
	
	private static Connection conn=null;
	
	static {
		//1.加载mysql驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
		    conn=(Connection) DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}				
	}
	
	public static Connection getConnection() {
		return conn;
	}
}