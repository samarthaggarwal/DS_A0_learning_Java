public class program
{
	public int test(String number)
	{
		/*
		Exercise 18: Most frequent digit- Given a number, the objective is to find out
		the most frequently occuring digit in the number. If more than 2 digits have
		the same frequency, return the smallest digit. The number is input as a string
		and the output should be the digit as an integer. For e.g. if the number is
		12345121, the most frequently occuring digit is 1. If the number is 9988776655
		the output should be 5 as it is the smallest of the digits with the highest frequency.
		*/

		int[] arr = new int[10];
		int maxfreq=0;
		int n=0;

		for(int i=0;i<10;i++){
			arr[i]=0;
		}

		for(int i=0;i<number.length();i++){
			arr[number.charAt(i) - '0'] += 1;
		}

		for(int i=0;i<10;i++){
			if(arr[i]>maxfreq){
				maxfreq=arr[i];
				n = i;
			}
		}

		return n;
	}
}
