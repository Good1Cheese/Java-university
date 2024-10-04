// Описание методов Activity:
// 	5 свойств определите самостоятельно
//     • onStart(app, nameActivity) — входная точка приложения,  nameActivity — название активити,  app — класс приложение
//     • onCreate(fragment) : Activity — инициализирует фрагменты, экраны видны пользователю, возвращает активити, fragment — экраны, которые нужно инициализировать. Вызывается после onStart(nameActivity)
//     • onPause() - пользователь сворачивает приложение, экранов не видно
//     • onStop() - вызывается сразу после onPause(), означает остановку активити, можно вызвать onResume(nameActivity) 
//     • onResume(fragment) — вызывается после onStop(), экраны видны пользователю
//     • onDestroy() - вызывается после onStop(), билет в один конец, активити уничтожается

public class Activity extends Application {
	public void onStart(Application app, String nameActivity) {

	}

	public Activity onCreate(Fragment fragment) {
		return null;
	}

	public void onPause() {

	}

	public void onStop() {

	}

	public void onResume(Fragment fragment) {

	}

	public void onDestroy() {

	}
}
