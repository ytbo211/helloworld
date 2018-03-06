package tool.jdbc.view;

import java.util.List;
import java.util.Scanner;

import tool.jdbc.action.Yt_Test_Actioin;
import tool.jdbc.model.Yt_Test;
import tool.jdbc.test.TestAction;

public class View {
	
	private static final String CONTEXT="欢迎来到yt_test：\n"+
			"下面是功能列表：\n"+
			"[MAIN/M]：主菜单\n"+
			"[QUERY/Q]：查看全表yt_test的信息\n"+
			"[GET/G]：查看某个yt_test的信息\n"+			
			"[ADD/A]：添加yt_test的信息\n"+
			"[UPDATE/U]：更新yt_test的信息\n"+
			"[DELETE/D]：删除yt_test的信息\n"+
			"[SEARCH/S]：查询yt_test的信息（根据ID，NAME来查询）\n"+			
			"[EXIT/E]：退出查询系统\n"+
			"[BREAK/B]：退出当前功能返回主菜单\n";
	
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
		// TODO 自动生成的方法存根
		System.out.println(CONTEXT);
		Yt_Test_Actioin action=new Yt_Test_Actioin();
		Yt_Test yt1=new Yt_Test();
		Scanner scan=new Scanner(System.in);		
		String prenious=null;
		Integer step=1;
		while(scan.hasNext()) {
			String in =scan.next().toString();
			if(OPERATION_EXIT.equals(in.toUpperCase())||OPERATION_EXIT.substring(0,1).equals(in.toUpperCase())) {
				System.out.println("您成功退出查询系统");
				break;				
			}else if(OPERATION_QUERY.equals(in.toUpperCase())||OPERATION_QUERY.substring(0,1).equals(in.toUpperCase())) {
				try {
					List <Yt_Test> lt=action.select();
					for (Yt_Test yt_Test : lt) {
						System.out.println("ID:"+yt_Test.getId()+"NAME:"+yt_Test.getName());					
						}
						
				} catch (Exception e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
								
			}else if (OPERATION_ADD.equals(in.toUpperCase())
					||OPERATION_ADD.substring(0,1).equals(in.toUpperCase())
					||OPERATION_ADD.equals(prenious)) {
				prenious=OPERATION_ADD;
				if(1==step) {
					System.out.println("请输入yt_test的[NAME]");
				}else if(2==step) {
					yt1.setName(in);
					System.out.println("请输入yt_test的[ID]");
				}else if(3==step) {
					yt1.setId(Integer.valueOf(in));
					try {
						action.add(yt1);
						System.out.println("新增yt_test成功");
					} catch (Exception e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
						System.out.println("新增yt_test失败");
					}
				}
				if(OPERATION_ADD.equals(prenious)) {
					step++;
				}				
			}else {
				System.out.println("您输入的值为： "+in.toString());
			}			
			
		}
	}
}
