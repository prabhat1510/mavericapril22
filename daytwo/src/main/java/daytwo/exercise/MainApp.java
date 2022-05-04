package daytwo.exercise;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		Customer    cust1	=new	Customer(1L, "Stefan Walker", 1);
		Customer	cust2	=new	Customer(2L, "Daija Von", 1);
		Customer	cust3	=new	Customer(3L, "Ariane Rodriguez", 1);
		Customer	cust4	=new	Customer(4L, "Marques Nikolaus", 2);
		Customer	cust5	=new	Customer(5L, "Rachelle Greenfelder", 0);
		Customer	cust6	=new	Customer(6L, "Larissa White", 2);
		Customer	cust7	=new	Customer(7L, "Fae Heidenreich", 1);
		Customer	cust8	=new	Customer(8L, "Dino Will", 2);
		Customer	cust9	=new	Customer(9L, "Eloy Stroman", 1);
		Customer	cust10	=new	Customer(10L, "Brisa O Connell", 1);

		Product prod1	=new	Product(1L, "omnis quod consequatur", "Games", 184.83);
		Product prod2	=new	Product(2L, "vel libero suscipit", "Toys", 12.66);
		Product prod3	=new	Product(3L, "non nemo iure", "Grocery", 498.02);
		Product prod4	=new	Product(4L, "voluptatem voluptas aspernatur", "Toys", 536.80);
		Product prod5	=new	Product(5L, "animi cum rem", "Games", 458.20);
		Product prod6	=new	Product(6L, "dolorem porro debitis", "Toys", 146.52);
		Product prod7	=new	Product(7L, "aspernatur rerum qui", "Books", 656.42);
		Product prod8	=new	Product(8L, "deleniti earum et", "Baby", 41.46);
		Product prod9	=new	Product(9L, "voluptas ut quidem", "Books", 697.57);
		Product prod10	=new	Product(10L, "eos sed debitis", "Baby", 366.90);
		Product prod11	=new	Product(11L, "laudantium sit nihil", "Toys", 95.50);
		Product prod12	=new	Product(12L, "ut perferendis corporis", "Grocery", 302.19);
		Product prod13	=new	Product(13L, "sint voluptatem ut", "Toys", 295.37);
		Product prod14	=new	Product(14L, "quos sunt ipsam", "Grocery", 534.64);
		Product prod15	=new	Product(15L, "qui illo error", "Baby", 623.58);
		Product prod16	=new	Product(16L, "aut ex ducimus", "Books", 551.39);
		Product prod17	=new	Product(17L, "accusamus repellendus minus", "Books", 240.58);
		Product prod18	=new	Product(18L, "aut accusamus quia", "Baby", 881.38);
		Product prod19	=new	Product(19L, "doloremque incidunt sed", "Games", 988.49);
		Product prod20	=new	Product(20L, "libero omnis velit", "Baby", 177.61);
		Product prod21	=new	Product(21L, "consectetur cupiditate sunt", "Toys", 95.46);
		Product prod22	=new	Product(22L, "itaque ea qui", "Baby", 677.78);
		Product prod23	=new	Product(23L, "non et nulla", "Grocery", 70.49);
		Product prod24	=new	Product(24L, "veniam consequatur et", "Books", 893.44);
		Product prod25	=new	Product(25L, "magnam adipisci voluptate", "Grocery", 366.13);
		Product prod26	=new	Product(26L, "reiciendis consequuntur placeat", "Toys", 359.27);
		Product prod27	=new	Product(27L, "dolores ipsum sit", "Toys", 786.99);
		Product prod28	=new	Product(28L, "ut hic tempore", "Toys", 316.09);
		Product prod29	=new	Product(29L, "quas quis deserunt", "Toys", 772.78);
		Product prod30	=new	Product(30L, "excepturi nesciunt accusantium", "Toys", 911.46);
		
		List<Product> productList1 = new ArrayList<Product>(); 
		productList1.add(prod3);
		productList1.add(prod23);
		productList1.add(prod13);
		productList1.add(prod1);
		
				
		Order order1 = new Order(1L,"New",LocalDate.now(),LocalDate.now().plusDays(5),productList1,cust1);
		
		List<Product> productList2 = new ArrayList<Product>();
		productList2.add(prod30);
		productList2.add(prod11);
		
		Order order2 = new Order(2L,"New",LocalDate.now(),LocalDate.now().plusDays(6),productList2,cust2);
		

	}

}
