public class Calculator {
	public  int calculate(int first, String symbol, int second) throws Exception {
		int result = 0;
		
		if(symbol.equals("+")) {
			result = first + second;
		} else if(symbol.equals("-")) {
			result = first - second;
		} else if(symbol.equals("*")) {
			result = first * second;
		} else if(symbol.equals("/")) {
			if(second == 0 ) {
				throw new Exception("0으로 나눌 수 없습니다.");
			}
			result = first / second;
		}
		
		return result;
	}
	
	public void print(int result) {
		System.out.println("결과 값 " + result);
	}
}
