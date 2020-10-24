package com.hemebiotech.analytics;


import java.util.HashMap;
import java.util.List;
import java.util.Map;



/***
 *
 * Simple brute force implementation
 * @author Landing
 */
public class CountSymptoms implements ISymptomCount {



    public CountSymptoms() {

    }

    /***
     *
     * Provide the count of symptoms
     * @param symptoms  a List of string
     * @return a HashMap
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
