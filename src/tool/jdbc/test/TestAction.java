package tool.jdbc.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import tool.jdbc.action.Yt_Test_Actioin;
import tool.jdbc.model.Yt_Test;

public class TestAction {

	public static void main(String[] args) throws Exception {
		// TODO �Զ����ɵķ������
		Yt_Test_Actioin action=new Yt_Test_Actioin();
		
		//��ѯ
/*		List<Yt_Test> result= action.query(1, "a");
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i).getId()+":"+result.get(i).getName());
		}*/
		
		//����
/*		Yt_Test yt=new Yt_Test();
		yt.setId(3);
		yt.setName("c");
		action.add(yt);*/

		//��
/*		Yt_Test yt=new Yt_Test();
		yt.setId(3);
		yt.setName("d");
		action.edit(yt);*/
		
		//ɾ��
/*		action.del(3);*/
		
		//��ѯ����
/*		List<Map<String,Object>> params=new ArrayList<Map<String,Object>>();
		Map<String,Object> 		 param =new HashMap<String, Object>();
		param.put("name", "id");
		param.put("rela", "=");
		param.put("value", "1");
		param.put("name", "name");
		param.put("rela", "like");
		param.put("value", "'%b%'");		
		params.add(param);
		action.query(params);*/

		//get		
/*		Yt_Test yt1=action.get(2);
		System.out.println(yt1.toString());*/		
		
		//��ѯselect
		List<Yt_Test> result1=action.select();
		for (int i = 0; i < result1.size(); i++) {
			System.out.println(result1.get(i).getId()+":"+result1.get(i).getName());
		}
	}

}
