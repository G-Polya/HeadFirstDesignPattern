package iterator.dinnermerger;


import java.util.List;

public class PancakeHouseIterator implements Iterator{
    List<MenuItem> items;
    int position = 0;

    public PancakeHouseIterator(List<MenuItem> items) {
        this.items = items;
    }

    public Object next() {
        return items.get(position++);
    }

    public boolean hasNext() {
        return items.size() > position;
    }
}
