package daytwo.exercise;

public class ProductMainApp {

	public static void main(String[] args) {
			Product product = new Product(1L,"iPhone 13 Pro Max","Mobile",135000.50);
			System.out.println(product);
			
			Product prod = new Product();
			prod.setId(2L);
			prod.setName("iPhone 13 Pro Max Charger");
			prod.setCategory("Accessories");
			prod.setPrice(15000.00);
			
			System.out.println(prod);

	}

}
