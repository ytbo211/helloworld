package tool.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LibrarySystem {
	//图书搜索类型
	private int type = 0 ; 
	//图书名称 
	private String name = "" ;

	
	/** * 设置搜索类型 */ 
	public void search_type() { 
		Scanner type_number = new Scanner(System.in); 
		while (true) { 
			try { 
				System.out.println("输入命令: 1-按照名称查找图书 ; 2-按照序号查找图书 " ); 
				int number = type_number.nextInt(); 
				if ( number == 1 || number == 2 ) { 
					this.type = number ; 
					break; 
					} else { 
						throw new Exception(); 
						} 
				} catch ( InputMismatchException e ) { 
					System.out.println("命令输入错误!请根据提示输入数字命令!"); 
					type_number.nextLine(); 
					} catch ( Exception e ) { 
						System.out.println("命令输入错误!请根据提示输入数字命令!" ); 
						} 
			} 
		}

	/** * 图书列表 * @param books */ 
	public void book_list(String[] books) { 
		int number = 0 ; 
		System.out.println(" 序号 名称"); 
		for ( String book : books ) { 
			number++ ; System.out.println(" "+number+" "+book); 
			} 
		}

	/** * 搜索图书 * @param books */ 
	public void search_book(String[] books) { 
		while( true ) { 
			try { 
				Scanner search = new Scanner( System.in) ; 
				if( this.type == 1 ) { 
					System.out.println("输入图书名称:"); 
					String book_name = search.nextLine(); 
					//初始化 
					boolean is_true = false ; 
					//循环判断图书名称是否存在 
					for( String book : books ) { 
						if ( book.equals(book_name) ) { 
							is_true = true ; 
							} 
						} if ( is_true == false ) { 
							throw new Exception() ; 
							} 
						this.name = book_name ; 
						break; 
						} else if( this.type == 2 ) { 
							System.out.println("输入图书序号:"); 
							int book_number = search.nextInt() ; 
							if ( book_number < 1 || book_number > books.length ) { 
								throw new Exception() ; 
								} 
							this.name = books[book_number-1] ; 
							break; 
							} else { 
								System.out.println("系统错误!"); 
								System.exit(0); 
								} 
				} catch ( Exception e ) { 
					System.out.println("图书不存在"); 
					} 
			} 
		}	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String[] books= {"语文","数学"};
		//欢迎 
		System.out.println("欢迎使用图书管理系统!"); 
		//实例化
		LibrarySystem ls=new LibrarySystem();
		//图书列表 
		ls.book_list(books); 
		//选择搜索类型 
		ls.search_type(); 
		//搜索图书 
		ls.search_book( books ); 
		//显示图书 
		System.out.println("你选择的图书为:"+ls.name);
	}
}

