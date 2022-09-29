package day4variable;

public class StaticGlobalVariableExample {
	//static global  variables
	static int age;
	static boolean res;
	static char grade;
	static float roi;
	public static void main(String[] args) {
		System.out.println("Program starts");
		//we can access static global variables directly from here as mian() is also static
		System.out.println("default value of age is: "+age);
		System.out.println("default value of res is: "+res);
		System.out.println("default value of grade is: "+grade);
		System.out.println("default value of roi is: "+roi);
		System.out.println("**********************************");
		//initialization of static global variable
		age=25;
		res=true;
		grade='A';
		roi=6.5f;
		System.out.println("updated value of age is: "+age);
		System.out.println("updated value of res is: "+res);
		System.out.println("updated value of grade is: "+grade);
		System.out.println("updated value of roi is: "+roi);
		System.out.println("Program ends\n");
		System.out.println("***********************************\n");
		System.out.println("Program starts");
		//we can access static global variables using classname from here as main() is also static
		System.out.println("default value of age is: "+StaticGlobalVariableExample.age);
		System.out.println("default value of res is: "+StaticGlobalVariableExample.res);
		System.out.println("default value of grade is: "+StaticGlobalVariableExample.grade);
		System.out.println("default value of roi is: "+StaticGlobalVariableExample.roi);
		System.out.println("**********************************");
		//initialization of static global variable
		StaticGlobalVariableExample.age=25;
		StaticGlobalVariableExample.res=true;
		StaticGlobalVariableExample.grade='A';
		StaticGlobalVariableExample.roi=6.5f;
		System.out.println("updated value of age is: "+StaticGlobalVariableExample.age);
		System.out.println("updated value of res is: "+StaticGlobalVariableExample.res);
		System.out.println("updated value of grade is: "+StaticGlobalVariableExample.grade);
		System.out.println("updated value of roi is: "+StaticGlobalVariableExample.roi);
		System.out.println("Program ends");
	}
}
