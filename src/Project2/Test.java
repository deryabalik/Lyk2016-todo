package Project2;

public class Test {

	
	public static void main(String[] args) {
		

		FootballClub club1 = new FootballClub("Beşiktaş","Siyah-Beyaz","Vodafone Arena",5, 41903);
		FootballClub club2 = new FootballClub("FenerBahçe","Sarı-Mavi","Vodafone Arena",5, 41903);
		
		SimulateMatch match = new SimulateMatch();
	
	
		match.setAsHomeTeam(club1.getClubName());
		match.setAsGuestTeam(club2.getClubName());
		match.rollTheBall();
		match.homeTeamScoresAGoal();
        match.homeTeamScoresAGoal();
        match.endOfisrtHalf();
        match.guestTeamScoresAGoal();
        match.guestTeamScoresAGoal();
        match.guestTeamScoresAGoal();
        match.announceWinner();
        
		
		
	
	
		
		
		

	}

}
