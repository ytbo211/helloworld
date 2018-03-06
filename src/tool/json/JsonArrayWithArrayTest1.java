package tool.json;

import net.sf.json.JSONArray;  


public class JsonArrayWithArrayTest1 {

    public static void main(String[] args) {  
        // Java数组转JSONArray  
        boolean[] boolArray = new boolean[] { true, false, true };  
        JSONArray jsonArray = JSONArray.fromObject(boolArray);  
        System.out.println(jsonArray.toString());  
  
        // JSONArray转Java数组  
        Object obj[] = jsonArray.toArray();  
        for (Object o : obj) {  
            System.out.print(o + " ");  
        }  
    }  
}  
/* 
打印结果 : 
    [true,false,true] 
    true false true  
*/ 
