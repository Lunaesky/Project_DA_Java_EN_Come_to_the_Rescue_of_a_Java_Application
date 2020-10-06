package com.hemebiotech.analytics;

import java.util.List;

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
    List<String> count(List<String> symptoms);
}
