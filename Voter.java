package dileep;

public class Voter {
	public static void main(String args[]) {
		int age=16;
		try {
		if(age<18) {
			throw new InvalidAgeException("Not Eligble");
		}else {
			System.out.println("Eligble");
		}
			
		}catch(Exception e) {
			System.out.println(e+ " Eligble");
		}
	}

}
