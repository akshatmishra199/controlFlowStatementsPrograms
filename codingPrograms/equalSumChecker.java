package codingPrograms;

public class equalSumChecker {

	public static void main(String[] args) {
		hasEqualSum(1,1,1);
		hasEqualSum(1,1,2);

	}
	public static boolean hasEqualSum(int a, int b, int c) {
		int z=a+b;
		
		if(z==c) {
			System.out.println("true");
			return true;
		}
		else {
			System.out.println("false");
			return false;
		}
	}

}
