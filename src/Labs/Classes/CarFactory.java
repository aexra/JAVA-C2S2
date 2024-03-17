package Labs.Classes;

import Labs.Enums.CarType;

public class CarFactory {
    public static Car tryCreate(String _mark, CarType _type, String _color, int _power, int _wheelsCount) {
        if (_wheelsCount > 0) {
            return new Car(_mark, _type, _color, _power, _wheelsCount);
        } else {
            return null;
        }
    }
    public static Car tryCreate(String _mark, CarType _type, String _color, int _power, int _wheelsCount, String _sign) {
        if (_wheelsCount > 0) {
            return new Car(_mark, _type, _color, _power, _wheelsCount, _sign);
        } else {
            return null;
        }
    }
}
