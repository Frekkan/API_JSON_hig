package junitTest;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import workshop.FootballGoalsSource;
import workshop.TemperatureSource;

public class testFetchDataSources
{
    FootballGoalsSource goalSource;
    TemperatureSource temperatureSource;

    @Before
    public void setUp() throws Exception
    {
	goalSource = new FootballGoalsSource();
	temperatureSource = new TemperatureSource();
    }

    @Test
    public void testFetchFootballGoals()
    {
	assertEquals("Antal mål per matchdag i fotbollsallsvenskan", goalSource.getName());
	assertEquals("Antal mål", goalSource.getUnit());
    }
    @Test
    public void testFetchTemperatureData()
    {
    temperatureSource.getData();
	assertEquals("Celsius", temperatureSource.getUnit());
    }
    @Test
    public void testFootballGoalsEqualsData()
    {
	goalSource.getData();	
    }
    @Test
    public void testGetAllStadiums()
    {
	//goalSource.getData();
    }

  
     

}
