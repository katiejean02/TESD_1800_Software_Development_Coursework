import java.util.Scanner;
public class TestTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		Triangle triangle = new Triangle(0,0,0);
		System.out.println("Enter a number for side1: ");
			triangle.setSide1(input.nextDouble());
		System.out.println("Enter a number for side2: ");
			triangle.setSide2(input.nextDouble());
		System.out.println("Enter a number for side3: ");
			triangle.setSide3(input.nextDouble());

		
		System.out.println("Enter a color for the triangle: ");
		triangle.setColor(input.next());
		System.out.println("Enter 0 for the triangle to be filled, 1 for the triangle to be empty: ");
		int fill = input.nextInt();
		if(fill == 0) {
			triangle.setFilled(true);
		}
		if(fill == 1) {
			triangle.setFilled(false);
		}
		
		System.out.println("A triangle " + triangle.toString());
		System.out.println("The color is " + triangle.getColor());
		System.out.println("The area of the triangle is " + triangle.setArea());
		System.out.println("The triangle is filled:  " + triangle.isFilled());
		System.out.println("The date the triangle was created " + triangle.getDateCreated());
		System.out.println("The perimeter of the triangle is " + triangle.setPerimeter());
	}
}


