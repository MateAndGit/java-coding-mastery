package comments.structure_javadoc_of_interfaces_classes.problem;

import java.util.Queue;
import java.util.Stack;

import general.Supply;

/**
 * This class represents a cargo ship.
 * It can unload a {@link Stack} of supplies, load a {@link Queue} of
 * supplies, and it can show the remainingCapacity as a long.
 */
interface CargoShip {
    Stack<Supply> unload();
    Queue<Supply> load(Queue<Supply> supplies);
    int getRemainingCapacity();
}