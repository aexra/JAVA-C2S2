package Labs;

import Core.Interfaces.ILabTask;
import Core.LabManagement.Lab;
import Labs.Classes.OldCar;
import Labs.Classes.CarFactory;
import Labs.Classes.Engine;
import Labs.Enums.CarType;

import static Helpers.Logger.*;

public class Lab4 extends Lab {

    @ILabTask(description = "Реализация и использование класса машины")
    public void t1() {
        var car = CarFactory.tryCreate("Fasha", CarType.TANK, "Зеленый", new Engine("89167345267345895781463195834670", 1800, 9570, 50000, 40), 18);
        car.trySetSign("A123BC161RUS");
        log(car, "");
    }
}
