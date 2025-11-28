package comments.chapter3_10_structure_javadoc_of_constructors.problem;

import general.Supply;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Inventory {

    List<Supply> supplies;

    /**
     * Constructor for a new Inventory.
     */
    Inventory() {
        this(new ArrayList<>());
    }

    /**
     * Another Constructor for a new Inventory.
     *
     * It is possible to add some supplies to the Inventory.
     */
    Inventory(Collection<Supply> initialSupplies) {
        this.supplies = new ArrayList<>(initialSupplies);
    }
}
