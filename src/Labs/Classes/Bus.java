package Labs.Classes;

public final class Bus extends Car {
    public Bus(String _mark, String _color, Engine _engine, int _wheelsCount) {
        super(_mark, _color, _engine, _wheelsCount);
        this.typeName = "Автобус";
    }
    public Bus(String _mark, String _color, Engine _engine, int _wheelsCount, String _sign) {
        super(_mark, _color, _engine, _wheelsCount, _sign);
        this.typeName = "Автобус";
    }
}
