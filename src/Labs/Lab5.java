package Labs;

import Core.Interfaces.ILabTask;
import Core.LabManagement.Lab;
import Labs.Data5.Classes.*;

import static Helpers.Logger.*;

public class Lab5 extends Lab {
    @ILabTask(description = "test")
    public void t1() {
        var bag = new Bag(3);
        log(bag);
    }
}
