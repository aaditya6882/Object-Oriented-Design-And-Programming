package Workshop3;

public class ShootingCompetition extends Competition {

	public ShootingCompetition(String competitionName2) {
		super(competitionName2);
	}

	@Override
	public void getFullDetails(Competitor competitor) {
		System.out.println("Name = " + competitor.getName());
		System.out.println("Level = " + competitor.getLevel());
		System.out.println("Country = " + competitor.getCountry());
		System.out.println("Score = " + competitor.getOverallScore());
		System.out.println("Competition Name = " + super.getCompetitionName());
		System.out.println();
	}
}
