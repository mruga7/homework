package mrugakshi;

import java.util.LinkedList;
import java.lang.String;
import java.util.Scanner;
import java.util.*;

public class add {
	
	public static void main(String[] args )
	{
		
				int size=0;
				
				int i=0;
				int a=0;
				int max=0;
			
			   	Scanner in =new Scanner(System.in);
			   	String s2="end";
				
			
			    LinkedList<String> list2= new LinkedList<String>();
			    System.out.println("the size");
			    size=in.nextInt();
                System.out.println("enter the elements of the list");
                
                String s= new String();
             
				  for(i=0;i<=size;i++)
				  {
					
              	        s=in.nextLine();
		                list2.add(s); 
		                System.out.println(list2);
				  }     
				  max=Integer.parseInt(list2.getFirst());
				  for(i=0;i<size;i++)
				  {
					  a=Integer.parseInt(list2.get(i));
					  
					  if(a>max)
					  {
						  max=a;
					  }
					  
				  }
				  System.out.println(max);				  
				  
   }
}

	
			   