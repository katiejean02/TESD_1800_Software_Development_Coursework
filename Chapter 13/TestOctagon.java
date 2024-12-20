
public class TestOctagon extends Octagon implements Cloneable, Comparable<Octagon>{

	public TestOctagon() {
	}

	public static void main(String[] args) {
		
		Octagon octagon1 = new Octagon(10);
		try {
		Octagon octagon2 = (Octagon)octagon1.clone();
		
	  	System.out.println(octagon1.compareTo(octagon2));
	}
		catch(CloneNotSupportedException ex) {
			System.out.println("CloneNotSupportedException");
		}
		System.out.println(octagon1.toString());
	}
}
