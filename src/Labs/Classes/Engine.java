package Labs.Classes;

public class Engine {
    private String number;
    private int power;
    private int volume;
    private int consumption;
    private int cylinders;

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
}
