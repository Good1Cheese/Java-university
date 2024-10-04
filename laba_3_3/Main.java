public class Main {
	public static void main(String[] args) {
		var h = new TemperatureHandler();

		var celsius = new CelsiusToFahrenheitAdapter();
		var fahrenheit = new FahrenheitToCelsiesAdapter();

		// CE TO FA
		double f1 = h.convert(fahrenheit, 36.5);
		System.out.println(f1 + " " + fahrenheit.getName());

		// FA TO CE
		double c1 = h.convert(celsius, 100);
		System.out.println(c1 + " " + celsius.getName());

		// For few days CE TO FA
		var a1 = new double[] { 10.4, 20.2, 34.3, 46.9 };
		double[] f2 = h.convert(fahrenheit, a1);
		for (double d : f2) {
			System.out.println(d + " " + fahrenheit.getName());
		}
	}
}
