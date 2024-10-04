public class CelsiusToFahrenheitAdapter extends TemperatureAdapter {
	public float convert(float celsius) {
		return 0.6f * (celsius - 32);
	}
}
