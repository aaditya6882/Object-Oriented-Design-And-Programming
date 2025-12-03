package Workshop3;

public class EsportsCompetition extends Competition {
	private String teamName;
	public EsportsCompetition(String competitionName, String teamName) {
		super(competitionName);
		this.teamName = teamName;
	}
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	@Override
	public void getFullDetails(Competitor competitor) {
		System.out.println("Name = " + competitor.getName());
		System.out.println("Level = " + competitor.getLevel());
		System.out.println("Country = " + competitor.getCountry());
		System.out.println("Score = " + competitor.getOverallScore());
		System.out.println("Competition Name = " + super.getCompetitionName());
		System.out.println("Team = " + teamName);
	}

}
