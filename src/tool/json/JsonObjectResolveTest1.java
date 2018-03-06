package tool.json;

import net.sf.json.JSONArray;  
import net.sf.json.JSONObject;

public class JsonObjectResolveTest1 {

	public static void main(String[] args) {  
        // ����JSONObject  
        JSONObject jsonObject = new JSONObject();  
        jsonObject.put("username", "lwc");  
        jsonObject.put("password", "123");  
        // ��ӡ:1  
        System.out.println(jsonObject);  
  
        // ��������,��ӡ:2  
        jsonObject.element("sex", "��");  
        System.out.println(jsonObject);  
          
        // ����key����,��ӡ:3  
        System.out.println(jsonObject.get("sex"));  
  
        // �ж�������������  
        boolean isArray = jsonObject.isArray();  
        boolean isEmpty = jsonObject.isEmpty();  
        boolean isNullObject = jsonObject.isNullObject();  
        // ��ӡ:4  
        System.out.println("�Ƿ�����:" + isArray + " �Ƿ��:" + isEmpty + " �Ƿ�ն���:"  
                + isNullObject);  
          
        // ��JSONArray���ӵ�JSONObject��  
        JSONArray jsonArray = new JSONArray();  
        jsonArray.add(0, "lwc");  
        jsonArray.add(1, "nxj");  
        // ��ʼ����  
        jsonObject.element("student", jsonArray);  
        // ��ӡ:5  
        System.out.println(jsonObject);  
    }  
}  
/* 
��ӡ��� 
    {"username":"lwc","password":"123"} 
    {"username":"lwc","password":"123","sex":"��"} 
    �� 
    �Ƿ�Ϊ����:false �Ƿ�Ϊ��:false �Ƿ�Ϊ�ն���:false 
    {"username":"lwc","password":"123","sex":"��","student":["lwc","nxj"]} 
*/  

