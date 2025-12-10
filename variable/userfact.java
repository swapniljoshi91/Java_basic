
import java.util.Scanner;

public class userfact{
	//it is fact user given

	public static void main(String[] args){
		int us_in;
		int fact = 1;
		System.out.print("Enter your No.: ");
		Scanner u = new Scanner(System.in);
		us_in = u.nextInt();
		for (int i =1 ; i <= us_in; i++){
			fact = fact * i;
			
			
		}
	System.out.println("Factor of "+ us_in + "  is  " + fact);
	
	}


}