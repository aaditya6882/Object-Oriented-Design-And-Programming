package Workshop4;

public class Q12 {

public static int checkNum(int num) {
	try {
		return 20/num;
	}  catch (Exception e) {
		System.out.println(e.getMessage());
		return 0;
	} finally {
		System.out.println("Finally");
		return -1;
	}
}
public static void main(String[] args) {
	System.out.println(checkNum(0));
}
}
