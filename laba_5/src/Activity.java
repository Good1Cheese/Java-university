// Описание методов Activity:
// 	5 свойств определите самостоятельно
//     • onStart(app, nameActivity) — входная точка приложения,  nameActivity — название активити,  app — класс приложение
//     • onCreate(fragment) : Activity — инициализирует фрагменты, экраны видны пользователю, возвращает активити, fragment — экраны, которые нужно инициализировать. Вызывается после onStart(nameActivity)
//     • onPause() - пользователь сворачивает приложение, экранов не видно
//     • onStop() - вызывается сразу после onPause(), означает остановку активити, можно вызвать onResume(nameActivity) 
//     • onResume(fragment) — вызывается после onStop(), экраны видны пользователю
//     • onDestroy() - вызывается после onStop(), билет в один конец, активити уничтожается

public class Activity extends Application {
	private String activityName;
	private int fragmentsCount;
	private boolean isStopped;
	private boolean isPaused;
	private boolean isRunning;

	public String getActivityName() { return activityName; }
	public int getFragmentsCount() { return fragmentsCount; }
	public boolean isStopped() { return isStopped; }
	public boolean isPaused() { return isPaused; }
	public boolean isRunning() { return isRunning; }

	public void setActivityName(String activityName) { this.activityName = activityName; }
	public void setFragmentsCount(int fragmentsCount) { this.fragmentsCount = fragmentsCount; }
	public void setStopped(boolean isStopped) { this.isStopped = isStopped; }
	public void setPaused(boolean isPaused) { this.isPaused = isPaused; }
	public void setRunning(boolean isRunning) { this.isRunning = isRunning; }



	public Activity(float size) {
		super(size);
	}

	public Activity(float size, String args) {
		super(size, args);
	}



	public void onStart(String appName, String activityName) {
		this.activityName = activityName;
		System.out.println("Activity Started");

		super.onStart(appName);
	}

	public Activity onCreate(IFragment fragment) {
		fragment.onAttach(this);

		return this;
	}

	public void onPause() {
		isRunning = false;
		isPaused = true;

		this.onStop();

		System.out.println("Activity Paused");
	}

	public void onStop() {
		isStopped = true;

		this.onDestroy();

		System.out.println("Activity Stopped");
	}

	public void onResume(Fragment fragment) {
		isRunning = true;
		isStopped = false;
		isPaused = false;

		System.out.println("Activity Running");
	}

	public void onDestroy() {
		System.out.println("Activity Destroyed");
	}
}
