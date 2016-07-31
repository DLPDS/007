package Interface;

import java.util.Scanner;

import javax.jws.soap.SOAPBinding.Use;

import Bussiness.User;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		optionOne();
	}
	
	public static void optionOne(){
		Scanner scanner=new Scanner(System.in);
		String mainoption;
		int mainoptionint;
		User user;
		do{
			System.out.println("Enter Options Login Register");
			mainoption=scanner.nextLine();
			try{
			mainoptionint=Integer.parseInt(mainoption);
			}
			catch(Exception e){
				mainoptionint=-1;
			}
			
			if(mainoptionint==Options.Register){
				
			}
			else if(mainoptionint==Options.Login){
				user=Login(scanner);
			}
			else if(mainoptionint==Options.Exit){
				break;
			}
			
		}while(mainoption.equals("1"));
		
		return;
	}
	
	public static void optionTwo(){
		Scanner scanner=new Scanner(System.in);
		String suboption;
		int suboptionint;
		do{
			suboption=scanner.nextLine();
			try{
				suboptionint=Integer.parseInt(suboption);
			}
			catch(Exception e){
				suboptionint=-1;
			}
			
			if(suboptionint==Options.Transfer){
				
			}
			else if(suboptionint==Options.Inquiery){
				
			}
			else if(suboptionint==Options.History){
				
			}
			else if(suboptionint==Options.Profile){
				
			}
			else if(suboptionint==Options.Contact){
				
			}
			else if(suboptionint==Options.Exit){
				break;
			}
			
		}while(suboption.equals("1"));
		
		return;
	}
	
	public static User Login(Scanner scanner){
		System.out.println("Enter User Name:- ");
		String uname=scanner.next();
		System.out.println("Enter Password:- ");
		String pwd=scanner.next();
		User user=new User(uname, pwd);
		return user;
		
	}
	

}
