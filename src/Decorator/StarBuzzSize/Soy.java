package Decorator.StarBuzzSize;

public class Soy extends ContimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if(beverage.getSize() == Size.TALL) {
            cost += 0.10;
        } else if(beverage.getSize() == Size.GRANDE) {
            cost += .15;
        } else if (beverage.getSize() == Size.VENTI){
            cost += .20;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }
}
