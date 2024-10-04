public class Main {
	public static void main(String[] args) {
		ExampleTemperatureAdapter e = new ExampleTemperatureAdapter();

		e.setTemperatureCelsius(34.5f);
		var v1 = e.getTemperatureCelsius();
		var v2 = e.getTemperatureFahrenheit();
		System.out.println(v1);
		System.out.println(v2);

		e.setTemperatureFahrenheit(100);
		var v12 = e.getTemperatureCelsius();
		var v22 = e.getTemperatureFahrenheit();
		System.out.println(v12);
		System.out.println(v22);

		var a1 = new float[] { 10.5f, 20.2f, 34.3f, 46.9f };
		e.setTemperatureChangesInNDaysCelsius(a1);
		e.getTemperatureChangesInNDays();
	}
}
