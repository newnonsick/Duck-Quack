//6510405440 Thitivath Mongkolgittichot
package decorator;
import interfaces.Quackable;

public class PoliteQuack implements Quackable {
    Quackable duck;

    public PoliteQuack(Quackable duck) {
        this.duck = duck;
    }

    public void quack() {
        duck.quack();
        System.out.print("ja");
    }
}
