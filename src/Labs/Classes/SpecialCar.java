package Labs.Classes;

public class SpecialCar extends Car {
    public SpecialCar(String _mark, String _color, Engine _engine, int _wheelsCount) {
        super(_mark, _color, _engine, _wheelsCount);
        this.typeName = "Спец. транспорт";
        this.signFormat = "^[A|G|W]+[1|0]$";
    }
    public SpecialCar(String _mark, String _color, Engine _engine, int _wheelsCount, String _sign) {
        super(_mark, _color, _engine, _wheelsCount, _sign);
        this.typeName = "Спец. транспорт";
        this.signFormat = "^[A|G|W]+[1|0]$";
    }
}
