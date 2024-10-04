public class CelsiusToFahrenheitAdapter implements TemperatureAdapter {
	public double convert(double celsius) {
		return 0.6 * (celsius - 32);
	}

	public String getName() {
		return "Celsius";
	}
}
