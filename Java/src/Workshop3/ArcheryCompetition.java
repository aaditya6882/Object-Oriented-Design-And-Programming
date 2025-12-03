package Workshop3;

public class ArcheryCompetition extends Competition{
	public ArcheryCompetition(String competitionName) {
		super(competitionName);
	}
	
	@Override
	public void getFullDetails(Competitor competitor) {
		System.out.println("Name = " + competitor.getName());
		System.out.println("Level = " + competitor.getLevel());
		System.out.println("Country = " + competitor.getCountry());
		System.out.println("Score = " + competitor.getOverallScore());
		System.out.println("Competition Name = " + super.getCompetitionName());
		System.out.println("");
	}

}
