package workshop;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class TemperatureSource implements DataSource{
	private String csvFileToRead = "SMHI_Data/smhi-opendata_2_107420_corrected-archive_2016-02-01_23-00-00.csv";

    @Override
    public String getName(){
	
	return null;
    }

    @Override
    public String getUnit() {
	
	return "Celsius";
    }

    @Override
    public Map<LocalDate, Double> getData(){
    	 CsvToMapParser parser = new CsvToMapParser(csvFileToRead);
         Map<String, Object> data = parser.getResult();
         Map<LocalDate, Double> result = new TreeMap<>();
	return null;
    }

}
