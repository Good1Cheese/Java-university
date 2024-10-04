import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class NumbersSequence7 {
	public static void main(String[] args) {
		try (var sc = new Scanner(System.in)) {
			handleGood(sc);
		} catch (Exception e) {
			handleBad();
		}
	}

	public static void handleGood(Scanner sc) {
		out.println("Enter starting number:");
		int n1 = sc.nextInt();

		out.println("Enter ending number:");
		int n2 = sc.nextInt();

		var output = numbersSequence(n1, n2);
		out.println("Result is: " + output);
	}

	public static void handleBad() {
		out.println("Error, input is invalid!");
	}

	public static ArrayList<Integer> numbersSequence(int start, int end) {
		var r = new ArrayList<Integer>();

		for (int i = start; i < end; i++) {
			if (i % 5 != 0) {
				continue;
			}
			r.add(i);
		}

		return r;
	}
}
