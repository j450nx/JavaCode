public class HelloWorld {
	
	static String randomString = "I'm a string";
	static final double PINUM = 3.1415926;
	
	public static void main (String[] arg) {
		System.out.println(randomString);
		
		int integerOne = 22;
		int integerTwo = integerOne + 1;
		
		System.out.println(integerTwo);
		
		byte bigByte = 127;
		short bigShort = 32767;
		int bigInt = 210000000;
		long bigLong = 9220000000000000000L;
		float bigFloat = 3.14F;
		double bigDouble = 3.1415921321321485186;
		
		System.out.println(bigDouble);
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		boolean trueOfFalse = true;
		
		char randomChar = 88;
		char anotherChar = 'A';
		
		System.out.println(randomChar);
		
		char escapedCharB = '\b';
		char escapedCharF = '\f';
		char escapedCharL = '\n';
		char escapedCharR = '\r';
		char escapedCharT = '\t';
		char escapedCharDoubleQuote = '\"';
		char escapedCharBackSlash = '\\';
		
		String randomString1 = "I'm a random string";
		String randomString2 = "stuff";
		String randomString1plus2 = randomString1+ ' ' + randomString2;	
		
		System.out.println(randomString1plus2);
		
		String byteString = Byte.toString(bigByte);
		String shortString = Short.toString(bigShort);
		String ingString = Integer.toString(bigInt);
		String longString = Long.toString(bigLong);
		String floatString = Float.toString(bigFloat);
		String doubleString = Double.toString(bigDouble);
		String booleanString = Boolean.toString(trueOfFalse);
		
		double aDoubleValue = 39000005400000.14141241;
		int doubleToInt = (int) aDoubleValue;
		byte doubleToByte = (byte) aDoubleValue;
		short doubleToShort = (short) aDoubleValue;
		long doubleToLong = (long) aDoubleValue;
		double intToDouble = (double) bigInt;
		System.out.println(doubleToInt);
		
		int stringToInt = Integer.parseInt(ingString);
		double stringToDouble = Double.parseDouble(doubleString);
		byte stringToByte = Byte.parseByte(byteString);
		short stringToShort = Short.parseShort(shortString);
		long stringToLong = Long.parseLong(longString);
		boolean stringToBoolean = Boolean.parseBoolean(booleanString);
		System.out.println(stringToBoolean);
	}
}