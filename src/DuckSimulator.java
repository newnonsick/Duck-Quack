//6510405440 Thitivath Mongkolgittichot
import abstracts.AbstractDuckFactory;
import decorator.QuackCounter;
import interfaces.Quackable;
import java.util.ArrayList;
import java.util.List;

class DuckSimulator {
    List<Quackable> ducks = new ArrayList<>();

    public DuckSimulator(AbstractDuckFactory duckFactory) {
        ducks.add(duckFactory.createMallardDuck());
        ducks.add(duckFactory.createRedheadDuck());
        ducks.add(duckFactory.createRubberDuck());
        ducks.add(duckFactory.createDuckCall());
        ducks.add(duckFactory.createGoose());
        ducks.add(duckFactory.createPigeon());
    }

    public void simulate() {
        for (Quackable duck : ducks) {
            duck.quack();
            System.out.println();
        }

        System.out.println("Number of Quacks: " + QuackCounter.getQuacks());
    }
}
