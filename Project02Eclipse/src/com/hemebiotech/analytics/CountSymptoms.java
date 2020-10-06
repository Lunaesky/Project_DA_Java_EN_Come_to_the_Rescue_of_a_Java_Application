package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;


/***
 *
 * Simple brute force implementation
 *
 */
public class CountSymptoms implements ISymptomCount {
    private String filepath;

    /**
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public CountSymptoms(String filepath) {
        this.filepath = filepath;
    }

    /***
     *
     * @param symptoms  a List of string
     *
     * @return a List of string
     *
     */
    @Override
    public List<String> count(List<String> symptoms) {
        HashMap<String, Integer> tableMotCle = new HashMap<>();

        if (filepath != null) {
            try {
                FileWriter writer = new FileWriter("result.txt");

                try {

                    for (String symptom : symptoms) {
                        //symptom = symptom.toLowerCase();
                        if (tableMotCle.containsKey(symptom)) {
                            // Calcul les occurences
                            tableMotCle.put(symptom, (tableMotCle.get(symptom) + 1));
                        } else {
                            tableMotCle.put(symptom, 1);
                        }
                    }

                    TreeMap<String, Integer> map = new TreeMap<>(tableMotCle);
                    writer.write(map.toString());

                } finally {
                    writer.close();
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        return symptoms;
    }
}
