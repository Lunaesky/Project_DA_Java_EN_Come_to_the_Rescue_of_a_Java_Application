package com.hemebiotech.analytics;


import java.io.FileWriter;
import java.util.*;

/**
 * @author Landing
 * @version 1.0
 * Simple brute force implementation
 */

public class WriteSymptomDataFromFile implements ISymptomWriter {

    private String filepath;

    public WriteSymptomDataFromFile(String filepath) {
        this.filepath = filepath;
    }

    /**
     * A class that provide the writing of symptoms
     * @param symptoms a Map
     *
     */
    @Override
    public void writeSymptoms(Map<String, Integer> symptoms) {

        if (filepath != null) {
            try {
                FileWriter writer = new FileWriter("result.txt");
                try {

                    TreeMap<String, Integer> map = new TreeMap<String, Integer>(symptoms);
                    writer.write(map.toString());

                } finally {
                    writer.close();
                }

            } catch (Exception e) {
                System.out.println("Vérifier le type de fichier de sortie");
                e.printStackTrace();
            }
        }

    }
}


