package Project2;

public class FootballClub extends Football{

	private String clubName,colors,stadiumName;
	private int clubValue,stadiumCapacity;
	public FootballClub(String clubName, String colors, String stadiumName,
			int clubValue, int stadiumCapacity) {
		this.clubName = clubName;
		this.colors = colors;
		this.stadiumName = stadiumName;
		this.clubValue = clubValue;
		this.stadiumCapacity = stadiumCapacity;
		
		
	}
	@Override
	public String toString() {
		return "FootballClub clubName=" + clubName + " colors=" + colors
				+ "\n stadiumName=" + stadiumName + " clubValue=" + clubValue
				+ " stadiumCapacity=" + stadiumCapacity  ;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public void setColors(String colors) {
		this.colors = colors;
	}
	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}
	public void setClubValue(int clubValue) {
		this.clubValue = clubValue;
	}
	public void setStadiumCapacity(int stadiumCapacity) {
		this.stadiumCapacity = stadiumCapacity;
	}
	public String getClubName() {
		return clubName;
	}
	public String getColors() {
		return colors;
	}
	public String getStadiumName() {
		return stadiumName;
	}
	public int getClubValue() {
		return clubValue;
	}
	public int getStadiumCapacity() {
		return stadiumCapacity;
	}
	@Override
	public void rollTheBall() {
		
		
	}
	@Override
	public void anOpponentScores() {
		
		
	}
	@Override
	public void hasOpponent() {
		
		
	}
	@Override
	public void haveWinner() {
		
		
	}
	@Override
	public void hasHoliganism() {
		// TODO Auto-generated method stub
		
	}
	
	

}
