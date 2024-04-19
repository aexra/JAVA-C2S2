package Labs.Classes;

import java.text.MessageFormat;

public class Engine {
    private String number;
    private int power;
    private int volume;
    private int consumption;
    private int cylinders;

    public Engine(String _number, int _power, int _volume, int _consumption, int _cylinders) {
        this.number = _number;
        this.power = _power;
        this.volume = _volume;
        this.consumption = _consumption;
        this.cylinders = _cylinders;
    }

    public String getNumber() {
        return this.number;
    }
    public String setNumber(String _number) {
        this.number = _number;
        return this.number;
    }

    public int getPower() {
        return this.power;
    }
    public int setPower(int _power) {
        this.power = _power;
        return this.power;
    }

    public int getVolume() {
        return this.volume;
    }
    public int setVolume(int _volume) {
        this.volume = _volume;
        return this.volume;
    }

    public int getConsumption() {
        return this.consumption;
    }
    public int setConsumption(int _consumption) {
        this.consumption = _consumption;
        return this.consumption;
    }

    public int getCylinders() {
        return this.cylinders;
    }
    public int setCylinders(int _cylinders) {
        this.cylinders = _cylinders;
        return this.cylinders;
    }

    public String toString() {
        return MessageFormat.format("Серийный номер: {0}\nМощность: {1}\nРабочий объем: {2}\nПотребление: {3}\nЧисло цилиндров: {4}", number, power, volume, consumption, cylinders);
    }
}
