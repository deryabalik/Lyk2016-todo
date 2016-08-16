package Project2;

public class SimulateMatch extends Football{

	private String homeTeamName,guestTeamName;
	private int scoresOfHomeTeam=0,scoresOfGuestTeam=0;
	public Object o,o2;
	
	
	public void setAsHomeTeam(Object o){
		this.o =o;
		System.out.println("Ev sahibi : "+o);
	}
	public void setAsGuestTeam(Object o2){
		this.o2 = o2;
	System.out.println("Misafir :"+o2);
	}
	
	public void homeTeamScoresAGoal(){
		System.out.println(o + "gol attı");
		scoresOfHomeTeam++;
				
	}
	
	public void guestTeamScoresAGoal(){
		System.out.println(o2+ "gol attı");
		scoresOfGuestTeam++;
	}
	
	
	
	public void endOfisrtHalf(){
		System.out.println("İlk yarı bitti...");
	}
	public void endOfGame(){
		System.out.println("Maç bitti.");
		
	}
	public void announceWinner(){
		int x = scoresOfHomeTeam;
		int y = scoresOfGuestTeam;
		if(x > y)
			System.out.println("Kazanan "+o);
		else
		System.out.println("Kazanan" +o2);
		
		
	}
	
	@Override
	public void rollTheBall() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void anOpponentScores() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hasOpponent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void haveWinner() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hasHoliganism() {
		// TODO Auto-generated method stub
		
	}
	
	

}
