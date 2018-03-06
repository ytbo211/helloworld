package tool.json;

import java.util.ArrayList;  
import java.util.List;  
  
import net.sf.json.JSONArray;  
import net.sf.json.JSONObject;  

import tool.json.Student;

public class ListWithJsonTest1 {

    public static void main(String[] args) {  
        // Listתjson�ַ���  
        List list = new ArrayList();  
        list.add(new Student("lwc", "111111"));  
        list.add(new Student("nxj", "222222"));  
        JSONArray jsonArray = JSONArray.fromObject(list);  
        System.out.println(jsonArray);  
  
        // json�ַ���תList  
        List list1 = new ArrayList();  
        String jsondata = "[{\"password\":\"111111\",\"username\":\"lwc\"},{\"password\":\"222222\",\"username\":\"nxj\"}]";  
        JSONArray jsonArray1 = JSONArray.fromObject(jsondata);  
        for (int i = 0; i < jsonArray1.size(); i++) {  
            JSONObject jsonObject2 = jsonArray1.getJSONObject(i);  
            Student stu2 = (Student) JSONObject.toBean(jsonObject2,  
                    Student.class);  
            list1.add(stu2);  
        }  
        System.out.println(list1);  
    }  
}  
/* 
��ӡ���: 
    [{"password":"111111","username":"lwc"},{"password":"222222","username":"nxj"}] 
    [�û�: lwc ����:111111, �û�: nxj ����:222222] 
*/  
