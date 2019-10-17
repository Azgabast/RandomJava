

public class StringMatchesRegex {

	public static void main(String[] args){
		
		String toTest = "aasdaa_W01";
				
		
		boolean matches = toTest.matches(".*_[WUwu][0-9][0-9]");
		System.out.print("String matches is: " + matches); 
		
		
		
		
		
		
	}
}
