package day4variable;

public class variable1example {

	public static void main(String[] args)
	{
		System.out.println("Program Starts");
		//syntax to declare a variable: datatype variablename;
		/*
		 datatype------> tells us what type of value this variable is going to hold
			byte, short, int, long --> positive or negative number
			float, double          --> decimal numbers
			char                   --> character/alphabet 
			boolean                --> true/false
		*/
		byte byteVariable;
		short shortVariable;
		int intVariable;
		long longVariable;
		float floatVariable;
		double doubleVariable;
		char charVariable;
		boolean booleanVariable;		
		//Syntax to initlize a variable: variablename = value;
		byteVariable = 25;//-10 | -89
		shortVariable = 50;//-10 | -89
		intVariable = 150;//-10 | -89
		longVariable = 2530l;//-10 | -89 | 25
		floatVariable = 25.36f;//25 | -69 |5454 | 0.25f
		doubleVariable = 36.56d;//25 | -69 |54.54 | 0.256
		charVariable = 'A';//'a' | 'Z'
		booleanVariable = true;//true | false
		//print all the varibale value inthe console
		System.out.println("byteVariable");//byteVariable
		System.out.println(byteVariable);//25
		System.out.println(shortVariable);//50
		System.out.println(intVariable);//150
		System.out.println(longVariable);//2530
		System.out.println(floatVariable);//25.36
		System.out.println(doubleVariable);//36.56
		System.out.println(charVariable);//A
		System.out.println(booleanVariable);//true
		System.out.println("Program ends");

	}

}

/*
+ ----> LHS + RHS  ===> both are number dn it will perform addition operation
		  25 + 35   = 60

+ ----> LHS + RHS  ===> if anyone from LHS or RHS are non numeric dn it will perform concatination peration
     "Hello " + 65  = Hello 65
		String + number = Stringnumber

	   205 + "Hi"   = 205Hi

	   "Bye "+20 + 20 + 60 = Bye 202060
							Bye 20 + 20 =Bye 2020
						   (String)+ number= StringNumber

							Bye 2020 + 60= Bye 202060
							(String) + number = StringNumber

	60 + 10 + 25 + "Good" + 70 +10= 95Good7010
*/