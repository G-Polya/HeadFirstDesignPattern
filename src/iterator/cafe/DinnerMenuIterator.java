package iterator.cafe;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public Object next() {
        MenuItem menuItem = items[position];
        position += 1;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else{
            return true;
        }

    }

    public void remove() {
        if (position < 0) {
            throw new IllegalStateException("next()를 한번도 호출하지 않은 상태에서는 호출할 수 없습니다");
        }
        if (items[position - 1] != null) {
            for (int i = 0; i < items.length-1; i++) {
                items[i] = items[i+1];
            }

            items[items.length-1] = null;
        }
    }

}
