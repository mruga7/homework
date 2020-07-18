package mrugakshi;

import java.util.LinkedList;
import java.lang.String;
import java.util.Scanner;
import java.util.*;

public class add {
	
	public static void main(String args[] )
	{
		
				int size=0;
				
				int i=0;
				int a=0;
				int no=0;
				int index=0;
				String s4;
				int p=0;
			
			
			   	Scanner in =new Scanner(System.in);
			   	String s2="end";
				
			
			    LinkedList<String> list2= new LinkedList<String>();
			    System.out.println("the size");
			    size=in.nextInt();
                System.out.println("enter the elements of the list");
                
                String s;
                String s3;
                String max;
               
             
				  for(i=0;i<=size;i++)
				  {
					
              	        s=in.nextLine();
		                list2.add(s); 
		                
				  }  
				  max=list2.getFirst();	
				    			
				    for(i=0;i<=size;i++)
				  {
					  s3=list2.get(i);
					no = s3.compareTo(max);
					
					if(no>0||no==0)
					{
						max=s3;
					
					}
	
				  }
				    
				   System.out.println(max); 
				  
				   
				    for(i=0;i<list2.size();i++)
				    {
				    	
				    	s4=list2.get(i);
				    	System.out.println(s4);
				    	if(s4==max)
				    	{
				    		list2.remove(i);
				    	}
				    	
                    }
	
				     System.out.println(list2);
	}
           
   }
