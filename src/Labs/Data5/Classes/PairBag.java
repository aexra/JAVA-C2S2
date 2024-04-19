package Labs.Data5.Classes;

public class PairBag extends Bag {
    private Pair<Object, Object>[] container;

    public PairBag(int size) {
        super(size);
    }

    public void push(Pair pair) {
        __push__(pair);
    }
}
