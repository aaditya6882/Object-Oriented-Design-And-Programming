package Workshop3;

public class Main {
	public static void main(String[] args) {
		double[] score1 = { 7, 8, 4 };
		double[] score2 = { 6, 5, 8 };
		double[] score3 = { 5, 7, 6 };
		Competitor c1 = new BeginnerCompetitor(1, new Name("Ram", "Sharma"), "India" , score1);
		Competitor c2 = new IntermediateCompetitor(2, new Name("Aditya", "Acharya"), "China",  score2);
		Competitor c3 = new AdvancedCompetitor(3, new Name("Shyam", "Giri"), "Pakistan",  score3);

		Competitor[] competitors = { c1, c2, c3 };

//		for (Competitor competitor : competitors) {
//			System.out.println(competitor.getName() + " has scored " + competitor.getOverallScore());
//		}
		Competition archery = new ArcheryCompetition("National Archery Competition");
		Competition esports = new EsportsCompetition("Global Esports Competiton", "Sentinal");
		Competition shooting = new ShootingCompetition("District Level Shooting Competition");
		archery.getFullDetails(c1);
		esports.getFullDetails(c2);
		shooting.getFullDetails(c3);
		Competition[] competition= {archery, esports, shooting};
		for(Competition competitions: competition) {
		if(competitions instanceof ArcheryCompetition) {
			ArcheryCompetition archeryCompetition=(ArcheryCompetition) competitions;
		}else if(competitions instanceof EsportsCompetition){
			EsportsCompetition EsportsCompetition=(EsportsCompetition) competitions;
		}else if (competitions instanceof ShootingCompetition) {
			ShootingCompetition shootingCompetition=(ShootingCompetition) competitions;
		}
		}
		try {
			EsportsCompetition esportsCompetition=(EsportsCompetition) archery;
		} catch (ClassCastException e) {
			System.out.println("Invalid Downcasting");
		}
	}
}
