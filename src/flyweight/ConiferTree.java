package flyweight;


public class ConiferTree implements Tree {
    @Override
    public void display(int x, int y) {
        System.out.println("Conifer tree is locatioed at " + x + ", " + y);
    }
}

