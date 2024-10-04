public class Main {
	private float temperatureCelsius;
	private float temperatureFahrenheit;

	private float[] temperatureChangesCelsius;
	private float[] temperatureChangesFahrenheit;

	public void setTemperatureCelsius(float t) {
		temperatureCelsius = t;
		temperatureFahrenheit = convertToCelsius(t);
	}

	public void setTemperatureFahrenheit(float t) {
		temperatureCelsius = convertToFahrenheit(t);
		temperatureFahrenheit = t;
	}

	public float getTemperatureCelsius() {
		return temperatureCelsius;
	}

	public float getTemperatureFahrenheit() {
		return temperatureFahrenheit;
	}

	public void setTemperatureChangeInNDaysFahrenheit(float[] changes) {
		temperatureChangesFahrenheit = changes;
		temperatureChangesCelsius = new float[changes.length];

		for (float f : changes) {
			temperatureChangesCelsius[i] = convertToCelsius(f);
		}
	}

	public void setTemperatureChangeInNDaysCelsius(float[] changes) {
		temperatureChangesCelsius = changes;
		temperatureChangesFahrenheit = new float[changes.length];

		for (float f : changes) {
			temperatureChangesFahrenheit[i] = convertToFahrenheit(f);
		}
	}

	private float convertToCelsius(float fahrenheit) {
		return 1.8 * f + 32;
	}

	private float convertToFahrenheit(float celsius) {
		return 0.6 * (celsius - 32);
	}
}
