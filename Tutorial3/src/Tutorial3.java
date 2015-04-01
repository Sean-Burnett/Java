import java.util.*;
public class Tutorial3 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		inputTest();
		
	}
	public static void inputTest(){
		System.out.println("You have just answered the phone. What do you say?: ");
		String message = input.nextLine();
		if (message.equals("Hi")){
			System.out.println("Hello.");
		}
	
	}

}
