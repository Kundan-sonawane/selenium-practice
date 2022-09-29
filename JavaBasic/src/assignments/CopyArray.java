package assignments;

public class CopyArray {

	public static void main(String[] args) {
		int[] ary1={66,77,88,99,55};
		System.out.println(ary1[0]);
		System.out.println(ary1[1]);
		System.out.println(ary1[2]);
		System.out.println(ary1[3]);
		System.out.println(ary1[4]);
		System.out.println("**********************");
		System.out.println("*****Normal for loop*****");
		for(int i=0;i<ary1.length;i++)
		{
			System.out.println(ary1[i]);
		}
		System.out.println("*****for-each loop****");
		for(int i : ary1) 
		{
			System.out.println(i);
		}
		System.out.println("**************************");
		System.out.println("****Copy 1 ary into another ary****");
		int[] ary2= new int[ary1.length];
		ary2=ary1;
		//ary2[0]++;
		System.out.println("*****Normal for loop*****");
		for(int j=0;j<ary2.length;j++)
		{
			System.out.println("Copy elements"+ary2[j]);
		}
	}

}
