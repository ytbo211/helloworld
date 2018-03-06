package tool.jdbc.view;

import java.util.List;
import java.util.Scanner;

import tool.jdbc.action.Yt_Test_Actioin;
import tool.jdbc.model.Yt_Test;
import tool.jdbc.test.TestAction;

public class View {
	
	private static final String CONTEXT="��ӭ����yt_test��\n"+
			"�����ǹ����б�\n"+
			"[MAIN/M]�����˵�\n"+
			"[QUERY/Q]���鿴ȫ��yt_test����Ϣ\n"+
			"[GET/G]���鿴ĳ��yt_test����Ϣ\n"+			
			"[ADD/A]�����yt_test����Ϣ\n"+
			"[UPDATE/U]������yt_test����Ϣ\n"+
			"[DELETE/D]��ɾ��yt_test����Ϣ\n"+
			"[SEARCH/S]����ѯyt_test����Ϣ������ID��NAME����ѯ��\n"+			
			"[EXIT/E]���˳���ѯϵͳ\n"+
			"[BREAK/B]���˳���ǰ���ܷ������˵�\n";
	
	private static final String OPERATION_MAIN="MAIN";
	private static final String OPERATION_QUERY="QUERY";
	private static final String OPERATION_GET="GET";
	private static final String OPERATION_ADD="ADD";
	private static final String OPERATION_UPDATE="UPDATE";
	private static final String OPERATION_DELETE="DELETE";
	private static final String OPERATION_SEARCH="SEARCH";
	private static final String OPERATION_EXIT="EXIT";
	private static final String OPERATION_BREAK="BREAK";	
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println(CONTEXT);
		Yt_Test_Actioin action=new Yt_Test_Actioin();
		Yt_Test yt1=new Yt_Test();
		Scanner scan=new Scanner(System.in);		
		String prenious=null;
		Integer step=1;
		while(scan.hasNext()) {
			String in =scan.next().toString();
			if(OPERATION_EXIT.equals(in.toUpperCase())||OPERATION_EXIT.substring(0,1).equals(in.toUpperCase())) {
				System.out.println("���ɹ��˳���ѯϵͳ");
				break;				
			}else if(OPERATION_QUERY.equals(in.toUpperCase())||OPERATION_QUERY.substring(0,1).equals(in.toUpperCase())) {
				try {
					List <Yt_Test> lt=action.select();
					for (Yt_Test yt_Test : lt) {
						System.out.println("ID:"+yt_Test.getId()+"NAME:"+yt_Test.getName());					
						}
						
				} catch (Exception e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
								
			}else if (OPERATION_ADD.equals(in.toUpperCase())
					||OPERATION_ADD.substring(0,1).equals(in.toUpperCase())
					||OPERATION_ADD.equals(prenious)) {
				prenious=OPERATION_ADD;
				if(1==step) {
					System.out.println("������yt_test��[NAME]");
				}else if(2==step) {
					yt1.setName(in);
					System.out.println("������yt_test��[ID]");
				}else if(3==step) {
					yt1.setId(Integer.valueOf(in));
					try {
						action.add(yt1);
						System.out.println("����yt_test�ɹ�");
					} catch (Exception e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
						System.out.println("����yt_testʧ��");
					}
				}
				if(OPERATION_ADD.equals(prenious)) {
					step++;
				}				
			}else {
				System.out.println("�������ֵΪ�� "+in.toString());
			}			
			
		}
	}
}
