package Labs.Classes;

public class SpecialCar extends Car {
    private String signFormat = "^[A|G|W]+[1|0]$";
    protected String typeName = "Спец. транспорт";
    public SpecialCar(String _mark, String _color, Engine _engine, int _wheelsCount) {
        super(_mark, _color, _engine, _wheelsCount);
    }
    public SpecialCar(String _mark, String _color, Engine _engine, int _wheelsCount, String _sign) {
        super(_mark, _color, _engine, _wheelsCount, _sign);
    }
}
