

import java.util.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Binary {
    public Binary(){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Binary ENCRYPTION MODE");
        }

        public static String takeInput(){
            System.out.printf("Enter a string: ");
            Scanner input = new Scanner(System.in);
            return input.nextLine();
        }

        static String reverse(String input)
        {
            char[] a = input.toCharArray();
            int l, r = 0;
            r = a.length - 1;
     
            for (l = 0; l < r; l++, r--)
            {
               
                char temp = a[l];
                a[l] = a[r];
                a[r] = temp;
            }
            return String.valueOf(a);
        }

        public static void encode(){
            String s=takeInput();
            System.out.println("Binary: " );
                int n = s.length();
         
                for (int i = 0; i < n; i++)
                {
                   
                    int val = Integer.valueOf(s.charAt(i));
         
                  
                    String bin = "";
                    while (val > 0)
                    {
                        if (val % 2 == 1)
                        {
                            bin += '1';
                        }
                        else
                            bin += '0';
                        val /= 2;
                    }
                    bin = reverse(bin);
         
                    System.out.print(bin + " ");
                }
            
        }
        public static void printHash(){
            encode(); 
        }

       
    }

     
       