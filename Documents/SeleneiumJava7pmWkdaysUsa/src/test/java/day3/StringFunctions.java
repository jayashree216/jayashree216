package day3;

public class StringFunctions {
    public static void main(String[] args) {

        String name= "sharanya";
        System.out.println("total count of characters in the string"+name.length());
        System.out.println("to upper:"+name.toUpperCase());
        System.out.println("to lower:"+name.toLowerCase());
        System.out.println("convert to case:"+name.substring(0,2).toUpperCase());
        System.out.println("convert to case:"+name.substring(0,2).toLowerCase());
    }


}
