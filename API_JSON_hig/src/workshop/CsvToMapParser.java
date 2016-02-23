package workshop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class CsvToMapParser {
	private final String csvFileToRead;
	private BufferedReader reader;

	private String line = "";
	private String lineSeparator = ";";
	private String desiredYear = "2014";

	public CsvToMapParser(String csvFileToRead) {
		this.csvFileToRead = csvFileToRead;
	}

	public Map<String, Object> getResult() {
		return translatedCsv();
	}

	// Referens
	// http://www.beingjavaguys.com/2013/09/read-and-parse-csv-file-in-java.html
	private Map<String, Object> translatedCsv() {
		try {
			reader = new BufferedReader(new FileReader(csvFileToRead));

			while ((line = reader.readLine()) != null) {
				if (lineIs(desiredYear)) {
					String[] linePart = line.split(lineSeparator);
					System.out.println("Date: " + linePart[2] + " Celcius: " + linePart[3]);
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	private boolean lineIs(String desiredYear) {
		if (line.length() > desiredYear.length()) {
			String lineYear = line.substring(0, 4);
			return lineYear.equals(desiredYear);
		}
		return false;
	}
}
