package Labs.Classes;

import java.text.MessageFormat;

public final class Autobaza {
    private Car[] cars;

    public Autobaza(int size) throws Exception {
        if (size < 1) throw new Exception("Autobaza must be at least size 1");
        cars = new Car[size];
    }

    public boolean tryAddCar(Car car) {
        for (var i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                cars[i] = car;
                return true;
            }
        }
        return false;
    }
    public boolean tryRemoveCar(String sign) {
        for (var i = 0; i < cars.length; i++) {
            if (cars[i].getSign() == sign) {
                cars[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean trySetState(String sign, AutobazaCarState state) {
        for (var i = 0; i < cars.length; i++) {
            if (cars[i].getSign() == sign) {
                if (cars[i].bazaCarState != state) {
                    cars[i].bazaCarState = state;
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    private String toStringInState(AutobazaCarState state) {
        if (state == null) return "Ошибка: неверное состояние";
        var s = "Автомобили в " + (state == AutobazaCarState.Idle ? "ожидании" : state == AutobazaCarState.Running ? "рейсе" : "ремонте");
        var found = false;
        var i = 1;
        for (var car : cars) {
            if (car == null) continue;
            if (car.bazaCarState == state) {
                s += MessageFormat.format("\n{0}. {1}: {2}", i, car.getSign(), car.getTypeName());
                found = true;
                i++;
            }
        }
        if (!found) {
            s += "\nАвтомобилей не найдено.";
        }
        return s;
    }

    public String getIdleCarsListString() {
        return toStringInState(AutobazaCarState.Idle);
    }
    public String getRunningCarsListString() {
        return toStringInState(AutobazaCarState.Running);
    }
    public String getRepairingCarsListString() {
        return toStringInState(AutobazaCarState.Repairing);
    }
}
