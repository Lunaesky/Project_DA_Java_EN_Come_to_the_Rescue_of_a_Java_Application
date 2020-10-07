package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

	public static void main(String args[]) {

		try {
			ReadSymptomDataFromFile symptomDataFromFile = new ReadSymptomDataFromFile("symptoms.txt");
			List<String>symptoms=symptomDataFromFile.getSymptoms();
			System.out.println(symptoms);

			CountSymptoms countSymptoms=new CountSymptoms();
			Map<String, Integer>symptomCount=countSymptoms.count(symptoms);
			System.out.println(symptomCount);

			WriteSymptomDataFromFile writeSymptom=new WriteSymptomDataFromFile("result.txt");
			writeSymptom.writeSymptoms(symptomCount);

		} catch (Exception e) {
			System.out.println("Erreur du type de variable");
			e.printStackTrace();
		}
	}
}
