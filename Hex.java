import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

class Hex{
    public Hex(){
        System.out.print("\033[H\033[2J");  
		System.out.flush(); 
		System.out.println("HEX MODE");
    }

    public String encode(String password){
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
    
    public void printHash(int option){
		Input input = new Input();
		System.out.println("Hex: " + encode(input.takeInput(option)));
	}
}
