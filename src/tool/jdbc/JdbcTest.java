package tool.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class JdbcTest {
	private static final String url="jdbc:mysql://127.0.0.1:3306/test";
	private static final String user="root";
	private static final String password="1111";
	
	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根

		//1.加载mysql驱动
		Class.forName("com.mysql.jdbc.Driver");
		//2.获得数据库的连接
		Connection conn=(Connection) DriverManager.getConnection(url, user, password);
		//3.通过数据库的连接操作数据库，实现增删改查
		Statement stmt=(Statement) conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from yt_test");
		
		System.out.println("查询yt_test表数据");
		System.out.println("id"+","+"name");
		while(rs.next()) {
			System.out.println(rs.getInt("id")+","+rs.getString("name"));
		}
	}

}
