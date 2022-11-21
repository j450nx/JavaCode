import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.stream.events.Characters;

import org.apache.commons.lang3.ArrayUtils;

public class Main {
	public static Boolean isPalindrome(String str) {
		// divide string into half, get whole number with Math.floor
		int length = (int) Math.floor(str.length()/2);
		// create a loop to half the length of the string and compare the start letter and end letter
		// if there is mismatch, return not a palindrome
		for (int i = 0; i < length; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		// let the default palindrome
		return true;
	}
	
	public static int binaryGap(int N) {
        int max = 0;
        int pos = 0;
        int lastPos = -1;
        while (N != 0) {
            pos++;
            if ((N & 1) == 1) {
                if (lastPos != -1) {
                    max = Math.max(max, pos-lastPos);
                }
                lastPos = pos;
            }
            N >>= 1;
        }
        return max;
    }
	
	public static int firstMissingPositive(int[] nums) {
	    int n = nums.length;
	    
	    // 1. mark numbers (num < 0) and (num > n) with a special marker number (n+1) 
	    // (we can ignore those because if all number are > n then we'll simply return 1)
	    for (int i = 0; i < n; i++) {
	        if (nums[i] <= 0 || nums[i] > n) {
	            nums[i] = n + 1;
	        }
	    }
	    for (int num : nums) {
	    	System.out.print(num);
	    }
	    System.out.println("");
	    
	    // note: all number in the array are now positive, and on the range 1..n+1
	    
	    // 2. mark each cell appearing in the array, by converting the index for that number to negative
	    for (int i = 0; i < n; i++) {
	        int num = Math.abs(nums[i]);
	        if (num > n) {
	            continue;
	        }
	        num--; // -1 for zero index based array (so the number 1 will be at pos 0)
	        if (nums[num] > 0) { // prevents double negative operations
	            nums[num] = -1 * nums[num];
	        }
	    }
	    for (int num : nums) {
	    	System.out.print(num);
	    }
	    
	    // 3. find the first cell which isn't negative (doesn't appear in the array)
	    for (int i = 0; i < n; i++) {
	        if (nums[i] >= 0) {
	            return i + 1;
	        }
	    }
	    
	    // 4. no positive numbers were found, which means the array contains all numbers 1..n
	    return n + 1;
	}
	
	public static String reverseWords(String s) {
        
        String[] words = s.split("\\s+");
        StringBuilder str = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--){
            str.append(words[i] + " ");
        }
        System.out.println("str: " + str);
        return str.toString().trim();
    }
	
	public static String reverse(String s) {
		String str = "";
		
		for (int i = s.length() - 1; i >= 0; i--) {
			str += s.charAt(i);
		}
		return str;
	}
	
	
	public static int randomRange (int min, int max) {
		return (int) Math.floor(Math.random() * (max - min) + min);
	}
	
	public static int factorial(int num) {
		if(num == 0)return 1;
		int sum = 1;
		for (int i = 1; i <= num; i++) {
			sum *= i;
		}
		return sum;
	}
	
	public static int factorialWithRecursion(int num) {
		if(num == 0) return 1;
		return num * factorialWithRecursion(num - 1);
	}
	
	public static int findLongestWordLength(String str) {
		String[] array = str.split(" ");
		int max = 0, currentMax;
		for (String i : array) {
			currentMax = i.length();
			max = Math.max(max, currentMax);
		}
		return max;
	}
	
	public static ArrayList<Integer> largestOfFour(int[][] array) {
		ArrayList<Integer> result = new ArrayList<>();
		int max, currentMax;
		for(int i = 0; i < array.length; i++) {
			// assign max to first integer of the subarray
			max = array[i][0];
			for(int j = 0; j < array[i].length; j++) {
				currentMax = array[i][j];
				max = Math.max(max, currentMax);
			}
			result.add(max);
		}
		return result;
	}
	
	public static boolean confirmEnding(String str, String target) {
		return (str.substring(str.length() - target.length(), str.length()).equals(target));
	}
	
