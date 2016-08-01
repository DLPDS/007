package Bussiness;

public class BankUser {
	String Uname;
	String Pwd;
	long key;
	boolean isLoggedin;
	
	public BankUser(String uname,String pwd) {
		Uname=uname;
		Pwd=pwd;
	}
	public boolean isLoggedin() {
		return isLoggedin;
	}
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public boolean byUsingPwd() {
		if(Pwd.equals("")){
			return false;
		}
		return true;
	}
	public void setLoggedin(boolean isLoggedin) {
		this.isLoggedin = isLoggedin;
	}
	
	
	
	
	
}
