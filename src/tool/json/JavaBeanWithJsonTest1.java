package tool.json;

import net.sf.json.JSONObject; 
import tool.json.Student;

public class JavaBeanWithJsonTest1 {

    public static void main(String[] args) {  
        // JavaBean对象转json字符串  
        Student stu1 = new Student("lwc", "111111");  
        JSONObject jsonObject = JSONObject.fromObject(stu1);  
        System.out.println(jsonObject);  
  
        // json字符串转JavaBean  
        String jsondata = "{\"password\":\"111111\",\"username\":\"lwc\"}";  
        JSONObject jsonObject1 = JSONObject.fromObject(jsondata);  
        Student stu2 = (Student) JSONObject.toBean(jsonObject1, Student.class);  
        System.out.println(stu2);  
    }  
}  
/* 
打印结果: 
    {"password":"111111","username":"lwc"} 
    用户: lwc 密码:111111 
*/  