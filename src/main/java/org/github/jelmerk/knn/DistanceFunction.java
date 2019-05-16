package org.github.jelmerk.knn;

import java.io.Serializable;

/**
 * Calculates distance between 2 items.
 *
 * @param <TVector> The type of the vector to perform distance calculation on
 * @param <TDistance> The type of distance between items (expect any numeric type: float, double, decimal, int, ..).
 */
@FunctionalInterface
public interface DistanceFunction<TVector, TDistance extends Comparable<TDistance>> extends Serializable {

    /**
     * Gets the distance between 2 items.
     *
     * @param u from item
     * @param v to item
     * @return The distance between items.
     */
    TDistance distance(TVector u, TVector v);

}
