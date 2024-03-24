package Labs.Classes;

import java.text.MessageFormat;

public abstract class Car {
    protected String sign;
    protected String mark;
    protected Engine engine;
    protected int wheelsCount;
    public String signFormat;
    public String color;

    private void setSign(String value) {
        this.sign = value;
    }
    public boolean trySetSign(String value) {
        if (Regex.IsMatch(this.signFormat, value)) {
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

    public Car(String _mark, String _color, Engine _engine, int _wheelsCount) {
        this.mark = _mark;
        this.color = _color;
        this.engine = _engine;
        this.wheelsCount = _wheelsCount;
    }
    public Car(String _mark, String _color, Engine _engine, int _wheelsCount, String _sign) {
        this.mark = _mark;
        this.color = _color;
        this.engine = _engine;
        this.wheelsCount = _wheelsCount;
        this.trySetSign(_sign);
    }

    public String toString() {
        return MessageFormat.format("Знак: {0}\nМарка: {1}\nЦвет: {2}\nДвигатель:\n{3}\nКоличество колес: {4}", sign, mark, color, engine.toString(), wheelsCount);
    }
}
