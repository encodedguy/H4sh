import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

class Hex{
    public Hex(){
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
        StringBuilder result = new StringBuilder();
        try {
            for(byte aByte: defaultBytes){
                result.append(String.format("%02x", aByte));
            }
            return result.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void printHash(){
        System.out.println("Hex: " + encode());
    }
}
