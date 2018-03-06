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
		//Ԥ�������
		PreparedStatement ptmt=(PreparedStatement) conn.prepareStatement(sql);
		
		//Ԥ�������ֵ
		ptmt.setInt(1,y.getId());
		ptmt.setString(2,y.getName());
		
		//����execute����ִ��sql
		ptmt.execute();
		System.out.println("add_Yt_Test���Ӽ�¼����ִ�У������ر����ݿ����ӣ�");
		//conn.close();   //�ر����ݿ�����
	}
	
	public void update_Yt_Test(Yt_Test y) throws Exception {
		Connection conn=DBUtil.getConnection();
		String sql=""+
				   " update yt_test "+
				   " set name=? "+
				   " where id=? ";
		//Ԥ�������
		PreparedStatement ptmt=(PreparedStatement) conn.prepareStatement(sql);
		
		//Ԥ�������ֵ
		
		ptmt.setString(1,y.getName());
		ptmt.setInt(2,y.getId());
		
		//����execute����ִ��sql
		ptmt.execute();
		System.out.println("update_Yt_Test���¼�¼����ִ�У������ر����ݿ����ӣ�");
		//conn.close();   //�ر����ݿ�����
	}
	
	public void delete_Yt_Test(Integer id) throws Exception {
		Connection conn=DBUtil.getConnection();
		String sql=""+
				   " delete from yt_test "+
				   " where id=? ";
		//Ԥ�������
		PreparedStatement ptmt=(PreparedStatement) conn.prepareStatement(sql);
		
		//Ԥ�������ֵ
		
		ptmt.setInt(1,id);
		
		//����execute����ִ��sql
		ptmt.execute();
		System.out.println("delete_Yt_Test���¼�¼����ִ�У������ر����ݿ����ӣ�");
		//conn.close();   //�ر����ݿ�����		
	}
	
	public List<Yt_Test> select_Yt_Test() throws Exception {
		//�����������Ӷ���,ͨ������getConnection�������������ݿ��URL���û��������룬����һ��JDBC Connection ����
		Connection conn=DBUtil.getConnection();
		//����Statement����Statement �����Ҫ������ִ�о�̬ SQL ��䲢�����������ɽ���Ķ���
		Statement stmt=(Statement) conn.createStatement();
		//ͨ������Statement�����executeQuery()�����������ݵĲ�ѯ������ѯ�����õ� ResulSet����ResulSet��ʾִ�в�ѯ���ݿ�󷵻ص����ݵļ��ϣ�
		//ResulSet������п���ָ��ǰ�����е�ָ�롣ͨ���ö����next()������ʹ��ָ��ָ����һ��
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
		//�����������Ӷ���,ͨ������getConnection�������������ݿ��URL���û��������룬����һ��JDBC Connection ����
		Connection conn=DBUtil.getConnection();
/*		//����Statement����Statement �����Ҫ������ִ�о�̬ SQL ��䲢�����������ɽ���Ķ���
		Statement stmt=(Statement) conn.createStatement();
		//ͨ������Statement�����executeQuery()�����������ݵĲ�ѯ������ѯ�����õ� ResulSet����ResulSet��ʾִ�в�ѯ���ݿ�󷵻ص����ݵļ��ϣ�
		//ResulSet������п���ָ��ǰ�����е�ָ�롣ͨ���ö����next()������ʹ��ָ��ָ����һ��
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
		//conn.close();   //�ر����ݿ�����
		
		
		return yt;	
		
	}


	public List<Yt_Test> queryList(List<Map<String,Object>> params) throws Exception{
		//�����������Ӷ���,ͨ������getConnection�������������ݿ��URL���û��������룬����һ��JDBC Connection ����
		Connection conn=DBUtil.getConnection();
/*		//����Statement����Statement �����Ҫ������ִ�о�̬ SQL ��䲢�����������ɽ���Ķ���
		Statement stmt=(Statement) conn.createStatement();
		//ͨ������Statement�����executeQuery()�����������ݵĲ�ѯ������ѯ�����õ� ResulSet����ResulSet��ʾִ�в�ѯ���ݿ�󷵻ص����ݵļ��ϣ�
		//ResulSet������п���ָ��ǰ�����е�ָ�롣ͨ���ö����next()������ʹ��ָ��ָ����һ��
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
		//conn.close();   //�ر����ݿ�����
		
		
		return yt;	
		
	}
	
	public Yt_Test get(Integer id) throws Exception {
		Yt_Test yt2=null;
		Connection conn=DBUtil.getConnection();
		String sql=""+
				   " select * from yt_test "+
				   " where id=? ";
		//Ԥ�������
		PreparedStatement ptmt=(PreparedStatement) conn.prepareStatement(sql);
		
		//Ԥ�������ֵ
		
		ptmt.setInt(1,id);
		
		ResultSet rs=ptmt.executeQuery();
		while(rs.next()) {
			yt2=new Yt_Test();		
			yt2.setId(rs.getInt("id"));
			yt2.setName(rs.getString("name"));
		}
		return yt2;
		
		//conn.close();   //�ر����ݿ�����
	}
}
