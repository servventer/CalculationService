package calculation;
import calculation.EnumClass.*;

public class ICalculationService {
	
	public static void main(String[] args) {

		System.out.println(doWork(args));			
	}
	
	public static String doWork(String[] args) {
		
		int int1 =  Integer.parseInt(args[0]);
		int int2 =  Integer.parseInt(args[1]);
		String outFinal = "First";
		CalculationService output = new CalculationService();
		
		outFinal = outFinal + " " + output.calculationRequest(MathExpr.ADD, int1, int2) + " ?? ";
		outFinal = outFinal + output.calculationRequest(MathExpr.SUBTRACT, int1, int2);
				
		return outFinal;
		
	}

}
