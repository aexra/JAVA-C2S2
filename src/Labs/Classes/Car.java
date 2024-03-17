package Labs.Classes;

import Labs.Enums.CarType;

public class Car {
    private String sign;
    private String mark;
    private CarType type;
    private String color;
    private int power;
    private int wheelsCount;

    private void setSign(String value) {
        this.sign = value;
    }
    public boolean trySetSign(String value) {
        if (Regex.IsMatch(this.type.signFormat, value)) {
            setSign(value);
            return true;
        }
        else {
            return false;
        }
    }
    public String getSign() {
        return this.sign;
    }

    public Car(String _mark, CarType _type, String _color, int _power, int _wheelsCount) {
        this.mark = _mark;
        this.type = _type;
        this.color = _color;
        this.power = _power;
        this.wheelsCount = _wheelsCount;
    }
    public Car(String _mark, CarType _type, String _color, int _power, int _wheelsCount, String _sign) {
        this.mark = _mark;
        this.type = _type;
        this.color = _color;
        this.power = _power;
        this.wheelsCount = _wheelsCount;
        this.trySetSign(_sign);
    }
}
