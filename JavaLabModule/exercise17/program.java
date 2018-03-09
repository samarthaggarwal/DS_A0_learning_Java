import java.util.*;

public class program
{
	public String[] test(String fileNames[])
	{
		/*
		Exercise 17: Java files- You have been given the list of the names
		of the files in a directory.
		You have to select Java files from them.
		A file is a Java file if it’s name ends with ”.java”.
		For e.g. ”File-Names.java” is a Java file, ”FileNames.java.pdf” is not.
		If the input is {”can.java”,”nca.doc”,”and.java”,”dan.txt”,”can.java”,”andjava.pdf”} 
		the expected output is {”can.java”,”and.java”,”can.java”}
		*/

		Vector<String> v = new Vector<String>();
		String s,t=".java";
		int j;

		for(int i=0;i<fileNames.length;i++){
			if( fileNames[i].length() < 5 )
				continue;

			s = fileNames[i].substring( fileNames[i].length()-5 , fileNames[i].length() ) ;
			//System.out.println(s);

			for(j=0;j<5;j++){
				if(s.charAt(i) != t.charAt(i) )
					break;
			}

			if(j==5)
				v.add( fileNames[i] );


/*			if(fileNames[i].substring( fileNames[i].length()-5 , fileNames[i].length() ).equals(".java") ){
				System.out.println("yes");
			}
*/
		}

		String javaFiles[] = new String[v.size()];
		for(int i=0;i<v.size();i++){
			javaFiles[i] = v.get(i);
		}

		return javaFiles;
	}
}
