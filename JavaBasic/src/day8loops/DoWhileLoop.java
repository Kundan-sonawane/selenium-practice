package day8loops;

public class DoWhileLoop {

	public static void main(String[] args) {

		int c = 25;
		System.out.println("Printing all the numbers from 10 till 1");
		do {
			// printing all the numbers till 10
			System.out.println(c);
			--c;
		} while (c > 0);
	}
}
