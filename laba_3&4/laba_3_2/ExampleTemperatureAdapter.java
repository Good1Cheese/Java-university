public class ExampleTemperatureAdapter {
	private TemperatureAdapter celsiusToFahrenheit;
	private TemperatureAdapter fahrenheitToCelsius;

	public ExampleTemperatureAdapter() {
		celsiusToFahrenheit = new CelsiusToFahrenheitAdapter();
		fahrenheitToCelsius = new FahrenheitToCelsiusAdapter();
	}

	public float getTemperatureCelsius() {
		return celsiusToFahrenheit.getValue();
	}

	public float getTemperatureFahrenheit() {
		return fahrenheitToCelsius.getValue();
	}

	public void setTemperatureCelsius(float t) {
		celsiusToFahrenheit.setValue(t);
		fahrenheitToCelsius.setValueConverted(t);
	}

	public void setTemperatureFahrenheit(float t) {
		celsiusToFahrenheit.setValueConverted(t);
		fahrenheitToCelsius.setValue(t);
	}

	public void setTemperatureChangesInNDaysFahrenheit(float[] changes) {
		celsiusToFahrenheit.setChangesInNDaysConverted(changes);
		fahrenheitToCelsius.setChangesInNDays(changes);
	}

	public void setTemperatureChangesInNDaysCelsius(float[] changes) {
		celsiusToFahrenheit.setChangesInNDays(changes);
		fahrenheitToCelsius.setChangesInNDaysConverted(changes);
	}

	public void getTemperatureChangesInNDays() {
		float[] celsius = celsiusToFahrenheit.getChangesInNDays();
		float[] fahrenheit = fahrenheitToCelsius.getChangesInNDays();
		int len = celsius.length;

		System.out.println("Temp changes in " + len + "Days");

		for (int i = 0; i < len; i++) {
			var day = i + 1;
			System.out.println("Day - " + day);
			System.out.println("Temp in Celsius - " + celsius[i]);
			System.out.println("Temp in Fahrenheit - " + fahrenheit[i]);
		}
	}
}
