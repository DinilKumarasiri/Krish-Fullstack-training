import java.math.BigDecimal;

public class BigDecimalOperation{
	public static void main(String [] args){
		BigDecimal bigdecimal1, bigdecimal2 , multiply , addition;
		bigdecimal1 = new BigDecimal("23.12");
		bigdecimal2 = new BigDecimal("56.49");

		multiply = bigdecimal1.multiply(bigdecimal2);

		addition = bigdecimal2.add(bigdecimal1);

		System.out.println("Addition of the 23.12 and 56.49 : " + addition);
		System.out.println("Multiplication of the 23.12 and 56.49 : " + multiply);
		
	}
}