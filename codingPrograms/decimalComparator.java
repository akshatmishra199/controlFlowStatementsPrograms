package codingPrograms;

public class decimalComparator {

	public static void main(String[] args) {
		areEqualByThreeDecimalPlaces(-3.15676,-3.15663);
		areEqualByThreeDecimalPlaces(5.414435,5.412141);

	}
	public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
		int one = (int) (a * 1000);
		int two = (int) (b * 1000);
		
		if(one==two) {
			System.out.println("true");
			return true;
		}
		else {
			System.out.println("false");
			return false;
		}
	}

}
