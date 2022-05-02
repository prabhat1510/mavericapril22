package dayone.defaultmethod;

public class TaxRateCalculation {

	public static void main(String[] args) {
		//calculate total order amount inclusive of taxes
		int orderAmount = 15500;
		double totalOrderAmount=0.0;
		
		totalOrderAmount = orderAmount*TaxRate.taxRates();//Calling static method
		
		System.out.println(totalOrderAmount);
		
		TaxRate taxRateImpl = new TaxRateImpl();
		System.out.println(taxRateImpl.taxRate()); //calling the default method
	}

}
