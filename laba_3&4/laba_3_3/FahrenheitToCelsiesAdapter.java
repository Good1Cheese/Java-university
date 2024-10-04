public class FahrenheitToCelsiesAdapter implements TemperatureAdapter {
	public double convert(double fahrenheit) {
		return 1.8 * fahrenheit + 32;
	}

	public String getName() {
		return "Fahrenheit";
	}
}
