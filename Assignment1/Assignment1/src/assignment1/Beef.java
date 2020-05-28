package assignment1;

public class Beef extends PizzaDecorator {
	public Beef(Pizza decoratedPizza) {
	super(decoratedPizza);
}
	public String getDesc() {
		
		return decoratedPizza.getDesc() + " + Beef: 14.25 "; 
	}
	public double getPrice() {
	
		return decoratedPizza.getPrice() + 14.25;
	}
}
