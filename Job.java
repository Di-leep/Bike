package dileep;

public class Job {
	public static void main(String args[]) {
		
		String a ="Be";
		try {
		if(a.equalsIgnoreCase("BE")|| a.equalsIgnoreCase("BA")|| a.equalsIgnoreCase("MBA")) {
			throw new JobEligbleException("Your Eligble");
			
		}else {
			System.out.println("Not Eligble");
		}
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
