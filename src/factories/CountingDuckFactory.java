//6510405440 Thitivath Mongkolgittichot
package factories;
import abstracts.AbstractDuckFactory;
import adapters.*;
import decorator.QuackCounter;
import interfaces.Quackable;
import models.*;

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createPigeon() {
        return new PigeonAdapter(new Pigeon());
    }

    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }
}