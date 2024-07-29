//6510405440 Thitivath Mongkolgittichot
import decorator.QuackCounter;
import factories.*;
import models.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Duck Simulator: With Counting Decorators");
        DuckSimulator simulator2 = new DuckSimulator(new CountingDuckFactory());
        simulator2.simulate();

        System.out.println();
        System.out.println("Duck Simulator: With Counting N Polite Decorators");
        DuckSimulator simulator3 = new DuckSimulator(new CountingNPoliteDuckFactory());
        simulator3.simulate();

        System.out.println();
        System.out.println("Duck Simulator: With Flock");
        Flock flock = new Flock();
        flock.add(new QuackCounter(new MallardDuck()));
        flock.add(new QuackCounter(new RedheadDuck()));
        flock.add(new QuackCounter(new RubberDuck()));
        flock.add(new QuackCounter(new DuckCall()));
        flock.quack();
        System.out.println("Number of Quacks: " + QuackCounter.getQuacks());
    }
}