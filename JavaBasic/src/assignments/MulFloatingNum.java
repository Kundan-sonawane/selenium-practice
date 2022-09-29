package assignments;

public class MulFloatingNum {

	float i=2.5f;
	float j=5.5f;
	float k;
	void FloatNumMultiplication() {
		System.out.println("Floating num is :"+i +" "+j);
		k=i*j;
		System.out.println("Result :"+ k);
	}
	
	public static void main(String[] args) {

		MulFloatingNum mf=new MulFloatingNum();
		mf.FloatNumMultiplication();
		char ch='a';
		char ch1='b';
		int ascci1 = ch;
		int ascci2 = ch1;
		int ascci=ch * ch1;
		System.out.println("ascci value of a :"+ascci1);
		System.out.println("ascci value of b :"+ascci2);
		System.out.println("Multiplication of two ascci value is :"+ascci);
	}

}
