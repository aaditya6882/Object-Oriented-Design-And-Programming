package Workshop3;

public class IntermediateCompetitor extends Competitor {

	public IntermediateCompetitor(int competitiorId, Name name,  String country, double[] scores) {
		super(competitiorId, name, "Intermediate", country, scores);
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
