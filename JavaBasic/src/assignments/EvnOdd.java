package assignments;

public class EvnOdd {
	
	int i;
	 void EvenOdd(int i) {
		 
		 System.out.println("Number is :"+i);
		 
		if(i%2==0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}
	}
	public static void main(String[] args) {

		EvnOdd ev=new EvnOdd();
		ev.EvenOdd(10);
	}

}
