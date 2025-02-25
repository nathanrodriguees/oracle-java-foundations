import java.util.ArrayList;
import java.util.List;

class Result {
	/*
	 * The function is expected to return a STRING_ARRAY. The function accepts
	 * INTEGER_ARRAY numbers as parameter.
	 */
	public static List<String> romanizer(List<Integer> numbers) {
		// Mapeamento dos valores decimais para numerais romanos
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] numerals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		List<String> result = new ArrayList<>();

		for (int num : numbers) {
			StringBuilder roman = new StringBuilder();
			for (int i = 0; i < values.length; i++) {
				while (num >= values[i]) {
					roman.append(numerals[i]);
					num -= values[i];
				}
			}
			result.add(roman.toString());
		}

		return result;
	}
}