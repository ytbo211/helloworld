package tool.json;

import net.sf.json.JSONArray;  


public class JsonArrayWithArrayTest1 {

    public static void main(String[] args) {  
        // Java����תJSONArray  
        boolean[] boolArray = new boolean[] { true, false, true };  
        JSONArray jsonArray = JSONArray.fromObject(boolArray);  
        System.out.println(jsonArray.toString());  
  
        // JSONArrayתJava����  
        Object obj[] = jsonArray.toArray();  
        for (Object o : obj) {  
            System.out.print(o + " ");  
        }  
    }  
}  
/* 
��ӡ��� : 
    [true,false,true] 
    true false true  
*/ 
