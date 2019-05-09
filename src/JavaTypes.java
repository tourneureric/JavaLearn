
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaTypes {
	
	public JavaTypes () {
		System.out.println("JavaTypes::JavaTypes()");
	}

	public void main() {
		System.out.println("JavaTypes::main()");

		List<String> myArrayListOfString1 = new ArrayList<String>();
		myArrayListOfString1.add("réponse 1");
		myArrayListOfString1.add("réponse 2");
		myArrayListOfString1.add("réponse 3");
		myArrayListOfString1.add("réponse 4");
		System.out.println("myArrayListOfString1.size = " + myArrayListOfString1.size());
		System.out.println("myArrayListOfString1 = " + myArrayListOfString1);
		
		List<String> myArrayListOfString2 = new ArrayList<String>(Arrays.asList("réponse 1", "réponse 2", "réponse 3", "réponse 4"));
		System.out.println("myArrayListOfString2 = " + myArrayListOfString2);
		int i = 0;
		for (String str : myArrayListOfString2) {
			System.out.println(++i + " : " + str);
		}
		System.out.println("myArrayListOfString2.size = " + myArrayListOfString2.size());

	}

}
