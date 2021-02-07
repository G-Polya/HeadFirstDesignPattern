package compound.ducks;

public class QuackCounter implements Quackalble {
    Quackalble duck;
    static int numberOfQuacks;

    public QuackCounter(Quackalble duck) {
        this.duck = duck;
    }

    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }
}
