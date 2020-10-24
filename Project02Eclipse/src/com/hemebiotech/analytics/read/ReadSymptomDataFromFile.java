package com.hemebiotech.analytics.read;

import com.hemebiotech.analytics.read.ISymptomReader;

import java.io.*;
import java.util.*;


/**
 * @author Landing
 * Simple brute force implementation
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

    private String filepath;

    /**
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public ReadSymptomDataFromFile(String filepath) {
        this.filepath = filepath;
    }

    /***
     *
     *Provides the reading of symptoms
     * @return result an arrayList
     *
     */

    @Override
    public List<String> getSymptoms() {
        ArrayList<String> result = new ArrayList<String>();

        if (filepath != null) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(filepath));
                try {

                    String line = reader.readLine();

                    while (line != null) {
                        result.add("\n" + line);
                        line = reader.readLine();
                    }
                } finally {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Le fichier symptoms.txt doit comporté au moins 1 symptôme");
                e.printStackTrace();
            }
        }
        return result;
    }
}
