package aspects;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import Bussiness.BankUser;

public aspect SystemLog {
	
	  pointcut RecordLogging(BankUser bankUser) : initialization(BankUser.new(..)) && target(bankUser) && !within(SystemLog);
	  after(BankUser bankUser) : RecordLogging(bankUser){
		  System.out.println("In Logg");
		WriteFile("Login - Username:- "+bankUser.getUname()+" Password:- "+bankUser.byUsingPwd()+" Sucess:- "+bankUser.isLoggedin());    
	  }
	  
	  public void WriteFile(String Log){
		  try {
			    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("myfile.txt", true)));
			    out.println(Log);
			    out.close();
			} catch (IOException e) {
			    //exception handling left as an exercise for the reader
			}
	  }
	  
	 	  
}
