import java.math.BigInteger;
import java.util.Scanner;
import java.security.NoSuchAlgorithmException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

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

  public void printHashes(){
		System.out.printf("Enter filename: ");
		Scanner input = new Scanner(System.in);
		String filename= new String(input.nextLine());

		try{
			FileReader file = new FileReader(filename);
			BufferedReader br = new BufferedReader(file);
			String line;

			while((line = br.readLine()) != null){
				System.out.println("Octal: " + line + " : " + encode(line));
			}

			file.close();
			input.close();

		}catch(IOException ioe){
			System.out.println("Unexpected error occured!");
			ioe.printStackTrace();
		}
	}
}
