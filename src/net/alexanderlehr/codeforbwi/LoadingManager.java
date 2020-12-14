package net.alexanderlehr.codeforbwi;

import java.util.HashMap;
import java.util.Map;

public class LoadingManager {

    public static void main(String[] args) {
        new LoadingManager();
    }


    private Truck first, second;

    private Map<Hardware, Integer> neededHardware;

    public LoadingManager() {

        neededHardware = new HashMap<>();


        neededHardware.put(new Hardware("Notebook Büro 13 Zoll", 205, 2451, 40), 205);
        neededHardware.put(new Hardware("Notebook Büro 14 Zoll", 420, 2978, 35), 420);
        neededHardware.put(new Hardware("Notebook outdoor", 450, 3625, 80), 450);
        neededHardware.put(new Hardware("Mobiltelefon Büro", 60, 717, 30), 60);
        neededHardware.put(new Hardware("Mobiltelefon Outdoor", 157, 988, 60), 157);
        neededHardware.put(new Hardware("Mobiltelefon Heavy Duty", 220, 1220, 65), 220);
        neededHardware.put(new Hardware("Tablet Büro Klein", 620, 1405, 40), 620);
        neededHardware.put(new Hardware("Tablet Büro Groß", 250, 1455, 40), 250);
        neededHardware.put(new Hardware("Tablet outdoor klein", 540, 1690, 45), 540);
        neededHardware.put(new Hardware("Tablet outdoor groß", 370, 1980, 68), 370);

        first = new Truck(72.4);
        second = new Truck(85.7);

    }

    private void getBestLoading(Truck truck) {
        for(Hardware all : this.neededHardware.keySet()) {
            if(this.neededHardware.get(all) != 0) {

            }
        }
    }

}
