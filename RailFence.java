import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

public class RailFence 
{
    public RailFence()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("SHA512 ENCRYPTION MODE");
    }
    public static String takeInput()
    {
        System.out.printf("Enter a string: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();     
    }
    public static int depth()
    {
        System.out.printf("Enter depth: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
 
    String Encryption(String plainText,int depth)
   {
        int r=depth,len=plainText.length();
        int c=len/depth;
        char mat[][]=new char[r][c];
        int k=0;
  
        String cipherText="";
  
       for(int i = 0;i< c;i++)
       {
           for(int j = 0 ;j < r;j++)
       {
       if(k!= len)
       mat[j][i]=plainText.charAt(k++);
        else
         mat[j][i]='X';
       }
    }
        for(int i = 0; i<r ; i++)
        {
           for(int j=0;j< c;j++)
           {
            cipherText+=mat[i][j];
           } 
        }
        return cipherText;
    }
    
 
 public  void printHash()
 {
      
    System.out.println("RailFence : " + Encryption(takeInput(), depth()));
}
           
}
  
 
  