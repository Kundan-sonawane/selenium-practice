package assignments;

public class SwapTwoNum {

	int a=10,b=20,temp;
	void Swap2Num() {
		System.out.println("Num one :"+a);
		System.out.println("Num Two :"+b);
		System.out.println("Before Swapping :"+a + " "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping :"+a +" "+b);
	}
	public static void main(String[] args) {

		SwapTwoNum st=new SwapTwoNum();
		st.Swap2Num();
	}

}
