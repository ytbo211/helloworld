package datatype.refrencetype;

	import java.util.Collection;  
	import java.util.HashMap;  
	import java.util.Iterator;  
	import java.util.Map;  
	import java.util.Map.Entry;  
	import java.util.Set;  
	  
	public class MapTest1 {  
	    private Map map;  
	      
	    MapTest1(){  
//	      Map<Integer,String> map =new HashMap<Integer,String>();  
	        this.map =new HashMap();  
	        map.put(1, "str1");  
	        map.put(2, "str2");  
	        map.put(3, "str1");  
	    }  
	      
	    public static void main(String[] args) {  
	        // TODO Auto-generated method stub  
	    	MapTest1 MT =new MapTest1();  
	    	MT.fun1();  
	    	MT.fun2();  
	    }  
	      
	    public <E> void fun1(){  //����Map  
	        System.out.println(map.size()); //mapӳ�����  
	        System.out.println(map.entrySet().getClass());  //HashMap���ڲ���EntrySet  
	          
	        //map��������ͼ  
	        Set<Entry<Integer, String>> set =map.entrySet();  
//	      Set<Integer> set_Key =map.keySet();  
	        Set<E> set_Key =(Set<E>) map.keySet();  
	        Collection<String> col_Value = map.values();  //���ܷ���Set��valuesֵ�������ظ�  
	          
	          
	        Iterator<Map.Entry<Integer, String>> itera_Entry =set.iterator();  
	        Iterator itera_Key =set_Key.iterator();  
	        Iterator<String> itera_Value =col_Value.iterator();  
	          
	        //������  
	        while(itera_Entry.hasNext()){  
	            Map.Entry<Integer, String> mapEntry =itera_Entry.next();  
	            System.out.println("����"+mapEntry.getKey()+" ֵ��"+mapEntry.getValue());  
	        }  
	        //��ǿforѭ��  
	        /*for(Integer key:set_Key){ 
	            System.out.println("����"+key); 
	        }*/  
	        for(E key:set_Key){  
	            System.out.println("����"+key);  
	        }  
	          
	        for(String value:col_Value){  
	            System.out.println("ֵ��"+value);  
	        }  
	    }  
	      
	    public Boolean fun2(){  
	        Boolean b;  
	        b =map.containsKey(5);  
	        System.out.println(b);  
	        return b;  
	    }  
	  
	}  
