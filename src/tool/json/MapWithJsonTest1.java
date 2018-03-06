package tool.json;

import java.util.HashMap;  
import java.util.Iterator;  
import java.util.Map;  
import java.util.Set;  
  
import net.sf.json.JSONObject;  
  
import tool.json.Student;

public class MapWithJsonTest1 {

    public static void main(String[] args) {  
        // Mapתjson�ַ���  
        Map map = new HashMap();  
        map.put("1", new Student("lwc", "111111"));  
        map.put("2", new Student("nxj", "222222"));  
        JSONObject jsonMap = JSONObject.fromObject(map);  
        System.out.println(jsonMap);  
  
        // json�ַ���תMap  
        String jsondata = "{\"2\":{\"password\":\"222222\",\"username\":\"nxj\"},\"1\":{\"password\":\"111111\",\"username\":\"lwc\"}}";  
        Map map1 = (Map) JSONObject.fromObject(jsondata);  
        Set set = map1.keySet();  
        Iterator ite = set.iterator();  
        while (ite.hasNext()) {  
            String key = (String) ite.next();  
            JSONObject jsonObject = JSONObject.fromObject(map1.get(key));  
            Student stu = (Student) JSONObject  
                    .toBean(jsonObject, Student.class);  
            System.out.println(key + " " + stu);  
        }  
  
    }  
}  
/* 
��ӡ���:  
    {"2":{"password":"222222","username":"nxj"},"1":{"password":"111111","username":"lwc"}} 
    2 �û�: nxj ����:222222 
    1 �û�: lwc ����:111111 
*/  
