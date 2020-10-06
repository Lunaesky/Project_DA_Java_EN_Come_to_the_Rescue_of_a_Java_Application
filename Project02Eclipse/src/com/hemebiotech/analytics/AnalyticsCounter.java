package com.hemebiotech.analytics;


import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.List;

public class AnalyticsCounter {


	public static void main(String args[]) {

		try {
			ReadSymptomDataFromFile symptomDataFromFile = new ReadSymptomDataFromFile("symptoms.txt");
			List<String>symptoms=symptomDataFromFile.getSymptoms();
			System.out.println(symptoms);

			WriteSymptomDataFromFile writeSymptom=new WriteSymptomDataFromFile("result.txt");
			System.out.println(writeSymptom.writeSymptoms(symptoms));

			CountSymptoms countSymptoms=new CountSymptoms("result.txt");
			System.out.println(countSymptoms.count(symptoms));


		} catch (Exception e) {
			System.out.println("Exécution du programme en échec");
			e.printStackTrace();
		}

	}

}
