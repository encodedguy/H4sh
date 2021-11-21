import java.math.BigInteger;
import java.util.Scanner;

class Octal{
    public Octal(){
        System.out.print("\033[H\033[2J");  
		System.out.flush(); 
		System.out.println("BASE64 MODE");
    }

    public String encode(String password){
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
    
    public void printHash(int option){
		Input input = new Input();
		System.out.println("Octal: " + encode(input.takeInput(option)));
	}
}