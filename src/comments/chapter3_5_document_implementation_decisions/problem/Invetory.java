package comments.chapter3_5_document_implementation_decisions.problem;

import comments.chapter3_5_document_implementation_decisions.Supply;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Inventory {

    private List<Supply> list = new ArrayList<>();

    void add(Supply supply) {
        list.add(supply);
        Collections.sort(list);
    }

    boolean isInStock(String name) {
        // fast implementation
        return Collections.binarySearch(list, new Supply(name)) != -1;
    }
}
