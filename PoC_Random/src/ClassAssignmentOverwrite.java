
public class ClassAssignmentOverwrite {
	
	
	public static void main (String[] args){
	
		Integer a;
		Integer b;
		
		
		b = 5;
		
		a = b;
		
		b = 6;
		
		System.out.println(a);
		
		
		X x1 = new X(5);
		X x2 = x1;
		
		x1 = new X(6);
		
		System.out.println(x2.v);
		
		
	}
	
	public static class X{
		int v;
		X(int v){
			this.v = v;
		}
	}
	
	
	
}
