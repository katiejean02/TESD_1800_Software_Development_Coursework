public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon>{
	private double side = 1.0;  
	private double area;
	
	public Octagon() {
		double side;
	}
	
	public Octagon(double side) {
	this.side = side;
	}
	
	@Override
	public double getArea() {	
		double area = (2 + 4 / Math.sqrt(2) * side * side);
		return area;
	}
	@Override
	public double getPerimeter() {
		double perimeter = side * 8;
		return perimeter;
	}
	public double getSide() {
		return side;
	}
	@Override
	public int compareTo(Octagon o) {
		System.out.println(area + " " + o.area);
		if(area > o.area) 
			return 1;
		else if(area < o.area) 
			return -1;
		else 
		    return 0;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		try {
		return (Octagon)super.clone();
	}
		catch(CloneNotSupportedException ex) {
			return null;
		}
}

}
	
	

