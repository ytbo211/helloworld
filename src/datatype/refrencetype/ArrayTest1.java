package datatype.refrencetype;

import java.util.Arrays;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		// 定义一个数组，保存五名学生的成绩
		int[] scores = { 78, 93, 97, 84, 63 };

		// 输出数组中的第二个成绩
		System.out.println("数组中的第2个成绩为：" + scores[1]           );
		
		// 定义一个长度为5的字符串数组，保存考试科目信息
		String[] subjects = new String[5];
        
		// 分别为数组中的元素赋值
		subjects[0] = "Oracle";
		subjects[1] = "PHP";
		subjects[2] = "Linux";
		subjects[3] = "Java";
		subjects[4] = "HTML";
        
		System.out.println("数组中第4个科目为：" +subjects[3]           );		
		
				// 定义一个长度为 3 的字符串数组，并赋值初始值
		String[] hobbys = { "sports", "game", "movie" };
		System.out.println("循环输出数组中元素的值：");
		
		// 使用循环遍历数组中的元素
		for(int i=0;i<hobbys.length;i++){
            System.out.println("数组中第"+(i+1)+"个元素的值是："+hobbys[i]);
                       
        }

    	// 使用Arrays类的sort()方法对数组进行排序
    	Arrays.sort(hobbys);
            
    	// 使用Arrays类的toString()方法将数组转换为字符串并输出
    	System.out.println(Arrays.toString(hobbys)); 
    	
		// 使用foreach遍历输出数组中的元素
		for (String hobby : hobbys ) {
			System.out.println(hobby);
		}

		// 定义两行三列的二维数组并赋值
		String[][] names={{"tom","jack","mike"},{"zhangsan","lisi","wangwu"}};
               
		// 通过二重循环输出二维数组中元素的值
		for (int i = 0; i <names.length ; i++) {
          
			for (int j = 0; j < names[i].length; j++) {
              
				System.out.println(names[i][j] );
			}
          
			System.out.println();
		}		
	}
}