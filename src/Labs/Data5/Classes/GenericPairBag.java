package Labs.Data5.Classes;

import java.util.LinkedList;
import java.util.ArrayList;

public class GenericPairBag<T, U> extends Bag {
    private ArrayList<Pair<T, U>> container;

    public GenericPairBag(int size) {
        super(size);
    }

    public void push(Pair<T, U> pair) {
        __push__(pair);
    }

    public void push(T left, U right) {
        __push__(new Pair<T, U>(left, right));
    }

    protected void setItem(int index, Pair<T, U> value) {
        container.set(index, value);
    }

    protected LinkedList<Integer> getFreeIndexes() {
        var list = new LinkedList<Integer>();

        for (var i = 0; i < container.size(); i++) {
            if (container.get(i) == null) list.add(i);
        }

        return list;
    }

    protected LinkedList<Integer> getFilledIndexes() {
        var list = new LinkedList<Integer>();

        for (var i = 0; i < container.size(); i++) {
            if (container.get(i) != null) list.add(i);
        }

        return list;
    }
}
