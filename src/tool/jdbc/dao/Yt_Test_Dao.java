package tool.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import tool.jdbc.db.DBUtil;
import tool.jdbc.model.*;

public class Yt_Test_Dao {

	public void add_Yt_Test(Yt_Test y) throws Exception {
		Connection conn=DBUtil.getConnection();
		String sql=""+
				   "insert into yt_test "+
				   "(id,name) "+
				   "values("+
				   "?,?)";
		//预编译对象
		PreparedStatement ptmt=(PreparedStatement) conn.prepareStatement(sql);
		
		//预编译对象赋值
		ptmt.setInt(1,y.getId());
		ptmt.setString(2,y.getName());
		
		//调用execute方法执行sql
		ptmt.execute();
		System.out.println("add_Yt_Test增加记录操作执行，即将关闭数据库连接！");
		//conn.close();   //关闭数据库连接
	}
	
	public void update_Yt_Test(Yt_Test y) throws Exception {
		Connection conn=DBUtil.getConnection();
		String sql=""+
				   " update yt_test "+
				   " set name=? "+
				   " where id=? ";
		//预编译对象
		PreparedStatement ptmt=(PreparedStatement) conn.prepareStatement(sql);
		
		//预编译对象赋值
		
		ptmt.setString(1,y.getName());
		ptmt.setInt(2,y.getId());
		
		//调用execute方法执行sql
		ptmt.execute();
		System.out.println("update_Yt_Test更新记录操作执行，即将关闭数据库连接！");
		//conn.close();   //关闭数据库连接
	}
	
	public void delete_Yt_Test(Integer id) throws Exception {
		Connection conn=DBUtil.getConnection();
		String sql=""+
				   " delete from yt_test "+
				   " where id=? ";
		//预编译对象
		PreparedStatement ptmt=(PreparedStatement) conn.prepareStatement(sql);
		
		//预编译对象赋值
		
		ptmt.setInt(1,id);
		
		//调用execute方法执行sql
		ptmt.execute();
		System.out.println("delete_Yt_Test更新记录操作执行，即将关闭数据库连接！");
		//conn.close();   //关闭数据库连接		
	}
	
	public List<Yt_Test> select_Yt_Test() throws Exception {
		//创建数据连接对象,通过它的getConnection方法，根据数据库的URL、用户名和密码，创建一个JDBC Connection 对象。
		Connection conn=DBUtil.getConnection();
		//创建Statement对象：Statement 类的主要是用于执行静态 SQL 语句并返回它所生成结果的对象。
		Statement stmt=(Statement) conn.createStatement();
		//通过调用Statement对象的executeQuery()方法进行数据的查询，而查询结果会得到 ResulSet对象，ResulSet表示执行查询数据库后返回的数据的集合，
		//ResulSet对象具有可以指向当前数据行的指针。通过该对象的next()方法，使得指针指向下一行
		ResultSet rs=stmt.executeQuery("select * from yt_test");
		
		List<Yt_Test> yt=new ArrayList<Yt_Test>();	
		Yt_Test y=null;
		while(rs.next()) {
			y=new Yt_Test();
			y.setId(rs.getInt("id"));
			y.setName(rs.getString("name"));
			yt.add(y);
		}
		return yt;
	}
	
	public List<Yt_Test> query(Integer id,String name) throws Exception{
		//创建数据连接对象,通过它的getConnection方法，根据数据库的URL、用户名和密码，创建一个JDBC Connection 对象。
		Connection conn=DBUtil.getConnection();
/*		//创建Statement对象：Statement 类的主要是用于执行静态 SQL 语句并返回它所生成结果的对象。
		Statement stmt=(Statement) conn.createStatement();
		//通过调用Statement对象的executeQuery()方法进行数据的查询，而查询结果会得到 ResulSet对象，ResulSet表示执行查询数据库后返回的数据的集合，
		//ResulSet对象具有可以指向当前数据行的指针。通过该对象的next()方法，使得指针指向下一行
		ResultSet rs=stmt.executeQuery("select * from yt_test");*/

		List<Yt_Test> yt=new ArrayList<Yt_Test>();		
		
		StringBuilder sb=new StringBuilder();
		sb.append("select * from yt_test ");
		sb.append("where id=? and name like ?");
		
		PreparedStatement ptmt=(PreparedStatement) conn.prepareStatement(sb.toString());
		ptmt.setInt(1, id);
		ptmt.setString(2, "%"+name+"%");		
		ResultSet rs=ptmt.executeQuery();

		Yt_Test y=null;
		while(rs.next()) {
			y=new Yt_Test();
			y.setId(rs.getInt("id"));
			y.setName(rs.getString("name"));
			yt.add(y);
		}
		//conn.close();   //关闭数据库连接
		
		
		return yt;	
		
	}


	public List<Yt_Test> queryList(List<Map<String,Object>> params) throws Exception{
		//创建数据连接对象,通过它的getConnection方法，根据数据库的URL、用户名和密码，创建一个JDBC Connection 对象。
		Connection conn=DBUtil.getConnection();
/*		//创建Statement对象：Statement 类的主要是用于执行静态 SQL 语句并返回它所生成结果的对象。
		Statement stmt=(Statement) conn.createStatement();
		//通过调用Statement对象的executeQuery()方法进行数据的查询，而查询结果会得到 ResulSet对象，ResulSet表示执行查询数据库后返回的数据的集合，
		//ResulSet对象具有可以指向当前数据行的指针。通过该对象的next()方法，使得指针指向下一行
		ResultSet rs=stmt.executeQuery("select * from yt_test");*/

		List<Yt_Test> yt=new ArrayList<Yt_Test>();		
		
		StringBuilder sb=new StringBuilder();
		sb.append("select * from yt_test where 1=1 ");
		if(params!=null&params.size()>0) {
			for (int i = 0; i < params.size(); i++) {
				Map<String,Object> map=params.get(i);
				sb.append(" and " +" "+map.get("name")+" "+map.get("rela")+" "+map.get("value"));
						
			}
		}
		
		PreparedStatement ptmt=(PreparedStatement) conn.prepareStatement(sb.toString());
		System.out.println(sb.toString());
		ResultSet rs=ptmt.executeQuery();

		Yt_Test y=null;
		while(rs.next()) {
			y=new Yt_Test();
			y.setId(rs.getInt("id"));
			y.setName(rs.getString("name"));
			yt.add(y);
		}
		//conn.close();   //关闭数据库连接
		
		
		return yt;	
		
	}
	
	public Yt_Test get(Integer id) throws Exception {
		Yt_Test yt2=null;
		Connection conn=DBUtil.getConnection();
		String sql=""+
				   " select * from yt_test "+
				   " where id=? ";
		//预编译对象
		PreparedStatement ptmt=(PreparedStatement) conn.prepareStatement(sql);
		
		//预编译对象赋值
		
		ptmt.setInt(1,id);
		
		ResultSet rs=ptmt.executeQuery();
		while(rs.next()) {
			yt2=new Yt_Test();		
			yt2.setId(rs.getInt("id"));
			yt2.setName(rs.getString("name"));
		}
		return yt2;
		
		//conn.close();   //关闭数据库连接
	}
}
