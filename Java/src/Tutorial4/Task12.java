package Tutorial4;


class InvalidScore extends RuntimeException{
public InvalidScore(String msg) {
	super(msg);
}	
}
public class Task12 {
public static void checkScore(int score) throws InvalidScore{
	if(score>50 || score<0) {
		throw new InvalidScore("score must be positive and less than 50");
	}
	System.out.println(score);
}
public static void main(String[] args) {
	try {
		checkScore(200);
	} catch (InvalidScore e) {
		System.out.println(e.getMessage());
	}
}
}
