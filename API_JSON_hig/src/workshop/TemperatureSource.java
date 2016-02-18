package workshop;

import java.time.LocalDate;
import java.util.Map;

public class TemperatureSource implements DataSource
{

    @Override
    public String getName()
    {
	
	return null;
    }

    @Override
    public String getUnit()
    {
	
	return "Celsius";
    }

    @Override
    public Map<LocalDate, Double> getData()
    {
	
	return null;
    }

}
