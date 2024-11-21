/*
 Katie Prohaska
 Date: 11/21/2024
 */
import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Rectangle rectangle1 = new Rectangle(40,4);
		System.out.println("The width of rectangle1 is " + rectangle1.width);
		System.out.println("The height of rectangle1 is " + rectangle1.height);
		System.out.println("The area for rectangle1 is " + rectangle1.getArea());
		System.out.println("The perimeter of rectangle1 is " + rectangle1.getPerimeter());
		
		Rectangle rectangle2 = new Rectangle(35.9,3.5);
		System.out.println("The width of rectangle2 is " + rectangle2.width);
		System.out.println("The height of rectangle2 is " + rectangle2.height);
		System.out.println("The area of rectangle2 is " + rectangle2.getArea());
		System.out.println("The perimeter of rectangle2 is " + rectangle2.getPerimeter());
	}
}
			
		class Rectangle{
			double height = 1;
			double width = 1;
			
			Rectangle(){
			}
			
			Rectangle(double newHeight,double newWidth){
				height = newHeight;
				width = newWidth;
			}
			double getArea() {
				return width * height;
			}
			double getPerimeter() {
				return width + width + height + height;
			}
		}
