package tool.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LibrarySystem {
	//ͼ����������
	private int type = 0 ; 
	//ͼ������ 
	private String name = "" ;

	
	/** * ������������ */ 
	public void search_type() { 
		Scanner type_number = new Scanner(System.in); 
		while (true) { 
			try { 
				System.out.println("��������: 1-�������Ʋ���ͼ�� ; 2-������Ų���ͼ�� " ); 
				int number = type_number.nextInt(); 
				if ( number == 1 || number == 2 ) { 
					this.type = number ; 
					break; 
					} else { 
						throw new Exception(); 
						} 
				} catch ( InputMismatchException e ) { 
					System.out.println("�����������!�������ʾ������������!"); 
					type_number.nextLine(); 
					} catch ( Exception e ) { 
						System.out.println("�����������!�������ʾ������������!" ); 
						} 
			} 
		}

	/** * ͼ���б� * @param books */ 
	public void book_list(String[] books) { 
		int number = 0 ; 
		System.out.println(" ��� ����"); 
		for ( String book : books ) { 
			number++ ; System.out.println(" "+number+" "+book); 
			} 
		}

	/** * ����ͼ�� * @param books */ 
	public void search_book(String[] books) { 
		while( true ) { 
			try { 
				Scanner search = new Scanner( System.in) ; 
				if( this.type == 1 ) { 
					System.out.println("����ͼ������:"); 
					String book_name = search.nextLine(); 
					//��ʼ�� 
					boolean is_true = false ; 
					//ѭ���ж�ͼ�������Ƿ���� 
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
							System.out.println("����ͼ�����:"); 
							int book_number = search.nextInt() ; 
							if ( book_number < 1 || book_number > books.length ) { 
								throw new Exception() ; 
								} 
							this.name = books[book_number-1] ; 
							break; 
							} else { 
								System.out.println("ϵͳ����!"); 
								System.exit(0); 
								} 
				} catch ( Exception e ) { 
					System.out.println("ͼ�鲻����"); 
					} 
			} 
		}	
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String[] books= {"����","��ѧ"};
		//��ӭ 
		System.out.println("��ӭʹ��ͼ�����ϵͳ!"); 
		//ʵ����
		LibrarySystem ls=new LibrarySystem();
		//ͼ���б� 
		ls.book_list(books); 
		//ѡ���������� 
		ls.search_type(); 
		//����ͼ�� 
		ls.search_book( books ); 
		//��ʾͼ�� 
		System.out.println("��ѡ���ͼ��Ϊ:"+ls.name);
	}
}

