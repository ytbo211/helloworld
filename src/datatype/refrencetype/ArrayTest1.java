package datatype.refrencetype;

import java.util.Arrays;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		// ����һ�����飬��������ѧ���ĳɼ�
		int[] scores = { 78, 93, 97, 84, 63 };

		// ��������еĵڶ����ɼ�
		System.out.println("�����еĵ�2���ɼ�Ϊ��" + scores[1]           );
		
		// ����һ������Ϊ5���ַ������飬���濼�Կ�Ŀ��Ϣ
		String[] subjects = new String[5];
        
		// �ֱ�Ϊ�����е�Ԫ�ظ�ֵ
		subjects[0] = "Oracle";
		subjects[1] = "PHP";
		subjects[2] = "Linux";
		subjects[3] = "Java";
		subjects[4] = "HTML";
        
		System.out.println("�����е�4����ĿΪ��" +subjects[3]           );		
		
				// ����һ������Ϊ 3 ���ַ������飬����ֵ��ʼֵ
		String[] hobbys = { "sports", "game", "movie" };
		System.out.println("ѭ�����������Ԫ�ص�ֵ��");
		
		// ʹ��ѭ�����������е�Ԫ��
		for(int i=0;i<hobbys.length;i++){
            System.out.println("�����е�"+(i+1)+"��Ԫ�ص�ֵ�ǣ�"+hobbys[i]);
                       
        }

    	// ʹ��Arrays���sort()�����������������
    	Arrays.sort(hobbys);
            
    	// ʹ��Arrays���toString()����������ת��Ϊ�ַ��������
    	System.out.println(Arrays.toString(hobbys)); 
    	
		// ʹ��foreach������������е�Ԫ��
		for (String hobby : hobbys ) {
			System.out.println(hobby);
		}

		// �����������еĶ�ά���鲢��ֵ
		String[][] names={{"tom","jack","mike"},{"zhangsan","lisi","wangwu"}};
               
		// ͨ������ѭ�������ά������Ԫ�ص�ֵ
		for (int i = 0; i <names.length ; i++) {
          
			for (int j = 0; j < names[i].length; j++) {
              
				System.out.println(names[i][j] );
			}
          
			System.out.println();
		}		
	}
}