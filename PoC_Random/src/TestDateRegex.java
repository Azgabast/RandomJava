
public class TestDateRegex {
	
	
	public static void main(String[] args){
		String regex = "[0-9]{2,4}[\\/\\-\\._][0-9]{1,2}[\\/\\-\\._][0-9]{1,2}";
		
		String date1 = "2014-01-02";
		String date2 = "2014/01/02";
		String date3 = "2014_01_02";
		String date3b = "2014.01.02";
		
		String date4 = "14-1-2";
		String date5 = "14/1/2";
		String date6 = "14_1_2";
		
		String dateRev = "01-02-2014";
		
		
		String regexReverseYear = "[0-9]{1,2}[\\/\\-_][0-9]{1,2}[\\/\\-_][0-9]{2,4}";
		
		
		
			
//		String regexReverseYear = "[0-9]{1,2}[\\/\\-_]";
//		
//		String dateRev = "01-";
		
		
		System.out.println(date1.matches(regex));
		System.out.println(date2.matches(regex));
		System.out.println(date3.matches(regex));
		System.out.println(date3b.matches(regex));
		System.out.println(date4.matches(regex));
		System.out.println(date5.matches(regex));
		System.out.println(date6.matches(regex));
		System.out.println(dateRev.matches(regexReverseYear));
	}
}
