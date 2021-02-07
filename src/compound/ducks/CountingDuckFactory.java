package compound.ducks;

import templatemethod.sort.Duck;

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackalble createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackalble createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackalble createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackalble createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
