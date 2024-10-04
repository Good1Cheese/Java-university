public class FahrenheitToCelsiusAdapter extends TemperatureAdapter {
	public float convert(float fahrenheit) {
		return 1.8f * fahrenheit + 32;
	}
}
