public class Main {

	public static void main(String[] args) {
		System.out.println("Быть или не быть?");
		System.out.println("Не спрашивайте, почему я в Activity&Fragment передаю размер.");

		var act = new Activity(800);
		act.onStart("MyApp", "MyActivity");
		System.out.println(act.getActivityName());
		System.out.println(act.getAppName());


		var frag = new Fragment(800);
		act.onCreate(frag);
		act.onResume(frag);

		System.out.println(frag.getRelatedActivity().getAppName());

		frag.onPause();

		frag.onCreateView();
		var view = frag.getRelatedView();
		frag.onDestroyView(view);



		System.err.println("Конец");
		System.err.println(" Эндинг из 'Ну, погоди!' ");
	}
}
