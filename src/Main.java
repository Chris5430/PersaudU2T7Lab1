import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter first string: ");
       String str1 = input.nextLine();
       int length1 = str1.length();
       String str1half1 = str1.substring(0, length1/2);
       String str1half2 = str1.substring(length1/2);
       System.out.println("String length: " + length1);
       System.out.println("First half: " + str1half1);
       System.out.println("Second half: " + str1half2);
       System.out.println("Enter second string: ");
       String str2 = input.nextLine();
       int length2 = str2.length();
       if(length2>length1){
           System.out.println(str2 + " is longer");
       }else if(length1>length2){
           System.out.println(str1 + " is longer");
       }
       int compare = str1.compareTo(str2);
       if(str1.equals(str2)){
           System.out.println("Both strings have the same sequence of characters");
       }else if(compare>0){
           System.out.println(str1 + " is first alphabetically");
       }else{
           System.out.println(str2 + " is first alphabetically");
       }
       int index = str1.indexOf(str2);
       if(index<0){
           System.out.println(str2 + " is NOT found in " + str1);
       }else{
           System.out.println(str2 + " is found in " + str1 + " at index " + index);
       }
    }
}