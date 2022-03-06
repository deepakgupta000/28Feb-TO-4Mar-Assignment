package com.date28To4Mar;

public class Mar01 {

	public class StringFormatter {
        public static String toggle(String str) {
            String words[] = str.split("\\s");
            StringBuilder toggle = new StringBuilder();
            for (String w : words) {
                String first = w.substring(0, 1);
                String afterfirst = w.substring(1);
                toggle.append(first.toLowerCase()).append(afterfirst.toUpperCase()).append(" ");
            }
            return toggle.toString().trim();
        }
    }
    public static void main(String[] args) {
        //"1.) Write a program to replace a given substring in a sentence with another string. For example, in the sentence,
        // ” A batman with bat” if we replace ”bat” with ”snow”,the new sentence should be printed as ”A snowman with snow”.
        System.out.println("Old word we got:- "+"A batman with bat");
        String abc = "A batman with bat";
        String replaceString=abc.replace("bat" , "snow");
        System.out.println("The new word will be:- " + replaceString);

        //2.WAP to tOGGLE each word in the String?
        System.out.println(StringFormatter.toggle("This is Geekster"));

        //3.) WAP to reverse tOGGLE each word in the String?
        String str =  "my name is khan";
        StringBuffer sbfr = new StringBuffer(str);
        sbfr.reverse();
        System.out.println(sbfr);
    }
}
