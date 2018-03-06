package tool.dateformat;

import java.util.Date;
import java.text.DateFormat;
import java.util.Calendar;
/**
* ��ʽ��ʱ����
* DateFormat.FULL = 0
* DateFormat.DEFAULT = 2
* DateFormat.LONG = 1
* DateFormat.MEDIUM = 2
* DateFormat.SHORT = 3
* @author    Ytbo211 
* @version   1.0�� 2018/01/02
*/

public class DateFormatTest1 {
	
	
	public static void DateFormate() {
		Date d = new Date();
        String s;
          
        /** Date��ĸ�ʽ: Sat Apr 16 13:17:29 CST 2006 */
        System.out.println("**********��ȡϵͳʱ�䣨��ʼ����**********");
        System.out.println(d);
          
        System.out.println("******************************************");   
        
        /** getDateInstance() */ 
        /** �����ʽ: 2006-4-16 */
        s = DateFormat.getDateInstance().format(d);
        System.out.println("**********getDateInstance()**********");
        System.out.println(s);
        
        /** �����ʽ: 2006-4-16 */
        s = DateFormat.getDateInstance(DateFormat.DEFAULT).format(d);
        System.out.println("**********getDateInstance(DateFormat.DEFAULT)**********");
        System.out.println(s);
        
        /** �����ʽ: 2006��4��16�� ������ */
        s = DateFormat.getDateInstance(DateFormat.FULL).format(d);
        System.out.println("**********getDateInstance(DateFormat.FULL)**********");
        System.out.println(s);
        
        /** �����ʽ: 2006-4-16 */
        s = DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);
        System.out.println("**********getDateInstance(DateFormat.MEDIUM)**********");
        System.out.println(s);
        
        /** �����ʽ: 06-4-16 */
        s = DateFormat.getDateInstance(DateFormat.SHORT).format(d);
        System.out.println("**********getDateInstance(DateFormat.SHORT)**********");
        System.out.println(s);
        
        /** �����ʽ: 2006-01-01 00:00:00 */
        java.text.DateFormat format1 = new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        s = format1.format(new Date());
        System.out.println("**********SimpleDateFormat(\"yyyy-MM-dd hh:mm:ss\"):д��һ**********");
        System.out.println(s);
        
        /** �����ʽ: 2006-01-01 01:00:00 */
        System.out.println("**********SimpleDateFormat(\"yyyy-MM-dd hh:mm:ss\")**********");        
        System.out.println((new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss")).format(new Date()));


        /** �����ʽ: 20060101000000***/
        System.out.println("**********SimpleDateFormat(\"yyyyMMddhhmmss\"):д����**********");        
        java.text.DateFormat format2 = new java.text.SimpleDateFormat("yyyyMMddhhmmss");
        
        s = format2.format(new Date());
        System.out.println(s); 	
	}

	public static void GetTimeKinds (){
		Date date = new Date();  		
		/**��1970��1��1�տ�ʼ��ȡ��ϵͳʱ��Ϊֹ�������ĺ�����*/
        System.out.println("**********��ȡ����**********");        
		System.out.println(System.currentTimeMillis());

        System.out.println("----------date.get����-------");        

        System.out.println("**********date.toString()**********");                
        System.out.println("date.toString: " + date.toString());  

        System.out.println("**********date.getDate()**********");                
        System.out.println("date: " + date.getDate()); 

        System.out.println("**********date.getDay()**********");                
        System.out.println("day: " + date.getDay()); 
        
        System.out.println("**********date.getHours()**********");       
        System.out.println("hour: " + date.getHours());  
        
        System.out.println("**********date.getMinutes()**********");       
        System.out.println("minutes: " + date.getMinutes()); 
        
        System.out.println("**********date.getMonth()**********");       
        System.out.println("month: " + (date.getMonth() + 1)); 
        
        System.out.println("**********date.getSeconds()**********");       
        System.out.println("seconds: " + date.getSeconds());  
        
        System.out.println("**********date.getTime()**********");       
        System.out.println("time: " + date.getTime());
        
        System.out.println("**********date.getTimezoneOffset()**********");       
        System.out.println("timezone: " + date.getTimezoneOffset()); 
        
        System.out.println("**********date.getYear()**********");       
        System.out.println("year: " + (date.getYear() + 1900));  
          
        Calendar calendar = Calendar.getInstance();  
        int year = calendar.get(Calendar.YEAR);  
        int month = calendar.get(Calendar.MONTH) + 1;  
        int day = calendar.get(Calendar.DATE);  
        int hour = calendar.get(Calendar.HOUR);  
        int minute = calendar.get(Calendar.MINUTE);  
        int second = calendar.get(Calendar.SECOND);  

        
        System.out.println("----------Calendar-------"); 
        /**��date���ʱ���ֵ����ʱ���֡��롢�¡��ա���÷����Ѿ���ʱ����Ҫ����Calendar�ķ�������ȡʱ���ֵ*/
        System.out.println("--��date���ʱ���ֵ����ʱ���֡��롢�¡��ա���÷����Ѿ���ʱ����Ҫ����Calendar�ķ�������ȡʱ���ֵ--");  
        System.out.println("year: " + year);  
        System.out.println("month: " + month);  
        System.out.println("day: " + day);  
        System.out.println("hour: " + hour);  
        System.out.println("minute: " + minute);  
        System.out.println("second: " + second);  
	        
	    }  	
	
	public static void main(String []args){
		//DateFormate();
		GetTimeKinds();
    }
}
