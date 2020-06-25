import java.util.Scanner;

public class Count {
     public static void main(String [] args)
     {   int count=0;
    	 System.out.println("*****Count the numbers of alphabet in a sentence*****");
    	 System.out.print("Enter your  sentence:");
    	 Scanner sc=new Scanner(System.in);
    	 String str=sc.nextLine();
    	 System.out.println("Your  sentence is:"+str);
    	 System.out.print("Please enter the alphabet you want to count:");
    	 String alpha=sc.nextLine();
    	
           if( alpha.charAt(0)>=0x61 && alpha.charAt(0)<=0x7A)
    	    {
        	   for(int i=0;i<str.length();i++)
        		{  
    			if(str.charAt(i)==alpha.charAt(0))
    			{
    				count++;
    				
    			}
    		}
    	    }
         
           if(count==0)
        	   System.out.println("There is no "+alpha+" in the sentence");
           else
           System.out.print("There are "+count+"in the sentence");
        }
    		
    	   
 		
 
    	
     }
