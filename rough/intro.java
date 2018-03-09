import java.util.Scanner;

/*
public class intro
{
	public String name;
	public int age;

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		intro obj = new intro();

		System.out.println("Enter your name:");
		obj.name = s.nextLine();
		System.out.println("Enter your age:");
		obj.age = s.nextInt();
		s.close();

		System.out.println("Name: " + obj.name);
		System.out.println("Age: " + obj.age);

	}
}
*/

/*
import java.util.Scanner;

public class intro
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Using if else");

		System.out.println("Enter a number");
		int n = s.nextInt();

		if(n%2==0)
			System.out.println(n + " is even");
		else
			System.out.println(n + " is odd");

		System.out.println("\n\nUsing Switch Case");

		switch(n%2){
			case 0:
				System.out.println(n+ " is even");
				break;

			case 1:
				System.out.println(n + " is odd");
				break;
		}

	}


}

*/

import java.util.Scanner;

class holder
{
	int age;
}

public class intro
{
	public static void main(String args[])
	{
		holder h;
		h = new holder();

		h.age = 20;

		System.out.println("Old value : " + h.age);

		newage(h,30);

		System.out.println("New value : " + h.age);
	}

	public static void newage(holder k, int n)
	{
		k.age = n;
	}

}
