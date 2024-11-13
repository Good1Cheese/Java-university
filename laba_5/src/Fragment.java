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

public class Fragment extends Application implements IFragment {
	private String fragmentName;
	private Activity relatedActivity;
	private View relatedView;

	private boolean isVisible;
	private boolean isMain;
	private String label;
	private String numbers;

	public String getFragmentName() { return fragmentName; }
	public Activity getRelatedActivity() { return relatedActivity; }
	public View getRelatedView() { return relatedView; }
	public boolean isVisible() { return isVisible; }
	public boolean isMain() { return isMain; }
	public String getLabel() { return label; }
	public String getNumbers() { return numbers; }

	public void setFragmentName(String fragmentName) { this.fragmentName = fragmentName; }
	public void setVisible(boolean isVisible) { this.isVisible = isVisible; }
	public void setMain(boolean isMain) { this.isMain = isMain; }
	public void setLabel(String label) { this.label = label; }
	public void setNumbers(String numbers) { this.numbers = numbers; }



	public Fragment(float size) {
		super(size);
	}

	public Fragment(float size, String args) {
		super(size, args);
	}



	public void onAttach(Activity activity) {
		relatedActivity = activity;
		System.out.println("Fragment Attached");
	}

	@Override
	public void onStart(String fragmentName) {
		this.fragmentName = fragmentName;
		System.out.println("Fragment Started");
	}

	public View onCreateView() {
		relatedView = new View();

		return relatedView;
	}

	public void onViewCreated(View view) {
		System.out.println("View Created");
	}

	public void onDestroyView(View view) {
		relatedView = null;
		System.out.println("View Destroyed");
	}

	public void onPause() {
		System.out.println("Fragment Paused");
	}

	public void onResume() {
		System.out.println("Fragment Resumed");
	}

	public void onDetach(Activity activity) {
		this.relatedActivity = null;
		System.out.println("Fragment Detached");
	}

	public void onDestroy() {
		System.out.println("Fragment Destroyed");
	}
}
