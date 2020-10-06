package com.hemebiotech.analytics;


import java.io.FileWriter;
import java.util.*;

/**
 * Simple brute force implementation
 */

public class WriteSymptomDataFromFile implements ISymptomWriter {

    private String filepath;

    public WriteSymptomDataFromFile(String filepath) {
        this.filepath = filepath;
    }

    /**
     * @param symptoms a list of string
     * @return a list of string
     */
    @Override
    public List<String> writeSymptoms(List<String> symptoms) {
        HashMap<String, Integer> tableMotCle = new HashMap<>();

        if (filepath != null) {
            try {
                FileWriter writer = new FileWriter("result.txt");
                try {

                    TreeMap<String, Integer> map = new TreeMap<String, Integer>(tableMotCle);
                    writer.write(map.toString());

                } finally {
                    writer.close();
                }

            } catch (Exception e) {
                System.out.println("Vérifier le type de fichier de sortie");
                e.printStackTrace();
            }
        }
        return symptoms;
    }
}


