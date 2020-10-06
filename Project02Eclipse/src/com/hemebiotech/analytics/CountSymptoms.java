package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class CountSymptoms implements ISymptomCount {
    private String filepath;

    public CountSymptoms(String filepath) throws IOException {
        this.filepath = filepath;
    }

    @Override
    public List<String> count(List<String> symptoms) {
        HashMap<String, Integer> tableMotCle = new HashMap<>();

        if (filepath != null) {

            try {
                FileWriter writer = new FileWriter("result.txt");

                for (String symptom : symptoms) {
                    //symptom = symptom.toLowerCase();
                    if (tableMotCle.containsKey(symptom))
                    {
                        // Calcul les occurences
                        tableMotCle.put(symptom, (tableMotCle.get(symptom) + 1));
                    } else {
                        tableMotCle.put(symptom, 1);
                        }
                    }

                TreeMap<String, Integer> map = new TreeMap<>(tableMotCle);
                writer.write(map.toString());
                writer.close();

            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        return symptoms;
    }
}
