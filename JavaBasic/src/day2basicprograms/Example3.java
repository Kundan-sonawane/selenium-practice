package day2basicprograms;

public class Example3 {

	public static void main(String[] args) 
	{
		System.out.println("Hello Java");
	}

}

/**
* is it mandatory to have classname and filename/sourcefilename same? No
* at the time compilation java compiler doesn't check for case senstitive ness of the file
  but at the time of execution JVM is case sensitive
* can we compile empty .java file? Yes, because java compiler checks only for syntax error
* can java compiler generates .classfile for empty .java file? No, because to generate classfile class should present in the .java file
* can we execute empty .java file? No, to exeucte any java program first we need .classfile and that .classfile should have main()
*/