package Workshop4;

public class Q4 {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0); 

			String name = null;
			System.out.println(name.length()); 

			int[] nums = { 1, 2, 3 };
			System.out.println(nums[5]); 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
