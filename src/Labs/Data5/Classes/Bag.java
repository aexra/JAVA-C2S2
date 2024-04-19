package Labs.Data5.Classes;

import java.util.LinkedList;

public class Bag {
    protected Object[] container;

    public Bag(int size) {
        initContainer(size);
    }

    public void push(Object item) {
        __push__(item);
    }

    final protected void __push__(Object item) {
        var free = getFreeIndexes();
        if (free.isEmpty()) throw new StackOverflowError("Bag is filled");

        var randomIndex = (int) Math.round(Math.random() * (free.size() - 1));
        var push_index = free.get(randomIndex);

        setItem(push_index, item);
    }

    protected void initContainer(int size) {
        container = new Object[size];
    }

    protected void setItem(int index, Object value) {
        container[index] = value;
    }

    protected Object removeItem(int index) {
        var popped = container[index];
        container[index] = null;
        return popped;
    }

    final public Object pop() {
        var filled = getFilledIndexes();
        if (filled.isEmpty()) throw new StackOverflowError("Bag is empty");

        var randomIndex = (int) Math.round(Math.random() * (filled.size() - 1));
        var pop_index = filled.get(randomIndex);

        return removeItem(pop_index);
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

    protected LinkedList<Integer> getFreeIndexes() {
        var list = new LinkedList<Integer>();

        for (var i = 0; i < container.length; i++) {
            if (container[i] == null) list.add(i);
        }

        return list;
    }

    protected LinkedList<Integer> getFilledIndexes() {
        var list = new LinkedList<Integer>();

        for (var i = 0; i < container.length; i++) {
            if (container[i] != null) list.add(i);
        }

        return list;
    }

    public int size() {
        return getFilledIndexes().size();
    }
    public int capacity() {
        return container.length;
    }
}
