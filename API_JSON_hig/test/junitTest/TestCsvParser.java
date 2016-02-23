package junitTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import workshop.CsvToMapParser;

public class TestCsvParser {

	@Before
	public void setUp() throws Exception {
		CsvToMapParser parser = new CsvToMapParser(null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
