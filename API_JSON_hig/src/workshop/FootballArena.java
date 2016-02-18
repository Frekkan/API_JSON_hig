package workshop;

public enum FootballArena
{
    OLYMPIA("Olympia, Helsingborg", "Helsingborg"), 
    STROMVALLEN("Str�mvallen", "G�vle"),
    NYAPARKEN("Nya Parken", "Norrk�ping") ;
    
    private final String arenaName;
    private final String city;

    FootballArena(String arenaName, String city)
    {
	this.arenaName = arenaName;
	this.city = city;
    }
    public String getArenaName(){
	return arenaName;
    }
    public String getCity(){
	return city;
    }
}
