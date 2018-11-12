package calculation;
import calculation.EnumClass.MathExpr;

public class CalculationService {

	public String calculationRequest(MathExpr mE, int num1, int num2) {
		
		String answer = "No Answer";
		switch (mE) {
		case ADD:
			answer = Integer.toString(addTwoNumbers(num1, num2));
			break;
		case SUBTRACT:
			answer = Integer.toString(subtrackNumbers(num1, num2));
			break;
//		case DIVIDE:
//			answer = Integer.toString(subtrackNumbers(num1, num2));
//			break;
		default:
			break;
		}
		return answer;
	}
	
	private int addTwoNumbers(int a, int b) {
		return a+b;
	}
	
	private int subtrackNumbers(int a, int b) {
		return b-a; 
	}
	
}

