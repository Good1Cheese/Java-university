import java.util.Scanner;
import static java.lang.System.*;

public class NumbersSum1 {
	public static void main(String[] args) {
		out.println("Enter number N: ");

		try (var sc = new Scanner(System.in)) {
			handleGood(sc);
		} catch (Exception e) {
			handleBad();
		}
	}

	public static void handleGood(Scanner sc) {
		int input = sc.nextInt();
		int output = func(input);

		out.println("Result is: " + output);
	}

	public static void handleBad() {
		out.println("Error, input is invalid!");
	}

	public static int func(int input) {
		int r = 0;

		for (int i = 1; i < input; i++) {
			r += i;
		}

		return r;
	}
}
