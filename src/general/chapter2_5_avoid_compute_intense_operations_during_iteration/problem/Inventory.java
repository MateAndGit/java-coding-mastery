package general.chapter2_5_avoid_compute_intense_operations_during_iteration.problem;

import general.Supply;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class Inventory {

    private List<Supply> supplies = new ArrayList<>();

    List<Supply> find(String regex) {
        List<Supply> result = new LinkedList<>();
        for (Supply supply : supplies) {
            if (Pattern.matches(regex, supply.toString())) {
                result.add(supply);
            }
        }
        return result;
    }
}
