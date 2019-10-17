interface Diamond1{
	default void sharpen(){
		System.out.println("Sharpened by 1");
	}
}



interface Diamond2{
	default void sharpen(){
		System.out.println("Sharpened by 2");
	}
}


public class PoC_DiamondProblem implements Diamond1, Diamond2{

	@Override
	public void sharpen() {
		Diamond1.super.sharpen();
	}
		
}
