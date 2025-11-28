package comments.chapter3_9_structure_javadoc_of_methods.problem;

import java.util.Queue;
import java.util.Stack;

import general.Supply;

interface CargoShip {

    Stack<Supply> unload();

    /**
     * Loads {@link Supply}.
     *
     * @param supplies the supplies of type {@link Queue}
     * @return not loaded supplies of type {@link Queue}
     */
    Queue<Supply> load(Queue<Supply> supplies);

    int getRemainingCapacity();
}