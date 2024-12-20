
public class Triangle extends GeometricObject{
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	public Triangle() {
		
	}
	public Triangle(String color, boolean filled, double side1, double side2, double side3) {
		super(color, filled);
	}
	public double getSide(double side) {
		return side;
	}
	public void setSide1(double side) {
		this.side1 = side1;
	}
	public void setSide2(double side) {
		this.side2 = side2;
	}
	public void setSide3(double side) {
		this.side3 = side3;
	}
	@Override
	public double getArea() {
		return setArea();
	}
	public double setArea() {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt((s * (s - side1) * (s - side2) * (s -side3)));
		return area;
	}
	@Override
	public double getPerimeter() {
		return setPerimeter();
	}
	public double setPerimeter() {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	@Override
	public String toString() {
		return super.toString() + " The area of the triangle: " + getArea() + " The perimeter of the triangle: " + getPerimeter();
	}
}
