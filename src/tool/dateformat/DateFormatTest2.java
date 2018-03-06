package tool.dateformat;

import java.util.Date;
import java.util.Calendar;


public class DateFormatTest2 {	
	/**1�������Ƕ���ݲ�����*/
	public static Date addYears(Date date, int amount)  
    {  
        return add(date, 1, amount);  
    }  
	/**2�Ƕ��·ݲ�����*/
    public static Date addMonths(Date date, int amount)  
    {  
        return add(date, 2, amount);  
    }  
    /**3�Ƕ����ڲ�����*/
    public static Date addWeeks(Date date, int amount)  
    {  
        return add(date, 3, amount);  
    }  
    /**5�Ƕ����ڲ�����*/
    public static Date addDays(Date date, int amount)  
    {  
        return add(date, 5, amount);  
    }  
    /**11�Ƕ�Сʱ������*/
    public static Date addHours(Date date, int amount)  
    {  
        return add(date, 11, amount);  
    }  
    /**12�ǶԷ��Ӳ�����*/
    public static Date addMinutes(Date date, int amount)  
    {  
        return add(date, 12, amount);  
    }  
    /**13�Ƕ��������*/
    public static Date addSeconds(Date date, int amount)  
    {  
        return add(date, 13, amount);  
    }  
    /**14�ǶԺ������*/
    public static Date addMilliseconds(Date date, int amount)  
    {  
        return add(date, 14, amount);  
    }  
    /**����calendarField*/
    private static Date add(Date date, int calendarField, int amount)  
    {  
        if(date == null)  
        {  
            throw new IllegalArgumentException("The date must not be null");  
        } else  
        {  
            Calendar c = Calendar.getInstance();  
            c.setTime(date);  
            c.add(calendarField, amount);  
            return c.getTime();  
        }  
    }
	
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//DateFormatTest2 df2=new DateFormatTest2();
		Date d = new Date();
		System.out.println(d);
		System.out.println(add(d, 1, 8));
		System.out.println(addYears(d, 8));
		
	}

}
