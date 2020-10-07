import java.util.*;

public class StringCalculatorMain {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
		
		System.out.println("연산할 문자열을 입력하세요");
		String inputString = scanner.nextLine();
		System.out.println("입력값 " +inputString);
		String[] inputArray = inputString.split(" ");
		
		//첫번째값 구하기
		int first = Integer.parseInt(inputArray[0]);
		
		int result = first;
		
		for (int i = 1; i < inputArray.length; i+=2) {
			String symbol = inputArray[i];
			
			int second = Integer.parseInt(inputArray[i+1]);
			try {
				result = calculator.calculate(result, symbol, second);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		calculator.print(result);

	}

}
