package com.hemebiotech.analytics;

import java.util.Collections;
import java.util.List;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {

		try {
			ReadSymptomDataFromFile symptomDataFromFile = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
			List<String>symptoms=symptomDataFromFile.GetSymptoms();
			System.out.println(symptoms);

			WriteSymptomDataFromFile writeSymptom=new WriteSymptomDataFromFile("result.txt");
			System.out.println(writeSymptom.WriteSymptoms(symptoms));


		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
