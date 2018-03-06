package tool.json;

public class Student {
	private String username;
	private String password;
	
	public Student() {}
	
	public Student(String username, String password) {
		  this.username = username;
		  this.password = password;
		 }
	
	 public String getUsername() {
	  return username;
	 }
	 
	 public void setUsername(String username) {
	  this.username = username;
	 }
	 public String getPassword() {
	  return password;
	 }
	 public void setPassword(String password) {
	  this.password = password;
	 }	
	 
	 public String toString(Student a) {
		 return("用户:"+a.getUsername()+"  密码:"+a.getPassword());
		 
	 }
	 
	 public String toString() {
		 return("用户:"+getUsername()+"  密码:"+getPassword());
		 
	 }
}


