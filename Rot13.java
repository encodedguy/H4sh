
		import java.io.*;
		import java.util.*;
		class ROT13
		{
			
		        Scanner in= new Scanner(System.in);
		        String str,str1= ""; 
		        char ch,ch1; 
		        int i,y,l; 
		        System.out.println("Enter Message");
		        str= in.nextLine(); 
		        l= str.length();
		        for(i=0;i<l;i++)
		        {
		            ch= str.charAt(i); 
		            if(ch>='A'&&ch<='M'||ch>='a'&&ch<='m')
		            {
		                y=(int)ch+13;
		                ch=(char)y;
		                str1=str1+ch;
		            }
		            else if(ch>='N'&&ch<='Z'||ch>='n'&&ch<='z')
		            {
		                y=(int)ch-13;
		                ch=(char)y;
		                str1=str1+ch;
		            }
		        }
		        System.out.println("Original Message : " +str); 
		        System.out.println("Encrypted Message : " +str1); 
		    }
		

	}