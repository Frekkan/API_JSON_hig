package workshop;

public enum FootballArena
{
    OLYMPIA("Olympia, Helsingborg", "Helsingborg"), 
    STROMVALLEN("Strömvallen", "Gävle"),
    NYAPARKEN("Nya Parken", "Norrköping") ;
    
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
