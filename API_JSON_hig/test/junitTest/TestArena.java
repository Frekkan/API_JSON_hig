package junitTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import workshop.FootballArena;

public class TestArena {
	FootballArena arena;

	@Before
	public void setUp() throws Exception {
		arena = FootballArena.STROMVALLEN;
	}

	@Test
	public void testArenaAlias() {
		assertEquals(FootballArena.STROMVALLEN, arena);
		assertNotEquals(FootballArena.NYAPARKEN, arena);

	}

	@Test
	public void testgetArenaCity() {
		assertEquals("G�vle", arena.getCity());
	}

	@Test
	public void testGetArenaName() {
		assertEquals("Str�mvallen", arena.getArenaName());
	}

	@Test
	public void testGetCityTemperatureURL() {
		String gavleURL = "http://opendata-download-metobs.smhi.se/api/version/latest/parameter/2/station/107420/period/corrected-archive/data.csv";
		assertEquals(gavleURL, arena.getCityTemperatureURL());
	}
}
