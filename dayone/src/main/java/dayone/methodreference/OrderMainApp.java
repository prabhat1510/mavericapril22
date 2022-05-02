package dayone.methodreference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderMainApp {

	public static void main(String[] args) {
		Order orderOne = new Order("AUD",15000.00);
		Order orderTwo = new Order("INR",5000.00);
		Order orderThree = new Order("USD",150000.00);
		Order orderFour = new Order("EUR",25000.00);
		Order orderFive = new Order("AUD",8000.00);
		Order orderSix = new Order("EUR",5000.00);
		
		List<Order> orderList = new ArrayList<Order>();
		orderList.add(orderOne);
		orderList.add(orderTwo);
		orderList.add(orderThree);
		orderList.add(orderFour);
		orderList.add(orderFive);
		orderList.add(orderSix);
		System.out.println("*************Unsorted orderList ********************");
		orderList.forEach(System.out::println);
		
		//getAmount method reference of Order is passed to Comparator comparing method
		Collections.sort(orderList,Comparator.comparing(Order::getAmount));
		System.out.println("*************Sorted orderList ********************");
		orderList.forEach(System.out::println);
				
		//Static method reference
		DisplayInformation display = Order::displayCurrency;
		display.display();
		System.out.println("*************************");
		//Reference to instance method
		DisplayInformation displayInfo = orderOne::displayAmount;
		displayInfo.display();
		
		//Reference to constructor
		OrderAmount orderAmount = Order :: new ;
		System.out.println(orderAmount.getOrderAmount(1500000.50));
	}

}
