package datatype.refrencetype;

import java.util.Collection;  
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest1 {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
	       list.add("luojiahui");
	       list.add("luojiafeng");
	       
	       System.out.println("-------"+list.get(0)+"-------------");
	       System.out.println("-------"+list.get(1)+"-------------");
	       
	       //方法1
	       Iterator it1 = list.iterator();
	       while(it1.hasNext()){
	           System.out.println(it1.next());
	       }
	       //方法2
	       for(Iterator it2 = list.iterator();it2.hasNext();){
	            System.out.println(it2.next());
	       }
	       //方法3
	       for(String tmp:list){
	           System.out.println(tmp);
	       }
	       //方法4
	       for(int i = 0;i < list.size(); i ++){
	           System.out.println(list.get(i));
	       }
	    }
	}
