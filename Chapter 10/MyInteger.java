
public class MyInteger {
	 int value;
		
	 	MyInteger(){
		}
	 	
		MyInteger(int newValue){
			value = newValue;
		}
		public int getValue() {
			return value;
		}
		public boolean isEven() {
			if(value % 2 == 0)
				return true;
			else
				return false;
		}
		public boolean isOdd() {
			if(value % 2 != 0)
				return true;
			else 
				return false;
		}
		public boolean isPrime() {
			if(value / value == 1 && value % 2 != 0) 
					return true;
				else 
					return false;
		}
		public static boolean isPrime(int num) {
			if(isPrime(num) == true)
				return true;
			else 
				return false;
		}
		public static boolean isOdd(int num) {
			if(isOdd(num) == true)
				return true;
			else 
				return false;

		}
		public static boolean isEven(int num) {
			if(isEven(num) == true)
				return true;
			else 
				return false;
		}
		public static boolean isPrime(MyInteger value) {
			if(isPrime(value) == true)
				return true;
			else 
				return false;
		}
		public static boolean isOdd(MyInteger value) {
			if(isOdd(value) == true)
				return true;
			else
				return false;
			
		}
		public static boolean isEven(MyInteger value) {
			if(isEven(value) == true)
				return true;
			else
				return false;
		}
		
		public boolean equals(int num) {
			if(num == value)
				return true;
			else 
				return false;
		}
		public boolean equals(MyInteger myInt) {
			if(this.value == myInt.value)
				return true;
			else
				return false;
		}
		public static void parseInt(char[] array) {
			int h = 0;
			for(int j = 0; j < 4; j++) {
				h += array[j];
			}
			System.out.println(h);
		}
		public static void parseInt(String array) {
			int g = 0;
			for(int k = 0; k < 6; k++) {
				if(Character.isDigit(k) == true)
					String.valueOf(k);
					g += k;
			}
			System.out.println(g);
		}
}

