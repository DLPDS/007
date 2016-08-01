package Database;

public class DatabaseLink {

	public boolean authenticate(String uname,String pwd){
		System.out.println(uname+" "+pwd);
		if(uname.equals("NRV") && pwd.equals("123")){
			return true;
		}
		return false;
	}
}
