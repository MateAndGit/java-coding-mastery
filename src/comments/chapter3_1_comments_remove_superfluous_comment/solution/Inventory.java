package comments.chapter3_1_comments_remove_superfluous_comment.solution;

import general.Supply;

import java.util.ArrayList;
import java.util.List;

class Inventory {

    List<Supply> supplies = new ArrayList<>();

    int countContaminatedSupplies() {
        if (supplies == null || supplies.isEmpty()) {
            // No supplies => no contamination
            return 0;
        }

        int contaminatedCounter = 0;
        for (Supply supply : supplies) {
            if (supply.isContaminated()) {
                contaminatedCounter++;
            }
        }

        return contaminatedCounter;
    }
}
