import java.math.BigInteger;
import java.util.Scanner;

class Octal{
    public Octal(){
        System.out.print("\033[H\033[2J");  
		System.out.flush(); 
		System.out.println("BASE64 MODE");
		encode();
    }

    public String takeInput(){
        System.out.printf("Enter a string: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public String encode(){
        String password = takeInput();
        final byte[] defaultBytes = password.getBytes();
        BigInteger oct;
        try {
            oct = new BigInteger(defaultBytes);
            String result = oct.toString(8);
            return result;
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    
    public void printHash(){
        System.out.println("Octal: " + encode());
    }
}