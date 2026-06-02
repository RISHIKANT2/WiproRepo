package com.java.arraylist;



public class DecoratorDemo 
{
	public static void main(String[] args) {
	
		
		   Pizza1 pizza = new PlainPizza();

	       pizza = new Cheese(pizza); //decorator
	   

	       System.out.println(pizza.getDescription());
	       System.out.println(pizza.cost());
	}
	   
	
}
interface Pizza1 {

    String getDescription();
    int cost();
}

class PlainPizza implements Pizza1 {
    public String getDescription() {
        return "Plain Pizza";
    }
    public int cost() {
        return 100;
    }
}

abstract class PizzaDecorator implements Pizza1 {
    protected Pizza1 pizza;

    PizzaDecorator(Pizza1 pizza) {
        this.pizza = pizza;
    }
}

// Cheese topping
class Cheese extends PizzaDecorator {
    Cheese(Pizza1 pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    public int cost() {
        return pizza.cost() + 30;
    }
}

// Paneer topping
class Paneer extends PizzaDecorator {
    Paneer(Pizza1 pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Paneer";
    }

    public int cost() {
        return pizza.cost() + 50;
    }
}
