package Strategy;


public class MiniDuckSimulator {

    public static void main(String[] args) {
	    Duck mallard = new MallardDuck();
	    mallard.performQuack();
	    mallard.performFly();

		Duck model = new ModelDuck();
		model.performFly(); // flyNoWays 호출
		model.setFlyBehavior(new FlyRocketPowered()); // flyBehavior 변경
		model.performFly(); // flyRockerPowered호출

    }
}
