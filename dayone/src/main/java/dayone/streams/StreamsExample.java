package dayone.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import dayone.methodreference.Order;

public class StreamsExample {

	public static void main(String[] args) {
		List<Integer> listOfNumbers = Arrays.asList(15,11,10,9,12,13,2,5,8,1,7,6,4,14,16);
		listOfNumbers.stream() //source of stream
					 .filter(num->num>3) //operation
					 .limit(5) //restricting stream processing for the first five elements
					 .forEach(System.out::println);
		System.out.println("***************************************");
		listOfNumbers.stream() //source of stream
		 .filter(num->num>3) //operation
		 .skip(5) //stream processing skipped for the first five elements
		 .forEach(System.out::println);
		
		System.out.println("**********************sort*****************");
		listOfNumbers.stream() //source of stream
						.sorted()//operation //By default, it returns stream items in natural order
						.forEach(System.out::println);
		
		Stream<Integer> streamOfNumbers = listOfNumbers.stream();
		streamOfNumbers.sorted().forEach(System.out::println);
		
		Order orderOne = new Order("AUD",15000.00);
		Order orderTwo = new Order("INR",5000.00);
		Order orderThree = new Order("USD",150000.00);
		Order orderFour = new Order("EUR",5000.00);
		Order orderFive = new Order("AUD",8000.00);
		Order orderSix = new Order("EUR",5000.00);
		Order orderSeven = new Order("EUR",1000.00);
		
		List<Order> orderList = new ArrayList<Order>();
		orderList.add(orderOne);
		orderList.add(orderTwo);
		orderList.add(orderThree);
		orderList.add(orderFour);
		orderList.add(orderFive);
		orderList.add(orderSix);
		orderList.add(orderSeven);
		
		orderList.stream()
					.filter(o->o.getAmount() >5000)
					.sorted(Comparator.comparing(Order::getAmount))
					.forEach(System.out::println);
		System.out.println("*************Example of map() function********************");
		orderList.stream().filter(o->o.getCurrency().equals("EUR"))
							.map(Order::getAmount)
							.forEach(System.out::println);
		
		//Generating results from Streams - reduce()
		double total = listOfNumbers.stream().filter(n->n>10).reduce(0, (a,b)->a+b);
		System.out.println(total);
		
		System.out.println("*******************count*********************");
		double countOfFilteredNumbers = listOfNumbers.stream().filter(n->n>10).count();
		System.out.println(countOfFilteredNumbers);
		System.out.println("*******************min*******************");
		//orderList.stream().filter(o->o.getCurrency().equals("EUR")).forEach(System.out::println);
		System.out.println(orderList.stream().filter(o->o.getCurrency().equals("AUD")).min(Comparator.comparing(Order::getAmount)));
		System.out.println("*******************max*******************");
		System.out.println(orderList.stream().filter(o->o.getCurrency().equals("AUD")).max(Comparator.comparing(Order::getAmount)));
		
		IntStream.range(1, 10).forEach(System.out::println);
		
		List<Order> nonEUROOrders = orderList.stream().filter(o->!(o.getCurrency().equals("EUR"))).collect(Collectors.toList());
		nonEUROOrders.forEach(System.out::println);
		
		//Another example of Collectors.groupBy method
		Map<String,List<Order>> filteredOrders = 
				orderList.stream().collect(Collectors.groupingBy(Order::getCurrency));
		
		System.out.println(filteredOrders);
		
		

	}

}
