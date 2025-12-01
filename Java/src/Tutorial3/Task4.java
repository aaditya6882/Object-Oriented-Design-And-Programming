package Tutorial3;

public class Task4 {
	public static void main(String[] args) {
		Competitor c1 = new Shooter();
		Competitor c2 = new Runner();
		
		CompetitionManager cm = new CompetitionManager();
		cm.showDetails(c1);
		System.out.println();
		cm.showDetails(c2);
	}
}
