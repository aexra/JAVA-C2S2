package Labs;

import Core.Interfaces.ILabTask;
import Core.LabManagement.Lab;
import Labs.Classes.Autobaza;
import Labs.Classes.CarFactory;
import Labs.Classes.Cargo;
import Labs.Classes.Engine;
import Labs.Classes.LightCar;
import Labs.Enums.CarType;

import static Helpers.Logger.*;

public class Lab4 extends Lab {

    @ILabTask(description = "Реализация и использование класса машины")
    public void t1() {
        var car = CarFactory.tryCreateOld("Fasha", CarType.TANK, "Зеленый", new Engine("89167345267345895781463195834670", 1800, 9570, 50000, 40), 18);
        car.trySetSign("A123BC161RUS");
        log(car, "");
    }

    @ILabTask(description = "Типы машин как дочерние классы")
    public void t6() {
        var light = new LightCar("Johnson", "Red", null, 1);
        var cargo = new Cargo("Chipi Chipi", "Lazure Sky", null, 56);
        log(light, "");
    }

    @ILabTask(description = "Автобаза")
    public void t7() throws Exception {
        var light = new LightCar("Johnson", "Red", null, 1); light.trySetSign("H224AO61RUS");
        var cargo = new Cargo("Chipi Chipi", "Lazure Sky", null, 56); cargo.trySetSign("X666XX000RUS");
        
        var baza = new Autobaza(4);
        baza.tryAddCar(light);
        baza.tryAddCar(cargo);

        log(baza.getIdleCarsListString(), "");
    }
}
