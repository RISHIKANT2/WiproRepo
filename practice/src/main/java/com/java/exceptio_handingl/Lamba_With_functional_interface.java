package com.java.exceptio_handingl;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;


public class Lamba_With_functional_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> print = s -> System.out.println(s);

        print.accept("Hello Java");
        
        Function<Integer, Integer> square = x -> x * x;

        System.out.println(square.apply(5)); // 25
        
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(4));
        Supplier<String> randomValue = () -> "Supplier Function Works";

        System.out.println(randomValue.get());
	}

}
