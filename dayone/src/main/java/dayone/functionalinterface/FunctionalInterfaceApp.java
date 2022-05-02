package dayone.functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import dayone.methodreference.Order;

public class FunctionalInterfaceApp {

	public static void main(String[] args) {
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
		/**
		 * In evaluate method 2 parameters are passed. 
		 * One is a collection namely "orderList"
		 * and another parameters in a lambda expression 
		 * which is an implementation of a functional interface Consumer
		 * In this example, we are trying to display amount of each order from orderList
		 * 
		 */
		evaluate(orderList,o->System.out.println(o.getAmount()));
		evaluate(orderList,o->System.out.println(o.getCurrency()));
		
		List<Order> filteredOrder = evaluatePredicate(orderList,o->o.getAmount()<10000);
		filteredOrder.forEach(System.out::println);
		
		
		Function<List<Order>,Double> averageOrder = orderLists->{
			double total = 0.0;
			for(Order order: orderLists) {
				total+=order.getAmount();
			}
			return total/orderList.size();
		};
		System.out.println(averageOrder.apply(orderList));
		
		System.out.println("********************Example of andThen and compose*************");
		
		Function<Integer,Integer> addOne = x->x+1;
		Function<Integer,Integer> multiplyByTwo = x->x*2;
		
		//after(In this case first it perform addition and then multiplication)
		Function<Integer,Integer> andThenExample = addOne.andThen(multiplyByTwo);
		
		System.out.println(andThenExample.apply(10));
		//before(In this case first it perform multiplication and then addition) 
		Function<Integer,Integer> composeExample = addOne.compose(multiplyByTwo);
		System.out.println(composeExample.apply(10));
		
		List<Integer> salaries = Arrays.asList(15000,10000,5000,21000,20000,16000);
		for(Integer salary : salaries) {
			System.out.println(andThenExample.apply(salary));
		}
		
		System.out.println(orderList);
		
		System.out.println("*********************Reverse sorting of order on the basis of amount ********************");
		Collections.sort(orderList,Comparator.comparing(Order::getAmount).reversed());
		orderList.forEach(System.out::println);
		System.out.println("*********Chaining of Comparators***************");
		Collections.sort(orderList,Comparator.comparing(Order::getAmount).thenComparing(Order::getCurrency));
		orderList.forEach(System.out::println);
		
		System.out.println("*********************Using streams***********************");
		betterWayToEvaluatePredicate(orderList,o->o.getAmount()<10000);
		
	}
	
	
	public static void evaluate(List<Order> orderList,Consumer<Order> consumer) {
		for(Order order : orderList) {
			consumer.accept(order);
		}
	}
	
	public static List<Order> evaluatePredicate(List<Order> orderList,Predicate<Order> predicate) {
		List<Order> filteredOrder = new ArrayList<Order>();
		for(Order order:orderList) {
			if(predicate.test(order)) {
				filteredOrder.add(order);
			}
		}
		return filteredOrder;
	}
	
	public static void betterWayToEvaluatePredicate(List<Order> orderList,Predicate<Order> predicate) {
		orderList.stream().filter(predicate).forEach(System.out::println);
		
	}

}
