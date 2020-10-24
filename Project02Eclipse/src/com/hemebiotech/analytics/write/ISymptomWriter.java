package com.hemebiotech.analytics.write;

import java.util.Map;

/**
 * Defines the interface for classes that will provide WriteSymptomDataFromFile
 * The important thing here, there is no return value
 * and the duplication are not possible
 * @author Landing
 *
 */
public interface ISymptomWriter {
    /**
     *
     * If no data is available, the file is still create
     * @param symptoms Even if any data is unavailable is create a result file
     *
     */
    void writeSymptoms(Map<String, Integer> symptoms);
}
