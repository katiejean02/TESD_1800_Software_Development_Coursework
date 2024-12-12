
public class Triangle extends GeometricObject{
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle(double side1, double side2, double side3) {
	}
	public Triangle(String color, boolean filled) {
		super(color , filled);
	}
	public double getSide(double side) {
		return side;
	}
	public void setSide1(double side) {
		this.side1 = side;
	}
	public void setSide2(double side) {
		this.side2 = side;
	}
	public void setSide3(double side) {
		this.side3 = side;
	}
	public double setArea() {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt((s *(s - side1) * (s - side2) * (s - side3)));
		return area;
	}
	
	public double getArea() {
		return setArea();
		
	}
	public double setPerimeter() {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	
	public double getPerimeter() {
		return setPerimeter();	
	}
}