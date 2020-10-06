package com.hemebiotech.analytics;

import java.util.List;

/**
 *
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
    List<String> writeSymptoms(List<String> symptoms);
}
