package Decorator.StarBuzzSize;

public abstract class ContimentDecorator extends Beverage {
    public abstract String getDescription();
    public Beverage beverage;

    public Size getSize(){
        return beverage.getSize();
    }
}
