package com.hemebiotech.analytics;


import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class WriteSymptomDataFromFile implements ISymptomWriter {

    public String filepath;

    public WriteSymptomDataFromFile(String filepath) throws IOException {
        this.filepath = filepath;
    }


    @Override
    public List<String> writeSymptoms(List<String> symptoms) {
       HashMap<String, Integer> tableMotCle = new HashMap<>();

        if (filepath != null) {

            try {
                FileWriter writer = new FileWriter("result.txt");

                TreeMap<String, Integer> map = new TreeMap<String, Integer>(tableMotCle);
                writer.write(map.toString());
                writer.close();

            } catch (Exception e) {
                System.out.println(e.getMessage());
               e.printStackTrace();
            }
        } return symptoms;

    }
}


