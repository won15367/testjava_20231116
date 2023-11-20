package test01;

public class Testjava_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char chr1 = 'A';  //한글자만 저장 가능한 타입 ''으로 묶는다.
		int chr2 = chr1;
		char a = 10;
		System.out.println(chr2);
		
		String str1 = "Korea\nJapan";
		System.out.println(str1);
		
		double flt1 =1543751342634126e-10;
		System.out.println(flt1);
		
		float c = 3.14f;  // f를 뒤에 붙여야 한다.
		long d = 1000000000000000000L;  // L를 뒤에 붙여야 한다.
		
		boolean j = true;
		boolean k = false;
		
		int val1 = 10;
		byte val2 = (byte)val1;
		
		double val_db = 10.523;
		int val_int = (int)val_db;  // 임시형변환
		System.out.println(val_int);  // 소수점은 버린다.
		
		
		
		
		
	}

}
