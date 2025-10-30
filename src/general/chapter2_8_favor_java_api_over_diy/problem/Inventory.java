package general.chapter2_8_favor_java_api_over_diy.problem;

import general.Supply;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Supply> supplies = new ArrayList<>();

    int getQuantity(Supply supply) {
        if (supply == null) {
            throw  new NullPointerException("supply must not ne null");
        }

        int quantity = 0;
        for (Supply supplyInStock : supplies) {
            if (supply.equals(supplyInStock)) {
                quantity++;
            }
        }
        return quantity;
    }
}
