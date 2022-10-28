package dileep;
public class NestedCatch {
	public static void main(String args[]) {
		try {
			String[] vals= {"Ram","Pradeep","Siva",null};
			System.out.println(vals[6]);
		//	System.out.println(vals[2].charAt(11));
		//  System.out.println(vals[3].charAt(3));
		}catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println(aie+" Not found");
		}catch(StringIndexOutOfBoundsException sie) {
			System.out.println(sie+" No Letter found");
			
		}catch(NullPointerException ne) {
			System.out.println(ne+" Given is null");
			
		}catch(Exception e) {
	}

}
}