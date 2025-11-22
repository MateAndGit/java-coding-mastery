package comments.structure_javadoc_of_interfaces_classes.solution;

import general.Supply;

import java.util.Queue;
import java.util.Stack;

import java.util.Queue;
import java.util.Stack;

import general.Supply;

/**
 * A cargo ship can load and unload supplies according to its capacity.
 *
 * <p>
 * Supplies are loaded sequentially and can be unloaded in LIFO
 * (last-in-first-out) order. The cargo ship can only store supplies up to
 * its capacity. Its capacity is never negative.
 */
interface CargoShip {
    Stack<Supply> unload();
    Queue<Supply> load(Queue<Supply> supplies);
    int getRemainingCapacity();
}