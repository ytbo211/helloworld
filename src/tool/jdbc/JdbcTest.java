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
		// TODO �Զ����ɵķ������

		//1.����mysql����
		Class.forName("com.mysql.jdbc.Driver");
		//2.������ݿ������
		Connection conn=(Connection) DriverManager.getConnection(url, user, password);
		//3.ͨ�����ݿ�����Ӳ������ݿ⣬ʵ����ɾ�Ĳ�
		Statement stmt=(Statement) conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from yt_test");
		
		System.out.println("��ѯyt_test������");
		System.out.println("id"+","+"name");
		while(rs.next()) {
			System.out.println(rs.getInt("id")+","+rs.getString("name"));
		}
	}

}
