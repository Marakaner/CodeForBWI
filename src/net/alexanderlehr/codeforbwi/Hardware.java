package net.alexanderlehr.codeforbwi;

public class Hardware {

    private String name;
    private double weight;
    private int usageValue;

    public Hardware(String name, int units, int allWeight, int usageValue) {
        this.name = name;
        this.weight = allWeight / units;
        this.usageValue = usageValue;
    }

    public String getName() {
        return name;
    }

    public int getUsageValue() {
        return usageValue;
    }

    public double getWeight() {
        return weight;
    }
}
