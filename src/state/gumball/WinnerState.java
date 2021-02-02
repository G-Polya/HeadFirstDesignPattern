package state.gumball;

public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("잠깐만요. 이미 Gumball을 드렸는데요");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("잠깐만요. 이미 Gumball을 드렸는데요");
    }

    @Override
    public void turnCrank() {
        System.out.println("한번 더 돌린다고 또 주진 않아요");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else{
            gumballMachine.releaseBall();
            System.out.println("축하합니다! 두개의 Gumball을 받으세요");
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("이런! Gumball이 고갈났어요!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

    public void refill() { }

    public String toString() {
        return "despensing two gumballs for your quarter, because YOU'RE A WINNER!";
    }
}
