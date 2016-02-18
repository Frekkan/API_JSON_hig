package junitTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import workshop.FootballArena;

public class TestArena
{
    FootballArena arena;
    @Before
    public void setUp() throws Exception
    {
	arena = FootballArena.STROMVALLEN;	
    }

    @Test
    public void test()
    {
	assertEquals(FootballArena.STROMVALLEN, arena);
	assertEquals("G�vle", arena.getCity());
	assertEquals("Str�mvallen", arena.getArenaName());
    }

}
