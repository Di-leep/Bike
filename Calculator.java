package dileep;

public class Calculator {
	public static void main(String args[]) {
		
	System.out.println("Welcome");
		int num = 10;
		int num1 = 0;
		////////////////Arithmetic Exception////////////////////
		try {
			int num2 = num/num1;
		System.out.println(num2);
		}catch(ArithmeticException  ae) {
			System.out.println(ae+" can not diviseble");
		}finally {
			System.out.println("Thank You");
		} 
		//////////////// NullPointer Exception////////////////////
		try {
			String name = null;
			System.out.println(name.charAt(3));
		}catch(NullPointerException ne) {
			System.out.println(ne+"  Given String is null");
		}finally {
			System.out.println("Invalid");
		}
		////////////////NumberFormat Exception/////////////////////
		String val ="hi";
		try {
			int num4 = Integer.parseInt(val);
		}catch(NumberFormatException ne) {
			System.out.println(ne+" Invalid");
		}
		///////////////ArrayIndexOutOfBounds Exception/////////////////
		int[] nums = {1,2,3,4};
		try {
			System.out.println(nums[7]);
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae+" Invalid");
		}finally {
			System.out.println("Not having ");
		}
		///////////////StringIndexOutOfBounds Exception/////////////////
		String name ="Ram";
		try {
			System.out.println(name.charAt(6));
		}catch(StringIndexOutOfBoundsException se) {
			System.out.println(se+" invalid");
		}finally {
			System.out.println("Not having");
		}
	}

}
