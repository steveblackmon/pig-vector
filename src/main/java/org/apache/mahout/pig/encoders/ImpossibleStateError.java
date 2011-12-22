package org.apache.mahout.pig.encoders;

/**
 * Indicates an "impossible" condition has been detected that prevents further progress.
 */
public class ImpossibleStateError extends RuntimeException {
    public ImpossibleStateError(String msg) {
        super(msg);
    }
}