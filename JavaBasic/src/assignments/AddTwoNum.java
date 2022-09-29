package assignments;

public class AddTwoNum {
	
		int i=10,j=20,k;
	    void addnum() {
			System.out.println("Addition of two num :");
			k=i+j;
			System.out.println("Result :"+ k);
		}

	public static void main(String[] args) {

		AddTwoNum a=new AddTwoNum();
		a.addnum();
		char ch='a';
		char ch1='b';
		int ascci1 = ch;
		int ascci2 = ch1;
		int ascci=ch + ch1;
		System.out.println("ascci value of a :"+ascci1);
		System.out.println("ascci value of b :"+ascci2);
		System.out.println("Addition of two ascci value is :"+ascci);
	}

}
