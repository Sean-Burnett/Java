import java.util.*;
public class Tutorial2 {
	static  Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		
		//declare variable to hold base and height
		double base;
		double height;
		//Variables created
		System.out.print("Enter the triangle's base: ");
		base = sc.nextDouble();
		//base has been declared
		System.out.print("What is the triangle's height: ");
		height = sc.nextDouble();
		//Both variables are filled in

		double Area = base * height / 2;
		
		System.out.println("The are of your triangle is:" + Area);
	}

}
