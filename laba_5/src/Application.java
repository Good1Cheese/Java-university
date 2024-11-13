// Описание методов Application: 
// 	3 свойства определите самостоятельно
//     • onStart(nameApp) — стартовая точка программы,  nameApp — название приложения
//     • onClose — закрытие программы

public abstract class Application {
	private String appName;
	private float size;
	private String args;

	public String getAppName() { return appName; }
	public float getSize() { return size; }
	public String getArgs() { return args; }

	public void setAppName(String appName) { this.appName = appName; }
	public void setSize(float size) { this.size = size; }
	public void setArgs(String args) { this.args = args; }



	public Application(float size) {
		// Делаем стафф с size
	}

	public Application(float size, String args) {
		this(size); // Nested Constructor
		// Делаем стафф с args
	}



	public void onStart(String appName) {
		this.appName = appName;
		System.out.println("Application Started");
	}

	public void onClose() {
		System.out.println("Application Closed");
	}
}
