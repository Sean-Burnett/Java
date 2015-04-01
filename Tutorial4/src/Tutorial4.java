import java.util.*;
public class Tutorial4 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		inputTest();
		
	}
	public static void inputTest(){
		String message = input.nextLine();
		System.out.println(tut4(message));
	}
	public static String tut4(String message){
		if (message.equals("Hi")){
			return "Hello";
		}
		else{
			return "Goodbye";
		}
	}

}
