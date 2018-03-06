package tool.json;

import java.util.ArrayList;  
import java.util.Iterator;  
import java.util.List;  
  
import net.sf.json.JSONArray;  
import net.sf.json.JsonConfig;  
  
import tool.json.Student;

public class JsonArrayWithListTest1 {

    public static void main(String[] args) {  
        //List转型JSONArray  
        List<Student> list = new ArrayList<Student>();    
        list.add(new Student("lwc", "111111"));  
        list.add(new Student("nxj", "222222"));   
        JSONArray jsonArray = JSONArray.fromObject(list);  
        System.out.println(jsonArray.toString());  
          
        //JSONArray转型List  
        List<Student> list2 = JSONArray.toList(jsonArray, new Student(), new JsonConfig());  
        Iterator<Student> ite =  list2.iterator();  
        while(ite.hasNext()){  
            Student stu =ite.next();  
            System.out.println(stu.toString(stu));  
            System.out.println(stu); 
        }  
    }  
}  
/* 
打印结果 
    [{"password":"111111","username":"lwc"},{"password":"222222","username":"nxj"}] 
    用户: lwc 密码:111111 
    用户: nxj 密码:222222 
*/  
