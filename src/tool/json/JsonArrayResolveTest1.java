package tool.json;

import net.sf.json.JSONArray;  
import net.sf.json.JSONObject; 

public class JsonArrayResolveTest1 {
	
	public static void main(String[] args) {  
        //����JSONArray  
        JSONArray jsonArray = new JSONArray();  
        jsonArray.add(0, "lwc");     
        jsonArray.add(1, "nxj");  
        jsonArray.element("mxj");  
        //��ӡ:1  
        System.out.println(jsonArray);  
          
        //�����±귵��,��ӡ:2  
        System.out.println(jsonArray.get(0));  
          
        //�����±�������ֵ,��ӡ:3  
        jsonArray.set(0, "itlwc");  
        System.out.println(jsonArray);  
          
        //��JSONObject���뵽JSONArray��  
        JSONObject jsonObject = new JSONObject();  
        jsonObject.put("username", "lwc");  
        jsonObject.put("password", "123");  
        //��ʼ����,��ӡ:4  
        jsonArray.add(jsonObject);  
        System.out.println(jsonArray);  
          
        //����,��ӡ:5  
        for(int i=0;i<jsonArray.size();i++){  
            System.out.print(jsonArray.get(i)+"\t");  
        }  
    }  
}  
/* 
��ӡ��� 
    ["lwc","nxj","mxj"] 
    lwc 
    ["itlwc","nxj","mxj"] 
    ["itlwc","nxj","mxj",{"username":"lwc","password":"123"}] 
    itlwc   nxj mxj {"username":"lwc","password":"123"} 
*/  
