import java.util.regex.*;

public class JavaLessonNineteen {
	
	public static void main(String[] args) {
		
		String longString = " Derek Bana CA AK 12345 PA (412)555-1212 johnsmith@google.com 412-555-1212 412 555-1234";
		String strangeString = " 1Z aaa **** *** {{{ {{ {";

		// Word that is 2 to 20 characters in length
		// [A-Za-z]{2,20
//		regexChecker("\\s[A-Za-z]{2,20}\\s", longString);

		// Zip code is 5 digits long
//		regexChecker("\\s\\d{5}\\s", longString);
		
		// 2 characters that start with a C or A
		//A[KLRZ]|C[AOT]
//		regexChecker("A[KLRZ]|C[AOT]", longString);
		
		// { min length is 1
//		regexChecker("(\\{{1,})", strangeString);
		
		// and {, same as above
//		regexChecker("(\\{+)", strangeString);
		
//		regexChecker(".{3}", strangeString);
		
		// johnsmith@google.com
//		regexChecker("[A-Za-z0-9._%-]+@[A-Za-z0-9._-]+\\.[A-Za-z]{2,4}", longString);
		
		//1-(412)555-1212 (412)555-1212 412-555-1234 412 555-1234
//		regexChecker("([0-9]( |-)?)?(\\{?[0-9]{3}\\)?|[0-9]{3})( |-)?([0-9]{3}( |-)?[0-9]{4}|[A-Za-z0-9]{7})", longString);
		
		regexReplace(longString);
	}
	
	public static void regexChecker(String theRegex, String str2Check) {
		
		Pattern checkRegex = Pattern.compile(theRegex);
		
		Matcher regexMatcher = checkRegex.matcher(str2Check);
		
		while(regexMatcher.find()) {
			if(regexMatcher.group().length() != 0) {
				System.out.println(regexMatcher.group().trim());
			}
			
			System.out.println("Start index: " + regexMatcher.start());
			System.out.println("End index: " + regexMatcher.end());
		}
	}
	
	public static void regexReplace(String str2Replace) {
		
		Pattern replace = Pattern.compile("\\s+");
		
		Matcher regexMatcher = replace.matcher(str2Replace.trim());
		
		System.out.println(regexMatcher.replaceAll(", "));
		
	}
}