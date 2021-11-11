

import java.util.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class XORCipher {
    public XORCipher(){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("XORCipher ENCRYPTION MODE");
        }

        public static String takeInput(){
            System.out.printf("Enter a string: ");
            Scanner input = new Scanner(System.in);
            return input.nextLine();
            
        }
       
        public static String encode(String inputString){
           
            char xorKey = 'P';
 
       
        String outputString = "";
 
        
        int len = inputString.length();
 
       
        for (int i = 0; i < len; i++)
        {
            outputString = outputString +
            Character.toString((char) (inputString.charAt(i) ^ xorKey));
        }
 
        
        return outputString;
          
        }
        public static void printHash(){
            System.out.println("XORCipher: " + encode(takeInput()));
        }
                   
      /*  public static void main(String args[]) {
            printHash();  
        } */
    }

    
       