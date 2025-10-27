package general.chapter2_4_avoid_collection_modification_during_iteration.solution;

import general.Supply;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {

    private List<Supply> supplies = new ArrayList<>();
    void disposeContaminatedSupplies() {
        Iterator<Supply> iterator = supplies.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().isContaminated()) {
                iterator.remove();
            }
        }
    }
}
