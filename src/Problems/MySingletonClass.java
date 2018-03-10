package Problems;

public class MySingletonClass {

	private static MySingletonClass myobject;

	private MySingletonClass() {

	}

	public static MySingletonClass getInstance() {
		if (myobject == null) {
			myobject = new MySingletonClass();
		}	
		return myobject;

	}

	public void testSingleton() {
		System.out.println("Hey not able to clear the concept");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySingletonClass object = getInstance();
		object.testSingleton();
	}

}
