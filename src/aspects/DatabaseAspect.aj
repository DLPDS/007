package aspects;

import Bussiness.BankUser;
import Database.DatabaseLink;

public aspect DatabaseAspect {
	DatabaseLink dbLink=new DatabaseLink();
	 
	pointcut VerifyLogging(BankUser bankUser,String uname,String password) : initialization(BankUser.new(String,String)) && target(bankUser)  && args(uname,password) && !within(SystemLog);
	  before(BankUser bankUser,String uname,String password) : VerifyLogging(bankUser,uname,password){
		  
		    boolean logstatus=dbLink.authenticate(uname, password);
		    bankUser.setLoggedin(logstatus);
		    System.out.println(logstatus+" "+bankUser.isLoggedin());  
		    
	  }
}
