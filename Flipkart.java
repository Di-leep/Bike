package dileep;

public class Flipkart {
	public static void main(String args[]) throws ProductNotFoundException {
		int price = 10000;
		if(price<=10000) {
			throw new ProductNotFoundException("Product Not Found");
		}
		else {
			System.out.println("Product List");
		}
	}

}
