package Labs.Data5.Classes;

public class Bag {
    private Object[] container;

    public Bag(int size) {
        container = new Object[size];
    }

    public void push(Object item) {

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
}
