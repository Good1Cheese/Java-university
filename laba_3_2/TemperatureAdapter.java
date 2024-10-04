public abstract class TemperatureAdapter {
	private float value;
	private float[] changesInNDays;

	public void setValue(float v) {
		value = v;
	}

	public float getValue() {
		return value;
	}

	public float[] getChangesInNDays() {
		return changesInNDays;
	}

	public void setChangesInNDays(float[] value) {
		this.changesInNDays = value;
	}

	public void setChangesInNDaysConverted(float[] value) {
		changesInNDays = new float[value.length];

		for (int i = 0; i < value.length; i++) {
			changesInNDays[i] = convert(value[i]);
		}
	}

	public void setValueConverted(float t) {
		this.value = this.convert(t);
	}

	public abstract float convert(float c);
}
