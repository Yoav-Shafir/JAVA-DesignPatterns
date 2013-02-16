package creational.singleton.exe1;

// creating a single instance on class loading.
// no tests are required.
public class DatabaseThreaded {
	
	// creating the single instance already here.
	private static DatabaseThreaded singleObject = new DatabaseThreaded("products");
	private int record;
	private String name;
	
	private DatabaseThreaded(String n) {
		name = n;
		record = 0;
	}
	
	public void editRecord(String operation) {
		System.out.println("Performing a " + operation + " operation on record " 
			+ record + " in database " + name);
	}
	
	public String getName() {
		return name;
	}
	
	// no tests are required.
	public static DatabaseThreaded getInstance() {
		return singleObject;
	}
}
