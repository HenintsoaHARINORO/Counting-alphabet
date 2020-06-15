import java.util.Scanner;

public class Count {
     public static void main(String [] args)
     {
    	 System.out.println("*****Count the numbers of alphabet in a sentence*****");
    	 System.out.print("Enter your  sentence:");
    	 Scanner sc=new Scanner(System.in);
    	 String str=sc.nextLine();
    	 System.out.println("Your  sentence is:"+str);
    	 System.out.println("Please enter the alphabet you want to count:");
    	 String alpha=sc.nextLine();
    	 
         if(alpha.charAt(0)>=0x41 && alpha.charAt(0)<=0x5A && alpha.charAt(0)>=0x61 && alpha.charAt(0)<=0x7A)
    	 {
    			 System.out.println("right");
    	 }
    	 else
    		 System.out.println("Please verify the alphabet");
     }
}
