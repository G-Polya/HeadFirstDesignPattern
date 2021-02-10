package flyweight;

public class Client {
    public static void main(String[] args) {
        int[][] deciduousLocations = {{1, 1}, {33, 50}, {100, 90}};
        int[][] coniferLocations = {{10, 87}, {24, 76}, {2, 64}};

        TreeFactory treeFactory = new TreeFactory();

        Tree d,c;
        try {
            d = treeFactory.getTree("deciduous");
            c = treeFactory.getTree("conifer");
            for (int[] locaiton : deciduousLocations) {
                d.display(locaiton[0],locaiton[1]);
            }

            for (int[] location : coniferLocations) {
                c.display(location[0], location[1]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
