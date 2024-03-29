package Labs.Classes;

import java.text.MessageFormat;

import Labs.Enums.CarType;

public class OldCar {
    private String sign;
    private String mark;
    private CarType type;
    private Engine engine;
    private int wheelsCount;
    public String color;

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
    public String getMark() {
        return this.mark;
    }
    public String getType() {
        return this.type.toString();
    }
    public int getWheelsCount() {
        return this.wheelsCount;
    }

    public Engine getEngine() {
        return this.engine;
    }
    public Engine setEngine(Engine _engine) {
        this.engine = _engine;
        return this.engine;
    }

    public OldCar(String _mark, CarType _type, String _color, Engine _engine, int _wheelsCount) {
        this.mark = _mark;
        this.type = _type;
        this.color = _color;
        this.engine = _engine;
        this.wheelsCount = _wheelsCount;
    }
    public OldCar(String _mark, CarType _type, String _color, Engine _engine, int _wheelsCount, String _sign) {
        this.mark = _mark;
        this.type = _type;
        this.color = _color;
        this.engine = _engine;
        this.wheelsCount = _wheelsCount;
        this.trySetSign(_sign);
    }

    public String toString() {
        return MessageFormat.format("Знак: {0}\nМарка: {1}\nТип: {2}\nЦвет: {3}\nДвигатель:\n{4}\nКоличество колес: {5}", sign, mark, type.toString(), color, "{\n" + engine.toString() + "\n}", wheelsCount);
    }
}
