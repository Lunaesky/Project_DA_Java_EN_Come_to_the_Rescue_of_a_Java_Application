package com.hemebiotech.analytics.count;

import java.util.List;
import java.util.Map;

/**
 * Defines the interface for classes that will provide CountSymptoms
 *
 *
 */
public interface ISymptomCount {

    /**
     * The interface contains the method to count symptoms
     * @param symptoms If any data is available return, count that's count nothing
     * @return count a number of occurrence for each symptom
     *
     */
    Map<String, Integer> count(List<String> symptoms);
}
