import java.util.Arrays;

public class JavaLesson13 {

	public static void main(String[] args) {
		String randomString = "I'm just a randomstring";
		
		String gotToQuote = "He said, \"I'm here\"";
		
		System.out.println(randomString + " " + gotToQuote);
		
		String upperCaseString = "BIG";
		String lowerCaseString = "big";
		
		if(upperCaseString.equalsIgnoreCase(lowerCaseString)) {
			System.out.println("They are equal");
		}
		
		String letters = "abcde";
		String moreLetters = "fghijk";
		
		System.out.println("2nd char: " + letters.charAt(1));
		System.out.println(letters.compareTo(moreLetters));
		System.out.println(letters.contains("abc"));
		System.out.println(letters.endsWith("de"));
		System.out.println(letters.indexOf("bc"));
		System.out.println("Length: " + letters.length());
		System.out.println(letters.replace("ab", "bc"));
		
		//You can also specify the index to start searching from
		//indexOf(StringToLookFor, indexStartPosition)
		
		//lastIndexOf() works like indexOf except it starts from the end
		//of the string you a
		letters = "a,b,c";
		String[] letterArray = letters.split(",");
		System.out.println(Arrays.toString(letterArray));
		
		letters = "abcde";
		char[] charArray = letters.toCharArray();
		System.out.println(charArray);
		
		System.out.println(letters.substring(1,4));
		System.out.println(letters.toUpperCase());
		
		String randString = "   jjjj     ";
		System.out.println(randString.trim());
		
		StringBuilder randSB = new StringBuilder ("A random value");
		System.out.println(randSB.append(" again"));
		System.out.println(randSB);
		System.out.println(randSB.delete(15, 21));
		randSB.ensureCapacity(60);
		System.out.println(randSB.capacity());
		System.out.println(randSB.length());
		randSB.trimToSize();
		System.out.println(randSB.capacity());
		System.out.println(randSB.insert(1, "nother"));
		String oldSB = randSB.toString();
	}
}
