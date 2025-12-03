package Workshop3;

public class Competition {

	private String competitionName;

	public Competition(String competitionName) {
		this.competitionName = competitionName;
	}

	public String getCompetitionName() {
		return competitionName;
	}

	public void setCompetitionName(String competitionName) {
		this.competitionName = competitionName;
	}

	public void getFullDetails(Competitor competitor) {
		System.out.println(competitor);
	}
}
