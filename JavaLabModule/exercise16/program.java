public class program
{
	public String test(String hex)
	{
		/*
		Exercise 16: Hex to binary- Given a string representing a number in hexadecimal
		format, convert it into its equivalent binary string. For e.g. if the input if ”1F1”
		then its binary equivalent is ”111110001”. If the input is ”13AFFFF”, the output
		should be ”1001110101111111111111111”.
		*/
		String binary="";
		char c;
		int n;

		for(int i=0;i<hex.length();i++){
			c = hex.charAt(i);
			if(c>='0' && c<='9')
				n = c - '0';
			else
				n = c - 'A' + 10;

			int j=8;
			while(j>0){
				binary += (char)('0' + (n/j));
				n%=j;
				j/=2;
			}
		}

		int j=0;
		while(binary.charAt(j)=='0'){
			binary = binary.substring(1,binary.length());
		}

		return binary;
	}
}
