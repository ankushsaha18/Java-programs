package Other;

public class test {
	public static void main(String[] args) {
		System.out.println(countPossiblePhoneNumbers(1, 9, 48));
	}
	public static int countPossiblePhoneNumbers(int K, int startDigits, int phoneSum) {
		// Count the number of combinations with sum equal to phoneSum
		String s = String.valueOf(startDigits);
		int count = 0;
		int remainingDigits = 10 - K;
		for (int i = 0; i < Math.pow(10, remainingDigits); i++) {
			String remainingDigitsStr = String.format("%0" + remainingDigits + "d", i);
			if (getDigitSum(s, remainingDigitsStr) == phoneSum) {
				count++;
			}
		}

		return count;
	}

	public static int getDigitSum(String s, String remainingDigits) {
		int sum = 0;
		for (char digit : s.toCharArray()) {
			sum += Character.getNumericValue(digit);
		}
		for (char digit : remainingDigits.toCharArray()) {
			sum += Character.getNumericValue(digit);
		}
		return sum;
	}
}