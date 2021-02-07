package compound.ducks;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackalble mallardDuck = duckFactory.createMallardDuck();
        Quackalble duckCall = duckFactory.createDuckCall();
        Quackalble redheadDuck = duckFactory.createRedheadDuck();
        Quackalble rubberDuck = duckFactory.createRubberDuck();
        Quackalble gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("The ducks quacked "+QuackCounter.getQuacks()+" times");
    }

    void simulate(Quackalble duck) {
        duck.quack();
    }
}
