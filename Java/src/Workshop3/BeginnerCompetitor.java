package Workshop3;

import java.security.PublicKey;

public class BeginnerCompetitor extends Competitor {

	public BeginnerCompetitor(int competitiorId, Name name,  String country, double[] scores) {
		super(competitiorId, name, "Beginner", country, scores);

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
