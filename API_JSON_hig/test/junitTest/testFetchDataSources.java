package junitTest;

import static org.junit.Assert.*;

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
	assertEquals("Antal m�l per matchdag i fotbollsallsvenskan", goalSource.getName());
	assertEquals("Antal m�l", goalSource.getUnit());
    }
    @Test
    public void testFetchTemperatureData()
    {
	assertEquals("Celsius", temperatureSource.getUnit());
    }
    @Test
    public void testFootballGoalsEqualsData()
    {
	//assertEquals();
	
    }
    /*@Test
    public void testGetAllStadiums()
    {
	
    }*/

}