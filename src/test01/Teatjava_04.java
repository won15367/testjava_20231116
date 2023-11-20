package test01;

public class Teatjava_04 {
	
	public static void main(String[] args) {
		int a = 20, b= 9;
		int result1 = a + b;
		double result2 = a / b;
		
		System.out.println(result2);
		// 정수끼리의 나눗셈은 소수를 버리고 정수로 정답이 반환된다.
		
		double t = 10/3.0;  // 한쪽을 실수로 만들어서 결과는 실수로 만든다.
		System.out.println(t);
		
		String str1 = "100";
		int intStr = Integer.parseInt(str1);
		System.out.println(intStr);
		
		String str2 = "100.123";
		double boubleStr = Double.parseDouble(str2);
		System.out.println(boubleStr);
		
		String str3 = String.valueOf(a);
		
		
		
	}

}
