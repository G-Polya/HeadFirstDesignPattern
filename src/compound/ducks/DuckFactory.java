package compound.ducks;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackalble createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackalble createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackalble createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackalble createRubberDuck() {
        return new RubberDuck();
    }
}
