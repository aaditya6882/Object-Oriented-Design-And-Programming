package Tutorial3;
abstract class Competitor {
	private String name;
	private String country;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public abstract double getOverallScore();
	public abstract void showDetails();
}

class Shooter extends Competitor {
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
		System.out.println("Shooting AK-47");
	}
}
public class Task3 {
	public static void main(String[] args) {
		Shooter shootert=new Shooter();
		double[] scores= {5,6,3};
		shootert.calculateOverallScore(scores);
		Competitor competitor=shootert;
		System.out.println(	competitor.getOverallScore());

	}
}