	public static String repeatStringNumTimes(String str, int num) {
		if (num == 0) return str;
		String result = "";
		for (int i = 0; i < num; i++) {
			result += str;
		}
		return result;
	}

	private static String truncateString(String str, int num) {
		if (str.length() > num) {
			return str.substring(0, num) + "...";
		}
		return null;
	}
	public static ArrayList<String> titleCase(String str) {
		String[] strArr = str.toLowerCase().split(" ");
		ArrayList<String> arr = new ArrayList<>();
		for (String word : strArr) {
			word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
			arr.add(word);
		}
		return arr;
	}
	
	public static ArrayList<String> frankenSplice(String[] arr1, String[] arr2, int n) {
		ArrayList<String> result = new ArrayList<>();
		for (int i = 0; i < arr2.length; i++) {
			result.add(arr2[i]);
			if (i == n - 1) {
				for (int j = 0; j < arr1.length; j++) {
					result.add(arr1[j]);
				}
			}
		}
		return result;
	}
	
	public static int getIndexToIns(int[] arr, int num) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (num <= arr[i]) {
				return i;
			} else if (num > arr[arr.length - 1]) {
				return arr.length;
			}
		}
		return 0;
	}
	
	public static boolean doesStr1ContainsStr2 (String str1, String str2) {
		String firstString = str1.toLowerCase();
		String secondString = str2.toLowerCase();
		for (int i = 0; i < secondString.length(); i++) {
			if (firstString.indexOf(secondString.charAt(i)) < 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int[][] chunkArrayInGroups (int[] arr, int chunkSize){
		if(chunkSize <= 0) return null;
		// first we have to check if the array can be split in multiple
		// arrays of equal chunk size
		// if rest>0 then our last array will have less elements than the others
		int rest = arr.length % chunkSize;
		// then we check in how many arrays we can split our input array
		int chunks = arr.length / chunkSize + (rest > 0 ? 1 : 0);
		// now we know how many arrays we need to create our result array
		int[][] arrays = new int[chunks][];
		// we craee our resulting arrays by copying the corresponding
		// part from the input array. If we have a rest, then the last
		// array will have less elements than the others. This needs to be
		// handled separetly, so we iterate 1 time less.
		for (int i = 0; i < (rest > 0 ? chunks - 1 : chunks); i++) {
			// this copies 'chunk' times 'chunkSize' elements into a new array
			arrays[i] = Arrays.copyOfRange(arr, i * chunkSize, i * chunkSize + chunkSize);
		}
		if (rest > 0) {// only when we have a rest
			// we copy the remaining elements into the last chunk
			arrays[chunks - 1] = Arrays.copyOfRange(arr, (chunks - 1) * chunkSize, (chunks - 1) * chunkSize + rest);
		}
		return arrays;
	}
	
	public static int sumAll(int[] arr) {
		Arrays.sort(arr);
		int a = arr[0];
		int b = arr[1];
		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static ArrayList<Integer> diffArray(int[] arr1, int[] arr2){
		ArrayList<Integer> result = new ArrayList<>();
		int[] both = Arrays.copyOf(arr1, arr1.length + arr2.length);
		System.arraycopy(arr2, 0, both, arr1.length, arr2.length);
		for (int i = 0; i < both.length; i++) {
			if(!ArrayUtils.contains(arr1, both[i]) || !ArrayUtils.contains(arr2, both[i])) {
				result.add(both[i]);
			}
		}
		return result;
	}
	
	public static int[] valsToRemove(int[] arr, int num) {
		int[] result = new int[arr.length - 1];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] == num) continue;
			result[j++] = arr[i];
		}
		return result;
	}
	
	public static String searchAndReplace(String str, String before, String after) {
		int index = str.indexOf(before);
		if (Character.isUpperCase(str.charAt(index))) {
			after = Character.toUpperCase(after.charAt(0)) + after.substring(1);
		} else {
			after = Character.toLowerCase(after.charAt(0)) + after.substring(1);
		}
		return str.replace(before, after);
	}
	
	public static ArrayList<String> pairElement(String str) {
		ArrayList<String> result = new ArrayList<>();
		for (char i : str.toCharArray()) {
			if (i == 'A') {
				result.add("A-T");
			} else if (i == 'T') {
				result.add("T-A");
			} else if (i == 'C') {
				result.add("C-G");
			} else {
				result.add("G-C");
			}
		}
		return result;
	}
	
	public static String fearNotLetter(String str) {
		String[] strArr = str.split("");
		System.out.println(Arrays.toString(strArr));
		// find char code 
		int charCode = strArr[0].charAt(0);
		for (int i = 0; i < strArr.length; i++, charCode++) {
			if (strArr[i].charAt(0) != charCode) {
				return Character.toString(charCode);
			}
		}
		return "";
	}
	
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> numMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (numMap.containsKey(complement)) {
				return new int[] {numMap.get(complement), i};
			}
			numMap.put(nums[i], i);
		}
		return null;
	}
	
	public static int coinChange(int[] coins, int amount) {
		
	    int[]dp = new int[amount + 1];
	    Arrays.fill(dp, amount + 1);
	    dp[0] = 0;
	    
	    for (int i = 0; i <= amount; i++) {
	    	for (int j = 0; j < coins.length; j++) {
	    		if (coins[j] <= i) {
	    			dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
	    		}
	    	}
	    }
	    return dp[amount] > amount ? -1 : dp[amount];
	  }
	
	/*
	We can regard this quesiton as :
	a+b+c+min(difference) ? target
	sum = a+b+c
	then we transferred the question sucessfully as Two Pointers.
	
	So what we need now is the minimum diff and return sum(which is target - diff) at last
	Watch out that diff could be both positive and negative, thus just comparing diff is meaningless.
	We can slove this by updating the diff original value IFF its absolute value smaller.
	 */
	
	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int result = nums[0] + nums[1] + nums[nums.length - 1];
		for (int i = 0; i < nums.length - 2; i++) {
			int left = i + 1;
			int right = nums.length - 1;
			
			while (left < right) {
				int current_sum = nums[i] + nums[left] + nums[right];
				if (current_sum > target) {
					right--;
				} else {
					left++;
				}
				if (Math.abs(current_sum - target) < Math.abs(result - target)) {
					result = current_sum;
				}
			}
		}
		return result;
	}
	
	public static int reverseInteger(int x) {
        int reversed = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            reversed = reversed * 10 + pop;
        }
        return reversed;
    }
	
	public static boolean palindromeNumber(int x) {
		if (x == 0) return true;
		if (x < 0 || (x != 0 && x % 10 == 0)) return false;
		
		int reversed = 0;
		while (x > reversed) {
			int pop = x % 10;
			x /= 10;
			reversed = reversed * 10 + pop;
		}
		if (x == reversed) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int romanToInt(String s) {
		if ( s == null || s.length() == 0) return 0;
        
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int result = map.get(s.charAt(s.length() - 1));
        
        for (int i = s.length() - 2; i >= 0; i--) {
        	if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
        		result += map.get(s.charAt(i));
        	} else {
        		result -= map.get(s.charAt(i));
        	}
        }
		return result;
	}
	
	public static String intToRoman(int num) {
        int[] intCode = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] code = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < intCode.length; i++) {
            while (num>= intCode[i]) {
                sb.append(code[i]);
                num -= intCode[i];
            }
        }
        return sb.toString();
    }
		

	public static void main(String[] args) {
//		System.out.println(isPalindrome("noon"));
//		System.out.println(binaryGap(529));
//		int[] nums = {1, -3, 6, 4, 1, 2};
//		System.out.println(firstMissingPositive(nums));
//		System.out.println(reverseWords("The sky is blue"));
//		System.out.println(reverse("The sky is blue"));
//		System.out.println(randomRange(1, 3));
//		System.out.println(factorial(5));
//		System.out.println(factorialWithRecursion(3));
//		System.out.println(findLongestWordLength("The quick brown fox jumped over the lazy dog"));
//		int[][] array = {{4, 5, 1, 3}, {13, 27, 18, 26}, {32, 35, 37, 39}, {1000, 1001, 857, 1}};
//		System.out.println(largestOfFour(array));
//		System.out.println(confirmEnding("Bastian", "n"));
//		System.out.println(repeatStringNumTimes("*", 8));
//		System.out.println(truncateString("A-tisket a-tasket A green and yellow basket", 8));
//		System.out.println(titleCase("I'm a little tea pot"));
//		String[] arr1 = {"claw", "tentacle"};
//		String[] arr2 = {"head", "shoulder", "knees", "toes"};
//		System.out.println(frankenSplice(arr1, arr2, 2));
//		int[] array = {3, 10, 5};
//		System.out.println(getIndexToIns(array, 4));
//		System.out.println(doesStr1ContainsStr2("Alien", "line"));
//		int[] array = {1, 2, 3, 4, 5, 6, 7};
//		chunkArrayInGroups(array, 4);
//		int[] array = {10, 5};
//		System.out.println(sumAll(array));
//		int[] arr1 = {1, 2, 3, 4, 5};
//		int[] arr2 = {3, 4, 6};
//		ArrayList<Integer> result = diffArray(arr1, arr2);
//		System.out.println(result);
//		int[] array = {1, 2, 3, 4, 5};
//		int[] result = valsToRemove(array, 3);
//		System.out.println(Arrays.toString(result));
//		System.out.println(searchAndReplace("A quick brown fox Jumped over the lazy dog", "Jumped", "leaped"));
//		System.out.println(pairElement("AATGCG"));
//		System.out.println(fearNotLetter("abde"));
		// leetcode
		System.out.println(Arrays.toString(twoSum(new int[] {4, 5, 6, 7}, 11)));
		System.out.println(coinChange(new int[] {1, 2, 5}, 11));
		System.out.println(threeSumClosest(new int[]{1,2,3,4,5}, 3));
//		System.out.println(reverseInteger(12314));
//		System.out.println(palindromeNumber(121));
		System.out.println(romanToInt("IV"));
		System.out.println(intToRoman(2944));
		
		
/*	
		// HashSets are unordered, unique numbers
		// TreeSet gives ordered set
		// LinkedHashSet gives speed in some instances
		Set<Integer> t = new HashSet<Integer>();
		t.add(5);
		t.add(7);
		t.add(5);
		t.add(9);
		t.add(-8);
		t.remove(5);
		System.out.println(t);
		Boolean x = t.contains(0);
		System.out.println(x);
		
		// ArrayList is slower, dynamically sized array
		// LinkedList is faster in certain operations
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(5);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.get(0);
		arrayList.set(1, 8);
		System.out.println(arrayList);
		System.out.println(arrayList.subList(1, 3));
		
		// Map is a key, value pair. It is unordered and has unique pairs
		// TreeMap keeps pairs in order, data type has to be the same
		// LinkedHastMap maintains the order
		Map m = new HashMap();
		m.put("tim", 5);
		m.put("joe", "fresh");
		m.put(11, 999);
		m.put(11, 997);
		System.out.println(m);
		System.out.println(m.get("tim"));
		System.out.println(m.containsKey("tim"));
		System.out.println(m.values());
		System.out.println(m.isEmpty());
		
		Map n = new HashMap();
		String str = "hello my name is tim and i am cool";
		for(char i:str.toCharArray()) {
			if(n.containsKey(i)) {
				int old = (int) n.get(i);
				n.put(i, old+1);
			} else {
				n.put(i, 1);
			}
		}
		n.remove(' ');
		System.out.println(n);
		
		int[] a = {-99, 5, 6, 3, 2, 1, 7, 8, 0};
		Arrays.sort(a, 3, 6);
		for (int i : a) {
			System.out.print(i + ", ");
		}
		*/
	}
}
