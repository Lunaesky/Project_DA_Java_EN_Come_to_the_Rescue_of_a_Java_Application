package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Don't need to modify this file just write in the .txt file
 *
 */
public interface ISymptomCount {

    /**
     *
     * @param symptoms If any data is available return, count that's count nothing
     *
     * @return count a number of occurrence for each symptom
     */
    Map<String, Integer> count(List<String> symptoms);
}
