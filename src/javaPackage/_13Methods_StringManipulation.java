package javaPackage;

public class _13Methods_StringManipulation 
{
	public static void main(String[] args) 
	{
		String str1 = "JAVA";
		String str2 = "ROCKS";

		//concat()
		String str4 = str1.concat(str2);
		System.out.println(str4);//JAVAROCKS
		
		//length()
		System.out.println("Length of " + str4 + " is " + str4.length());
		
		//indexOf()
				System.out.println("Index of a character R is " + str4.indexOf('R'));
		
		//charAt()
		System.out.println("Character at position 7 is " + str4.charAt(7));
		
		//contains()
		System.out.println("Contains sequence 'VARO': " + str4.contains("VARO"));
	}

}
