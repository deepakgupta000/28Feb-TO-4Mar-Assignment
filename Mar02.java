package com.date28To4Mar;

import java.util.Arrays;

public class Mar02 {

	 public static void main(String[] args) {
	        System.out.println(truncateKSentence("Hello how are you contestant", 4));
	        System.out.println(Arrays.toString(numbersSmallerThenCurrent(new int[]{8, 1, 2, 2, 3})));
	        System.out.println(isValidString("Hello0"));
	    }

	    //3.) Check if given String is valid. String is valid if Characters in given string have at least 1 uppercase, 1 lowercase and 1 digit.
	    private static String isValidString(String str) {
	        boolean isUpper = false, isLower = false, isDigit = false;
	        for (char ch : str.toCharArray()) {
	            if (ch >= 'A' && ch <= 'Z' && !isUpper) {
	                isUpper = true;
	            } else if (ch >= 'a' && ch <= 'z' && !isLower) {
	                isLower = true;
	            } else if (ch >= '0' && ch <= '9' && !isDigit) {
	                isDigit = true;
	            }
	        }
	        return (isUpper && isLower && isDigit) ? "Valid" : "InValid";
	    }
	    //2.) How Many Numbers Are Smaller Than the Current Number
	    private static int[] numbersSmallerThenCurrent(int[] arr) {
	        int res[] = new int[arr.length];
	        for (int i = 0; i < arr.length; i++) {
	            int curVal = arr[i], count = 0;
	            for (int val : arr) {
	                if (curVal > val) {
	                    count++;
	                }
	            }
	            res[i] = count;
	        }
	        return res;
	    }
	    //1.) Truncate Sentence You are given a sentence s and an integer k.
	    private static String truncateKSentence(String str, int k) {
	        String[] strArray = str.split(" ");
	        String output = "";
	        for (int i = 0; i < k; i++) {
	            output += strArray[i] + " ";
	        }
	        return output;
	    }
}
