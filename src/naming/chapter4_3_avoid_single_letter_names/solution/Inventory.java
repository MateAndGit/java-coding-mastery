package naming.chapter4_3_avoid_single_letter_names.solution;

import java.util.ArrayList;
import java.util.List;

class Inventory {
    List<Supply> sortedList = new ArrayList<>();

    boolean isInStock(String name) {
        Supply supply = new Supply(name);
        int low = 0;
        int high = sortedList.size() - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            int comparison = sortedList.get(middle).compareTo(supply);

            if (comparison < 0) {
                low = middle + 1;
            } else if (comparison > 0) {
                high = middle - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}

class Supply {
    Supply(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    String name;

    int compareTo(Supply supply) {

        return 0;
    }
}