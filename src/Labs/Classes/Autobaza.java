package Labs.Classes;

public final class Autobaza {
    private Car[] cars;

    public Autobaza(int size) throws Exception {
        if (size < 1) throw new Exception("Autobaza must be at least size 1");
        cars = new Car[size];
    }
}
