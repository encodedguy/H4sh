import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;

public class sha512 {
    public sha512(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("SHA512 ENCRYPTION MODE");
    }

    public String encode(String password){
        final byte[] defaultBytes = password.getBytes();
        try {
            final MessageDigest md = MessageDigest.getInstance("SHA-512");
            byte[] messageDigest = md.digest(password.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);

            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }

            return hashtext;
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

    }

    public void printHash(int option){
	       Input inputObj = new Input();
         System.out.println("SHA512: " + encode(inputObj.takeInput(option)));
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
  				System.out.println("SHA256: " + line + " : " + encode(line));
  			}

  			file.close();
  			input.close();

  		}catch(IOException ioe){
  			System.out.println("Unexpected error occured!");
  			ioe.printStackTrace();
  		}
  	}
}
