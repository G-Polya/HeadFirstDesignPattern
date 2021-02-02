package proxy.gumball;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        int count = 0;

//        if (args.length < 2) {
//            System.out.println("GumBallMachine <name> <inventory>");
//            System.exit(1);
//        }

        count = Integer.parseInt("112");
        GumballMachine gumballMachine = new GumballMachine("Seattle", count);

        GumballMonitor monitor = new GumballMonitor(gumballMachine);

        monitor.report();
    }
}
