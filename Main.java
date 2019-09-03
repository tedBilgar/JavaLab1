import ru.Urakanov.*;

public class Main {

	public static void main(String[] args){
		HelloWorld helloWorld = HelloWorld.getInstance();
		System.out.println(helloWorld.getName());
		helloWorld.setName("Second");

		HelloWorld helloWorld2 = HelloWorld.getInstance();
		System.out.println(helloWorld2.getName());
	}
}
