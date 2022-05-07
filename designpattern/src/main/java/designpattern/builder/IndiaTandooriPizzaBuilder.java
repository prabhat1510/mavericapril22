package designpattern.builder;

public class IndiaTandooriPizzaBuilder extends PizzaBuilder implements PizzaBaseType{

	@Override
	public void buildDough() {
		pizza.setDough("Atta");
		
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("Tandoori Mint Sauce");
		
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("Paneer");
		
	}

	public void pizzaBaseType() {
	System.out.println("Double Cheese");
		
	}

}
