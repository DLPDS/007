package Bussiness;

public class User {
	String Uname;
	String Pwd;
	long key;
	boolean isLoggedin=false;
	
	public User(String uname,String pwd) {
		Uname=uname;
		Pwd=pwd;
		if(isLoggedin){//Aspect will change this before the constructor
			key=System.currentTimeMillis()+10000;
		}
	}
	public boolean isLoggedin() {
		return isLoggedin;
	}
	
	
}
