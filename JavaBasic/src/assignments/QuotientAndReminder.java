package assignments;

public class QuotientAndReminder {

	static int i,j,rem;
	int qu;
	static int x=10,z=3;
	void Quotient(int i,int j) {
		qu=i/j;
		System.out.println("Num one for Quotient :"+i);
		System.out.println("Num two for Quotient :"+j);
		System.out.println("Quotient is :"+ qu);
	}
	public static int Reminder(int i ,int j) {
		
		return rem=i%j;
		
	}
	public static void main(String[] args) {

		QuotientAndReminder QR=new QuotientAndReminder();
		QR.Quotient(25,3);
		System.out.println("Enter Num One For Reminder:"+x);
		System.out.println("Enter Num Two For Reminder:"+z);
		System.out.println("Reminder is "+ Reminder(x,z));
	}

}