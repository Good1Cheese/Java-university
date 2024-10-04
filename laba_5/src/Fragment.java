// Описание методов Fragment: 
// 	7 свойств определите самостоятельно
//     • onAttach(activity) — происходит прикрепление к активити
//     • onStart(nameFragment) — тоже что и в активити, но происходит запуск экрана
//     • onCreateView(): View -  инициализирует представление, то что видно пользователю, view (класс на ваше усмотрение)
//     • onViewCreated(view) — здесь мы можем работать с вью, оно уже создано
//     • onDestroyView(view) — уничтожает вью
//     • onPause() - экран не виден пользователю, но он еще не уничтожен
//     • onResume() - вызывается после onPause(), виден пользователю
//     • onDetach(activity) — происходит открепление от активити
//     • onDestroy() - уничтожение экрана, всем пока

public class Fragment {
	public void onAttach(Activity activity) {

	}

	public void onStart(String nameFragment) {

	}

	public View onCreateView() {
		return null;
	}

	public void onViewCreated(View view) {

	}

	public void onDestroyView(View view) {

	}

	public void onPause() {

	}

	public void onResume() {

	}

	public void onDetach(Activity activity) {

	}

	public void onDestroy() {

	}
}
