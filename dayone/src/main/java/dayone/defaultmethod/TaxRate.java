package dayone.defaultmethod;

public interface TaxRate {
	public default double taxRate() {
		return 15.50;
	}
	
	public static double taxRates() {
		return 16.0;
	}
}
