package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class Recherche {
    public Recherche(){

        String fichier ="Project02Eclipse/symptoms.txt";
        Hashtable<String, Integer> tableMotCle = new Hashtable<String, Integer>();
        String ligne;

        try{
            //Connexion au fichier
            BufferedReader br = new BufferedReader(new FileReader(fichier));

            while ((ligne = br.readLine()) != null)
            {
                ligne = ligne.toLowerCase();
                //On découpe la ligne mot à mot
                StringTokenizer st = new StringTokenizer(ligne, " ,.;:_@+*//*\\.;\n\"\'{}()=><\t!?");
                while (st.hasMoreTokens())
                {
                    String str = st.nextToken(); //Tu sauvegardes le premier token dans une variable

                    if (tableMotCle.containsKey(str))//Tu testes et utilises la variable (donc toujours le même token)
                    {
                        tableMotCle.put(str, (tableMotCle.get(str) + 1));
                    }
                    else
                    {
                        tableMotCle.put(str, 1);
                    }
                }
            }
            br.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println(tableMotCle.size());
        System.out.println(tableMotCle.toString());
    }
}
