public class TemperatureHandler {
	public double convert(TemperatureAdapter a, double t) {
		return a.convert(t);
	}

	public double[] convert(TemperatureAdapter target, double... temps) {
		double[] result = new double[temps.length];

		for (int i = 0; i < temps.length; i++) {
			result[i] = target.convert(temps[i]);
		}

		return result;
	}
}
