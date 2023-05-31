package hospitalappabs.exception;

public class EmailNotFoundException extends Exception {
	@Override
	public String toString() {
		
		return "patient not found with a given email id";
	}

}
