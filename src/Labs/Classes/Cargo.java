package Labs.Classes;

public class Cargo extends Car {
    protected String typeName = "Грузовой автомобиль";
    public Cargo(String _mark, String _color, Engine _engine, int _wheelsCount) {
        super(_mark, _color, _engine, _wheelsCount);
    }
    public Cargo(String _mark, String _color, Engine _engine, int _wheelsCount, String _sign) {
        super(_mark, _color, _engine, _wheelsCount, _sign);
    }
}
