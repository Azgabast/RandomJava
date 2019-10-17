import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Exp4jtester {
	
	public static void main(String[] args){
		Expression calc = new ExpressionBuilder("[(2+3) * (5+ 7) + 4]*2").build();
		System.out.println(calc.evaluate());
		
		
		Expression calc2 = new ExpressionBuilder("{[[(VS.HSDPA.MEANCHTHROUGHPUT.TOTALBYTES+3) * (5+ 7) + 4]*2]}")
				.variables("VS.HSDPA.MEANCHTHROUGHPUT.TOTALBYTES", "aasda").build().setVariable("VS.HSDPA.MEANCHTHROUGHPUT.TOTALBYTES", 2).setVariable("asdsada", 5);
		
		ExpressionBuilder calc3 = new ExpressionBuilder("[(VS.HSDPA.MEANCHTHROUGHPUT.TOTALBYTES+3) * (5+ 7) + 4]*2");
		calc3.variables  ("VS.HSDPA.MEANCHTHROUGHPUT.TOTALBYTES");
		Expression exp = calc3.build();
		exp.setVariable("VS.HSDPA.MEANCHTHROUGHPUT.TOTALBYTES", 10);
		exp.setVariable("VS.HSDPA.MEANCHTHROUGHPUT.TOTALBYTESzzz", 10);
		
		
		System.out.println(calc2.evaluate());
		System.out.println(exp.evaluate());
	}

}
