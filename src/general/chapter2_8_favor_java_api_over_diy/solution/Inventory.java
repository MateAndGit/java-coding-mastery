package general.chapter2_8_favor_java_api_over_diy.solution;

import general.Supply;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Inventory {

    private List<Supply> supplies = new ArrayList<>();

    int getQuantity(Supply supply) {
        Objects.requireNonNull(supply, "supply must not be null");
        return Collections.frequency(supplies, supply);
    }
}
