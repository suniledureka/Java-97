
public class Inventory {

	public static void main(String[] args) {
		Product product = new Product();
		
		product.setProductId(22513);
		product.setProductName("Mobile Phone");
		product.setProductPrice(65700.5f);
		
		System.out.println(product.getProductId() + " | " + product.getProductName() + " | " + product.getProductPrice());
		
		System.out.println("\"product\" reference is of type = " + product.getClass().getName());
		System.out.println("hashcode(product) = " + product.hashCode());
		System.out.println("hasCode(product) in hexadecimanl form = " + Integer.toHexString(product.hashCode()));
		System.out.println();
		
		System.out.println(product); //calls toString() method
	}

}
