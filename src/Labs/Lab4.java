package Labs;

import Core.LabManagement.Lab;
import Labs.Classes.CarFactory;
import Labs.Enums.CarType;

public class Lab4 extends Lab {
    public void t1() {
        var car1 = CarFactory.tryCreate("Fasha", CarType.TANK, "Green", 1200, 18);
        
    }
}
