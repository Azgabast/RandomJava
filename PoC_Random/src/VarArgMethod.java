
public class VarArgMethod {
	
	public static void varArgMethod(String...stuff){
		System.out.println(stuff[0]);
		System.out.println(stuff.length);
	}
	
	public static void main(String[] args){
		
		varArgMethod("a", "b", "c");
//		varArgMethod("a", "b", "c", 1);
//		varArgMethod(1, "a", "b", "c");
	}
}
