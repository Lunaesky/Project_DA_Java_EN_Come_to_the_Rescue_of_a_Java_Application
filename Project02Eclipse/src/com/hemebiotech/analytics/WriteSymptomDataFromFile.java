package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
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

            String newLine = System.getProperty("line.separator");
            try {

                FileWriter writer = new FileWriter("result.txt");

                //créer une arraylist avec les clés recupérées de hashtable


                for (String symptom : symptoms) {

                    symptom = symptom.toLowerCase();

                    //On découpe la symptom mot à mot


                    if (tableMotCle.containsKey(symptom))//Tu testes et utilises la variable (donc toujours le même token)
                    {
                        tableMotCle.put(symptom, (tableMotCle.get(symptom) + 1));

                    } else {
                        tableMotCle.put(symptom, 1);
                    }
                }

                //writer.write(tableMotCle.toString());


                TreeMap<String, Integer> map = new TreeMap<>(tableMotCle);
               /* Set set = map.entrySet();
                Iterator it = set.iterator();
                while(it.hasNext()) {
                    Map.Entry entry = (Map.Entry)it.next();*/
                //System.out.println(entry.getKey() + ": "+entry.getValue());


                writer.write(map.toString());
                writer.close();


            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();

            }

        }
        return null;
    }


}
