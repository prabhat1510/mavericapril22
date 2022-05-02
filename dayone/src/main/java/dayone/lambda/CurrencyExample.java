package dayone.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CurrencyExample {
	public static void main(String[] args) {
		List<String> currencies = Arrays.asList("USD","JPY","EUR","HKD","INR","AUD");
		System.out.println("Unsorted currencies  ----"+currencies);
		/**
		Collections.sort(currencies,(a,b)-> {return a.compareTo(b);});
		System.out.println("Sorted currencies -----"+currencies);
		**/
		Collections.sort(currencies,(String a,String b)-> {return a.compareTo(b);});
		System.out.println("Sorted currencies -----"+currencies);
		
		System.out.println("********************************************");
		for(String currency : currencies)
			System.out.println(currency);
		
		System.out.println("**********************forEach using lambda expression**********************");
		currencies.forEach(c->System.out.println(c));
		
		System.out.println("**********************forEach using method reference**********************");
		currencies.forEach(System.out::println);
		
		currencies.forEach((String currency)->System.out.printf("Currency is %s "+"--",currency));
	}
}
