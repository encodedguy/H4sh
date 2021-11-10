
import java.util.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CaesarCipher {
    public CaesarCipher(){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("CaesarCipher ENCRYPTION MODE");
        }

        public static String takeInput(){
            System.out.printf("Enter a string: ");
            Scanner input = new Scanner(System.in);
            return input.nextLine();
            
        }
        public static int takeshift(){
            System.out.printf("Enter a shift: ");
            Scanner input = new Scanner(System.in);
            return input.nextInt();

        }
        public static StringBuffer encode(String password, int s){
           
            StringBuffer result= new StringBuffer();
 
            for (int i=0; i<password.length(); i++)
            {
                if (Character.isUpperCase(password.charAt(i)))
                {
                    char ch = (char)(((int)password.charAt(i) +
                                      s - 65) % 26 + 65);
                    result.append(ch);
                }
                else
                {
                    char ch = (char)(((int)password.charAt(i) +
                                      s - 97) % 26 + 97);
                    result.append(ch);
                }
            }
            return result;
          
        }
        public static void printHash(){
            System.out.println("CaesarCipher: " + encode(takeInput(),takeshift()));
        }
                   
       
    }

    
       