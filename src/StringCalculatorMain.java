import java.util.*;

public class StringCalculatorMain {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
		
		System.out.println("������ ���ڿ��� �Է��ϼ���");
		String inputString = scanner.nextLine();
		System.out.println("�Է°� " +inputString);
		String[] inputArray = inputString.split(" ");
		
		//ù��°�� ���ϱ�
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
