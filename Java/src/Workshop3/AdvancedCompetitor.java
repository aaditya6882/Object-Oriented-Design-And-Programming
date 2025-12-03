package Workshop3;

public class AdvancedCompetitor extends Competitor {

	public AdvancedCompetitor(int competitiorId, Name name,  String country, double[] scores) {
		super(competitiorId, name, "Advanced", country, scores);
	}

	@Override
	public double getOverallScore() {
		double myScore = 0;
		for (double score : getScore()) {
			myScore += score;
		}
		return myScore / super.getScore().length * 0.5;
	}

}
