

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;


    public DrivableMap() {
        drivable_map = new HashMap<>();
    }


    public boolean addDrivable(String id, Drivable item) {
        if (!this.drivable_map.containsKey(id)) {
            this.drivable_map.put(id, item);
            return true;
        } else {
            return false;
        }
    }




    public boolean hasFasterThan(int speed) {
        for (Drivable item : this.drivable_map.values()) {
            if (item.getMaxSpeed() >= speed) {
                return true;
            }
        }
        return false;
    }





    public List<Tradable> getTradable() {
        ArrayList<Tradable> list = new ArrayList<>();
        for (Drivable item : this.drivable_map.values()) {
            if (item instanceof Tradable) {
                list.add((Tradable) item);
            }
        }
        return list;
    }




}