//6510405440 Thitivath Mongkolgittichot
import interfaces.Quackable;
import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {
    List<Quackable> ducks = new ArrayList<>();
    Quackable duckLeader;

    public void add(Quackable duck) {
        if (duckLeader == null) {
            duckLeader = duck;
        }
        ducks.add(duck);
    }

    public void quack() {
        for (Quackable duck : ducks) {
            if (duck == duckLeader) {
                duck.quack();
                duck.quack();
            }
            duck.quack();
            System.out.println();
        }
    }
}