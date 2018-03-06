package tool.json;

import net.sf.json.JSON;  
import net.sf.json.JSONObject;  
import net.sf.json.xml.XMLSerializer;

public class XmlWithJsonTest {

    public static void main(String[] args) throws Exception {  
        // XML转JSON  
        String xml = "<root>" + "<name type='type'>zhaipuhong</name>"  
                + "<gender>male</gender>" + "<birthday>" + "<year>1970</year>"  
                + "<month>12</month>" + "<day>17</day>" + "</birthday>"  
                + "</root>";  
        XMLSerializer xmlSerializer = new XMLSerializer();  
        JSON json = xmlSerializer.read(xml);  
        System.out.println(json.toString(2));  
  
        // JSON转XML  
        String jsondata = "{\"root\":{" + "\"name\":\"zhaipuhong\","  
                + "\"gender\":\"male\"," + "\"birthday\":{"  
                + "\"year\":\"1970\"," + "\"month\":\"12\"," + "\"day\":\"17\""  
                + "}" + "}" + "}";  
        JSONObject jsonObject = JSONObject.fromObject(jsondata);  
        String xmlstr = new XMLSerializer().write(jsonObject);  
        System.out.println(xmlstr);  
    }  
}  
/* 
打印结果: 
    { 
      "name": "zhaipuhong", 
      "gender": "male", 
      "birthday":   { 
        "year": "1970", 
        "month": "12", 
        "day": "17" 
      } 
    } 
    <?xml version="1.0" encoding="UTF-8"?> 
    <o> 
        <root class="object"> 
            <birthday class="object"> 
                <day type="string">17</day> 
                <month type="string">12</month> 
                <year type="string">1970</year> 
            </birthday> 
            <gender type="string">male</gender> 
            <name type="string">zhaipuhong</name> 
        </root> 
    </o> 
*/  
