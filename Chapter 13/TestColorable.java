/*
Katie Prohaska
Date: 12/19/2024
 */
import java.util.Scanner;
public class TestColorable extends Triangle implements Colorable {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Triangle[] triangle = new Triangle[5];
			triangle[0] = new Triangle(5.6,7.8,9.6);
			triangle[1] = new Triangle(4.5,7.8,9.7);
			triangle[2] = new Triangle(5.6,7.8,5.6);
			triangle[3] = new Triangle(4.5,6.8,9.7);
			triangle[4] = new Triangle(8.9,7.8,6.7);
		
		
	
		triangle[0].howToColor();
		System.out.println(triangle[0].toString());
		triangle[1].howToColor();
		System.out.println(triangle[1].toString());
		triangle[2].howToColor();
		System.out.println(triangle[2].toString());
		triangle[3].howToColor();
		System.out.println(triangle[3].toString());
		triangle[4].howToColor();
		System.out.println(triangle[4].toString());
		
	}
	

}
