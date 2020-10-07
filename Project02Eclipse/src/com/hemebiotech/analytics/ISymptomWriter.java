package com.hemebiotech.analytics;

import java.util.Map;

/**
 * @author Landing
 * Provides the classes necessary to create a file
 *
 */
public interface ISymptomWriter {
    /**
     *
     * @param symptoms Even if any data is unavailable is create a result file
     *
     * @return create the file
     */
    void writeSymptoms(Map<String, Integer> symptoms);
}
