package Practise;

import java.util.*;

class DispSub{
	public void dispName() {
		System.out.println("Sub class: Name 1");
	}
}

public class FirstPro extends DispSub{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		System.out.println("SYSO");
		System.out.println("new statement");
		System.out.println("new line");
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter User Name: ");
		String userName = myObj.nextLine();
		System.out.println("User name is: " + " " + userName);
		
		FirstPro myMainObj = new FirstPro();
		myMainObj.dispName();
			
	}

}
