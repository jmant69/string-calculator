package en.jmant69.main;

public class StringCalculator {

	public static int add(final String numbers) {
		int sum = 0;
		String[] numbersArray = numbers.split(",");
		for (String number : numbersArray) {
			if (!number.isEmpty()) {
				sum += Integer.parseInt(number);
			}
		}
		return sum;
	}

}