package Labs.Data5.Classes;

import java.util.LinkedList;
import java.util.ArrayList;

import static Helpers.Logger.log;

public class GenericPairBag<T, U> extends Bag {
    private ArrayList<Pair<T, U>> container;

    public GenericPairBag(int size) {
        super(size);
    }

    protected void initContainer(int size) {
        container = new ArrayList<Pair<T, U>>();
    }

    public void push(Pair<T, U> pair) {
        container.add(pair);
    }

    public void push(T left, U right) {
        container.add(new Pair<T, U>(left, right));
    }

    public int size() {
        return container.size();
    }

    protected Object removeItem(int index) {
        var popped = container.get(index);
        container.remove(index);
        return popped;
    }

    protected LinkedList<Integer> getFilledIndexes() {
        var list = new LinkedList<Integer>();

        for (var i = 0; i < container.size(); i++) {
            list.add(i);
        }

        return list;
    }

    public String toString() {
        var s = "";

        for (var item : container) {
            if (item != null) s += item.toString();
            else s += "null";
            s += ", ";
        }

        return s;
    }

    public int capacity() {
        return container.size();
    }
}
