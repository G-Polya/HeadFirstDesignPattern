package iterator.util_iterator;


import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinnerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinnerIterator = dinnerMenu.createIterator();

        System.out.println("메뉴\n-----\n아침메뉴");
        printMenu(pancakeIterator);
        System.out.println("\n점심메뉴");
        printMenu(dinnerIterator);
    }

    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice()+" -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}

