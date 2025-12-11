
//Create a variable for your name and print: tack input from user
//"Hello, <name>!"


import java.util.Scanner;
public class my_name{
	public static void main(String[] args){
		String user_name ;
		System.out.print("May I Know your name please: ");
		Scanner s = new Scanner(System.in);
		user_name = s.nextLine();
		System.out.println("Hello "+ user_name);
		
		
	}

}