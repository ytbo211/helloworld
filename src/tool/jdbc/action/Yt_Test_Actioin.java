package tool.jdbc.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tool.jdbc.dao.Yt_Test_Dao;
import tool.jdbc.model.Yt_Test;

public class Yt_Test_Actioin {
	
	public void add(Yt_Test yt) throws Exception {
		Yt_Test_Dao ytd=new Yt_Test_Dao();
		ytd.add_Yt_Test(yt);
	}
	
	public void edit(Yt_Test yt) throws Exception {
		Yt_Test_Dao ytd=new Yt_Test_Dao();
		ytd.update_Yt_Test(yt);		
	}
	
	public void del(Integer id) throws Exception {
		Yt_Test_Dao ytd=new Yt_Test_Dao();
		ytd.delete_Yt_Test(id);		
	}

	public List<Yt_Test> select() throws Exception {
		Yt_Test_Dao ytd=new Yt_Test_Dao();
		return ytd.select_Yt_Test();			
	}
	
	public List<Yt_Test> query(Integer id,String name) throws Exception {
		Yt_Test_Dao ytd=new Yt_Test_Dao();
		return ytd.query(id,name);			
	}
	
	public List<Yt_Test> query(List<Map<String,Object>> params) throws Exception {
		Yt_Test_Dao ytd=new Yt_Test_Dao();
		return ytd.queryList(params);		
	}
	
	public Yt_Test get(Integer id) throws Exception {
		Yt_Test_Dao ytd=new Yt_Test_Dao();
		return ytd.get(id);		
	}
	

	
	public static void main(String[] args) throws Exception {
		/*
		Yt_Test_Dao ytd=new Yt_Test_Dao();
		Yt_Test yt1=new Yt_Test();
		Yt_Test yt2=new Yt_Test();
		Yt_Test yt3=new Yt_Test();
		//insert操作		
		yt1.setId(3);
		yt1.setName("c");
		ytd.add_Yt_Test(yt1);
		
		//update操作
		yt1.setName("d");
		yt1.setId(3);
		ytd.update_Yt_Test(yt1);
		
		//delete操作
		yt1.setId(3);
		ytd.delete_Yt_Test(yt1.getId());		

		//get操作
		yt2=ytd.get(1);
		System.out.println(yt2.toString());				
		
		//select操作全表查询demo
		List<Yt_Test> ytl=ytd.select_Yt_Test();
		for (Yt_Test yt_Test : ytl) {
			System.out.println(yt_Test.getId()+","+yt_Test.getName());
		}	
		
		//query操作where条件情况
		yt3.setId(2);
		yt3.setName("b");
		List<Yt_Test> ytl1=ytd.query(yt3.getId(),yt3.getName());
		for(int i=0;i<ytl1.size();i++) {
			System.out.println(ytl1.get(i).toString());
		}	

		//query操作where条件情况,但是以集合的方式定义where条件中的参数
		List<Map<String,Object>> params= new ArrayList<Map<String,Object>>();
		Map<String,Object> param=new HashMap<String,Object>();
		param.put("name", "id");
		param.put("rela", "=");
		param.put("value", "2");

		param.put("name", "name");
		param.put("rela", "like");
		param.put("value", "'%b%'");
		params.add(param);		

		List<Yt_Test> ytl2=ytd.queryList(params);

		for(int i=0;i<ytl2.size();i++) {
			System.out.println(ytl2.get(i).toString());
		}		
	*/
		
		}
}
