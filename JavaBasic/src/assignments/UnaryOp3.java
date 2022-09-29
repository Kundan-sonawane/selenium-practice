package assignments;

public class UnaryOp3 {

	public static void main(String[] args) {
		int a = -1, b;
		b = a++ + ++a + ++a + a;
	
		System.out.println("a: "+a);// 2
		System.out.println("b: "+b);// 4
		System.out.println("**********************");
		a = 7;
		b = a-- + --a + --a + a;
	
		System.out.println("a: "+a);// 4
		System.out.println("b: "+b);// 20

		a = -21;
		b = --a + --a + --a + a + ++a + a++;//
		
		System.out.println(a);// -22
		System.out.println(b);// -139

		a = -5;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
		
		System.out.println(a);// -29
		System.out.println(b);// -2
	}

}
