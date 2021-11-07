import org.apache.commons.codec.binary.Base32;
import java.util.Scanner;

class base32{
	public base32(){
		System.out.print("\033[H\033[2J");  
		System.out.flush(); 
		System.out.println("BASE64 MODE");
		encode();
	}

	public void base32_1(){
		System.out.println("ENCRYPT STRING MODE");
	}

	public String takeInput(){
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}

	public void encode(){
		Base32 encoder = new Base32();
		encoder.encode(takeInput());
	}
}
