public class Clone {
	public static void main(String args[]) throws Exception {
		// Get a singleton
		SingletonObject obj = SingletonObject.getSingletonObject();

		// Buahahaha. Let's clone the object
		SingletonObject clone = (SingletonObject) obj.clone();
	}
}