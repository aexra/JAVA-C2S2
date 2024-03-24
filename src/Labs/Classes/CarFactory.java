package Labs.Classes;

import Labs.Enums.CarType;

public class CarFactory {
    public static OldCar tryCreate(String _mark, CarType _type, String _color, Engine _engine, int _wheelsCount) {
        if (_wheelsCount > 0) {
            return new OldCar(_mark, _type, _color, _engine, _wheelsCount);
        } else {
            return null;
        }
    }
    public static OldCar tryCreate(String _mark, CarType _type, String _color, Engine _engine, int _wheelsCount, String _sign) {
        if (_wheelsCount > 0) {
            return new OldCar(_mark, _type, _color, _engine, _wheelsCount, _sign);
        } else {
            return null;
        }
    }
}
