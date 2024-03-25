package Labs.Classes;

public class LightCar extends Car {
    protected String typeName = "Легковое авто";
    public LightCar(String _mark, String _color, Engine _engine, int _wheelsCount) {
        super(_mark, _color, _engine, _wheelsCount);
    }
    public LightCar(String _mark, String _color, Engine _engine, int _wheelsCount, String _sign) {
        super(_mark, _color, _engine, _wheelsCount, _sign);
    }
}
