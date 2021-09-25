package one.digitalinnovation;

import one.digitalinnovation.facade.Facade;
import one.digitalinnovation.singleton.Singleton;
import one.digitalinnovation.strategy.Strategy;

public class Test {
	public static void main(String[] args) {
		Singleton.run();
		Strategy.run();
		Facade.run();
	}
}
