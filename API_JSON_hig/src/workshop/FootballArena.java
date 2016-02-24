package workshop;

public enum FootballArena {
	OLYMPIA("Olympia, Helsingborg", "Helsingborg", null, null), 
	STROMVALLEN("Strömvallen", "Gävle",
			"http://opendata-download-metobs.smhi.se/api/version/latest/parameter/2/station/107420/period/corrected-archive/data.csv", 
			"SMHI_Data/smhi-opendata_2_107420_corrected-archive_2016-02-01_23-00-00.csv"),
	NYAPARKEN("Nya Parken", "Norrköping", null, null);

	private final String arenaName;
	private final String city;
	private final String cityTemperatureURL;
	private final String cityTemperatureLocalPath;


	FootballArena(String arenaName, String city, String cityTemperatureURL, String cityTemperatureLocalPath) {
		this.arenaName = arenaName;
		this.city = city;
		this.cityTemperatureURL = cityTemperatureURL;
		this.cityTemperatureLocalPath = cityTemperatureLocalPath;
	}

	public String getArenaName() {
		return arenaName;
	}

	public String getCity() {
		return city;
	}

	public String getCityTemperatureURL() {
		return cityTemperatureURL;
	}

	public String getCityTemperatureLocalPath() {
		return cityTemperatureLocalPath;
	}
}
