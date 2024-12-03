/*
Katie Prohaska
Date: 11/25/2024
 */
public class TestMyInteger {
	public static void main(String[] args) {

		String sum = "12345";
		char[] sum1 = {5,6,7,8};
		MyInteger int1 = new MyInteger(34);
		MyInteger int2 = new MyInteger(19);
		MyInteger int3 = new MyInteger(23);	

		System.out.println("Is int1 prime?");
		System.out.println(int1.isPrime());
		System.out.println("Is int2 prime?");
		System.out.println(int2.isPrime());
		System.out.println("Is int3 prime?");
		System.out.println(int3.isPrime());
		
		System.out.println("Is int1 odd?");
		System.out.println(int1.isOdd());
		System.out.println("is int2 odd?");
		System.out.println(int2.isOdd());
		System.out.println("Is int3 odd?");
		System.out.println(int3.isOdd());
		
		System.out.println("Is int1 even?");
		System.out.println(int1.isEven());
		System.out.println("is int2 even?");
		System.out.println(int2.isEven());
		System.out.println("Is int3 even?");
		System.out.println(int3.isEven());

		System.out.println("Is int1 and MyInteger equal?");
		System.out.println(int1.equals(54));
		
		System.out.println("The sum of the char array is: ");
		MyInteger.parseInt(sum1);

		System.out.println("The sum of the string array is: ");
		MyInteger.parseInt(sum);
	}
		}