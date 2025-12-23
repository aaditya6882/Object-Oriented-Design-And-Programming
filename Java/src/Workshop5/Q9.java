package Workshop5;

class Team {
	Player[] player;

	public Team() {
		this.player = new Player[2];
		player[0] = new Player("Aaditya");
		player[1] = new Player("Aaditya");
	}

	public void showPlayers() {
		for (Player p : player) {
			p.display();
		}
	}
}

class Player {
	String name;

	Player(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("Player: " + name);
	}
}

public class Q9 {
	public static void main(String[] args) {
		Team mTeam = new Team();
		mTeam.showPlayers();
		mTeam = null;
	}
}
