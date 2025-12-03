package Workshop3;

import java.util.Arrays;

public class Competitor {
	private int competitiorId;
	private Name name;
	private String level;
	private String country;
	private double[] score;

	public Competitor(int competitiorId, Name name, String level, String country, double[] score) {
		setCompetitiorId(competitiorId);
		setName(name);
		setLevel(level);
		setCountry(country);
		setScore(score);
	}

	public int getCompetitiorId() {
		return competitiorId;
	}

	public void setCompetitiorId(int competitiorId) {
		if (competitiorId > 0) {
			this.competitiorId = competitiorId;
		} else {
			System.out.println("Competitior id must be zero");
		}
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		if (level.equals("Beginner") || level.equals("Intermediate") || level.equals("Advanced")) {
			this.level = level;
		} else {
			System.out.println("Invalid");
		}
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	public double getOverallScore() {
		return 0;
	}
	public double[] getScore() {
		return score;
	}
	public void setScore( double[] score) {
		this.score=score;
	}

	@Override
	public String toString() {
		return "Competitor [competitiorId=" + competitiorId + ", name=" + name + ", level=" + level + ", country="
				+ country + ", score=" + Arrays.toString(score) + "]";
	}

}
