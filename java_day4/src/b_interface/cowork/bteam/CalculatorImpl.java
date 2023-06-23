package b_interface.cowork.bteam;

import b_interface.cowork.common.Calculator;

// TODO: a 팀의 작업 결과와 무관하게 Calculator를 제대로 구현하세요.
public class CalculatorImpl implements Calculator{
	
	public int add(int a, int b) {
		return a + b;
	}
	
	
public static void main(String[] args) {
	Calculator c = new CalculatorImpl();
	int result = c.add(100, 200)
}
}
// END
