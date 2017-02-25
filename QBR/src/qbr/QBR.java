package qbr;
//Jake Lampert QBR
import java.util.Scanner;

public class QBR {

	public static void main(String[] args) {

		System.out.println("Enter pass attempts: ");
		Scanner scanner = new Scanner(System.in);
		double ATT = (double)scanner.nextInt();

		System.out.println("Enter completions: ");
		Scanner scanner1 = new Scanner(System.in);
		double COMP = scanner.nextInt();

		System.out.println("Enter touchdowns: ");
		Scanner scanner2 = new Scanner(System.in);
		double TD = scanner.nextInt();

		System.out.println("Enter total yards: ");
		Scanner scanner3 = new Scanner(System.in);
		double YARDS = scanner.nextInt();

		System.out.println("Enter Interceptions: ");
		Scanner scanner4 = new Scanner(System.in);
		double INT = scanner.nextInt();

		double a = (((COMP / ATT) - .3) * 5);
		double aFinal = extra(a);
		double b = (((YARDS / ATT) - 3) * .25);
		double bFinal = extra(b);
		double c = ((TD / ATT) * 20);
		double cFinal = extra(c);
		double d = (2.375 - ((INT / ATT) * 25));
		double dFinal = extra(d);
		double pr = (((aFinal + bFinal + cFinal + dFinal) / 6) * 100);
		

		System.out.println("Passer Rating: " + pr);
		
		

	}
	
	public static double extra(double x)
	{
		if(x > 2.375)
		{
			x = 2.375;
		
		}
		else if(x < 0)
		{
			x = 0;
		}
		return x;
	}
}
