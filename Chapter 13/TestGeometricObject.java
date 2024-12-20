import java.util.Scanner;
public class TestGeometricObject extends Triangle{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Triangle triangle = new Triangle();
		System.out.println("Enter 3 sides for the triangle: ");
		triangle.setSide1(input.nextDouble());
		triangle.setSide2(input.nextDouble());
		triangle.setSide3(input.nextDouble());
		
		System.out.println("Enter a color for the triangle: ");
		triangle.setColor(input.next());
		
		System.out.println("Would you like th trianlge filled? 0 for yes 1 for no.");
		int fill = input.nextInt();
		if(fill == 0) {
			triangle.setFilled(true);
		}
		if(fill == 1) {
			triangle.setFilled(false);
		}
		System.out.println("The triangle " + triangle.toString());
		

	}

}
