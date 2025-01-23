import java.io.IOException;
import java.io.RandomAccessFile;

public class NumberSort  {
	public static void main(String[] args) throws IOException{
		try(
		RandomAccessFile sum = new RandomAccessFile("Exercise17_03.dat","rw");
		){
			
			sum.setLength(0);
			int l = 0;
			int i = 0;
				while(i <= 100) {
					l = (int)(Math.random() * 100);
					sum.writeInt(l);
					i++;
				}
			
		sum.seek(0);
		int value = 0;
		for(int j = 0; j < 100; j++) {
			value += sum.readInt();
			}	
		sum.close();
		System.out.println("The sum of all the integers in the file is: "+ value);
	
		}
	}
}
	
	



