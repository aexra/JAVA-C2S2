package Labs;

import Core.Interfaces.ILabTask;
import Core.LabManagement.Lab;
import Labs.Classes.Car;
import Labs.Classes.CarFactory;
import Labs.Enums.CarType;

import static Helpers.Logger.*;

public class Lab4 extends Lab {

    @ILabTask(description = "Реализация и использование класса машины")
    public void t1() {
        var car = CarFactory.tryCreate("Fasha", CarType.TANK, "Green", 1200, 18);
        car.trySetSign("A123BC161RUS");
        dropcarInfo(car);
    }

    @ILabTask(description = "")
    public void t2() {
        log("Классы написал, см. код");
    }

    @ILabTask(description = "")
    public void t3() {
        log("Классы написал, см. код");
    }


    private void dropcarInfo(Car car)
    {
        log(car.getSign());
        log(car.getMark());
        log(car.getType());
        log(car.color);
        log(car.power);
        log(car.getWheelsCount());
    }
}
