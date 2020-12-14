package net.alexanderlehr.CodeForBWI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Truck {

    private double driverWeight;
    private List<Hardware> hardwares;
    private double load;

    public Truck(double driverWeight) {
        this.driverWeight = driverWeight;
        this.load = 1100 - driverWeight;
        this.hardwares = new ArrayList<>();
    }

}
