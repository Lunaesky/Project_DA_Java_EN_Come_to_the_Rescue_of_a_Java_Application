package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


/***
 *
 * Simple brute force implementation
 *
 */
public class CountSymptoms implements ISymptomCount {



    public CountSymptoms() {

    }

    /***
     *
     * @param symptoms  a List of string
     *
     * @return a List of string
     *
     */
    @Override
    public Map<String, Integer> count(List<String> symptoms) {
        HashMap<String, Integer> tableMotCle = new HashMap<>();


        for (String symptom : symptoms) {
            //symptom = symptom.toLowerCase();
            if (tableMotCle.containsKey(symptom)) {
                // Calcul les occurences
                tableMotCle.put(symptom, (tableMotCle.get(symptom) + 1));
            } else {
                tableMotCle.put(symptom, 1);
            }
        }


        return tableMotCle;
    }
}
