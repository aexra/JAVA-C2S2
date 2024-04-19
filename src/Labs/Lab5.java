package Labs;

import Core.Interfaces.ILabTask;
import Core.LabManagement.Lab;
import Labs.Data5.Classes.*;

import static Helpers.Logger.*;

public class Lab5 extends Lab {
    @ILabTask(description = "bag test")
    public void t1() {
        var bag = new Bag(10);
        bag.push(1);
        bag.push(2);
        bag.push(3);
        bag.push(4);
        log(bag);
        log(bag.pop());
        log(bag);
    }

    @ILabTask(description = "test")
    public void t2() {

    }
}
