package fucdemo;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;

public class CountWeekdays {
    /**
     * @param urlAll
     *            :请求接口
     * @param httpArg
     *            :参数
     * @return 返回结果
     */
    public static String request( String httpArg) {
        String httpUrl="http://www.easybots.cn/api/holiday.php";
        BufferedReader reader = null;
        String result = null;
        StringBuffer sbf = new StringBuffer();
        httpUrl = httpUrl + "?d=" + httpArg;

        try {
            URL url = new URL(httpUrl);
            HttpURLConnection connection = (HttpURLConnection) url
                    .openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            InputStream is = connection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            String strRead = null;
            while ((strRead = reader.readLine()) != null) {
                sbf.append(strRead);
                sbf.append("\r\n");
            }
            reader.close();
            result = sbf.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONObject jsonObject = JSONObject.fromObject(result);
        return jsonObject.getString(httpArg);
    }

    private List<String> getBetweenDates(Date start, Date end) {
        List<String> result = new ArrayList<String>();
        Calendar tempStart = Calendar.getInstance();
        tempStart.setTime(start);
        tempStart.add(Calendar.DAY_OF_YEAR, 0);
        
        Calendar tempEnd = Calendar.getInstance();
        tempEnd.setTime(end);
    
        while (tempStart.before(tempEnd)||tempStart.equals(tempEnd)) {
        	SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd"); 
            result.add(sdf.format(tempStart.getTime()));
            tempStart.add(Calendar.DAY_OF_YEAR, 1);
        }
        return result;
    }
    
    public static String dateToString(Date date, String type) {  
        String str = null;  
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");  
        if (type.equals("SHORT")) {  
            // 07-1-18  
            format = DateFormat.getDateInstance(DateFormat.SHORT);  
            str = format.format(date);  
        } else if (type.equals("MEDIUM")) {  
            // 2007-1-18  
            format = DateFormat.getDateInstance(DateFormat.MEDIUM);  
           str = format.format(date);  
        } else if (type.equals("FULL")) {  
            // 2007年1月18日 星期四  
            format = DateFormat.getDateInstance(DateFormat.FULL);  
            str = format.format(date);  
        }  
        return str;  
    }  
    public static Date stringToDate(String str) {  
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");  
        Date date = null;  
        try {  
            // Fri Feb 24 00:00:00 CST 2012  
            date = format.parse(str);   
        } catch (ParseException e) {  
            e.printStackTrace();  
        }  
        // 2012-02-24  
        date = java.sql.Date.valueOf(str);  
                                              
        return date;  
    }
    
    public static void main(String[] args) {
        //判断今天是否是工作日 周末 还是节假日
    	CountWeekdays cw=new CountWeekdays();
        String end   ="2017-12-31";
        String start ="2017-01-01";
        Date   end1  =cw.stringToDate(end);
        Date   start1=cw.stringToDate(start);
        String end2  ="20171231";
        String start2="20170101";
        String jsonResult = request(start2);
        //0 上班 1周末 2节假日
        //System.out.println("开始日期start2:"+start2);
        //System.out.println("结束日期end2:"+end2);
        //System.out.println("从开始日期到结束日期中的所有日期："+cw.getBetweenDates(start1,end1));
        
        List<String> result = new ArrayList<String>();
        List<String> ResultWork = new ArrayList<String>();
        List<String> ResultRest = new ArrayList<String>();
        result=cw.getBetweenDates(start1,end1);
        //System.out.println("从开始日期到结束日期中的所有日期："+result);       
    	
        for (int i=0;i<result.size();i++) {
        	//获取集合日期
        	String a=result.get(i);
        	//获取对应的返回值
        	String b=request(a);
            ResultWork.add(b);
            if(b.charAt(0)!='0'){
            	ResultRest.add(a);
            }
            }          
        String srcText = ResultWork.toString(); 
        //System.out.println(ResultWork);
        int count=0;
        for(int i=0;i<=ResultWork.size()-1;i++)
        {
            String c=ResultWork.get(i);
            char d=c.charAt(0);
            if(d=='0'){
            	count=count+1;
            }
        }
        //System.out.println("------0 上班 1周末 2节假日"+ResultWork);
        System.out.println("开始时间为:"+start1);
        System.out.println("结束时间为:"+end1);
        //System.out.println("期间工作日天数为"+count);
        System.out.println("期间节假日日期为："+ResultRest);
    }                 
}
