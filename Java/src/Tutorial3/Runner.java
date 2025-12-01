package Tutorial3;

public class Runner extends Competitor {
	private double overallScore;

	public void setOverallScore(double overallScore) {
		this.overallScore = overallScore;
	}

	@Override
	public double getOverallScore() {
		return overallScore;
	}

	public void calculateOverallScore(double[] scores) {
		for (double score : scores) {
			this.overallScore += score;
		}
	}
	
	@Override
	public void showDetails() {
		System.out.println("Name = "+ super.getName());
		System.out.println("Country = " + super.getCountry());
		System.out.println("Running Marathon");
	}

}

