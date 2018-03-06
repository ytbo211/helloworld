package tool.dateformat;

import java.util.Date;
import java.util.Calendar;


public class DateFormatTest2 {	
	/**1则代表的是对年份操作，*/
	public static Date addYears(Date date, int amount)  
    {  
        return add(date, 1, amount);  
    }  
	/**2是对月份操作，*/
    public static Date addMonths(Date date, int amount)  
    {  
        return add(date, 2, amount);  
    }  
    /**3是对星期操作，*/
    public static Date addWeeks(Date date, int amount)  
    {  
        return add(date, 3, amount);  
    }  
    /**5是对日期操作，*/
    public static Date addDays(Date date, int amount)  
    {  
        return add(date, 5, amount);  
    }  
    /**11是对小时操作，*/
    public static Date addHours(Date date, int amount)  
    {  
        return add(date, 11, amount);  
    }  
    /**12是对分钟操作，*/
    public static Date addMinutes(Date date, int amount)  
    {  
        return add(date, 12, amount);  
    }  
    /**13是对秒操作，*/
    public static Date addSeconds(Date date, int amount)  
    {  
        return add(date, 13, amount);  
    }  
    /**14是对毫秒操作*/
    public static Date addMilliseconds(Date date, int amount)  
    {  
        return add(date, 14, amount);  
    }  
    /**集成calendarField*/
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
		// TODO 自动生成的方法存根
		//DateFormatTest2 df2=new DateFormatTest2();
		Date d = new Date();
		System.out.println(d);
		System.out.println(add(d, 1, 8));
		System.out.println(addYears(d, 8));
		
	}

}
