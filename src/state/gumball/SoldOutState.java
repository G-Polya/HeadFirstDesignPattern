package state.gumball;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전을 넣을 수 없습니다. 알맹이가 매진되었습니다");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 반환할 수 없습니다. 아직 동전을 넣지 않았습니다");
    }

    @Override
    public void turnCrank() {
        System.out.println("레버를 돌렸으나 알맹이가 안에 없습니다");
    }

    @Override
    public void dispense() {
        System.out.println("알맹이가 나오지 않았습니다");
    }

    public void refill() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public String toString() {
        return "sold out";
    }
}
