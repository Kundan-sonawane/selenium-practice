package day4variable;

public class areaofcircle {

	public static void main(String[] args) 
	{
		System.out.println("Programs Starts");
		//are = pi * r * r
		double r=10, area;
		area= (22/7)*r*r;
		System.out.println("Redious of circle is : "+r);//10  | 10.0	| 10.0    | 10.0
		System.out.println("Area of circle is: "+area);//314  | 314.28  | 314.0   | 300.0
		System.out.println("********************************");
		area= (22.0/7)*r*r;
		System.out.println("Redious of circle is : "+r);// 10.0
		System.out.println("Area of circle is: "+area);//  314.28
		System.out.println("********************************");
		area= 3.14*r*r;//314
		System.out.println("Redious of circle is : "+r);//10.0
		System.out.println("Area of circle is: "+area);//314.0
		System.out.println("********************************");
		double pi=3.14;
		area= pi*r*r;
		System.out.println("Redious of circle is : "+r);//10.0
		System.out.println("Area of circle is: "+area);//314.0
		System.out.println("Programs Ends");
	}

}
