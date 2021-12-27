import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;

public class sha128 {
    public sha128(){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("SHA128 ENCRYPTION MODE");
        }

        public String takeInput(){
            System.out.printf("Enter a string: ");
            Scanner input = new Scanner(System.in);
            return input.nextLine();
        }

        public String encode(String password){
            final byte[] defaultBytes = password.getBytes();
            try {
                final MessageDigest sha128Digest = MessageDigest.getInstance("SHA-1");
                byte[] messageDigest = sha128Digest.digest(password.getBytes());
                BigInteger no = new BigInteger(1, messageDigest);
                String hashtext = no.toString(16);
                while (hashtext.length() < 32) {
                    hashtext = "0" + hashtext;
                }

                // return the HashText
                return hashtext;
            }
            catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }

        public void printHash(int option){
      		Input inputObj = new Input();
      		System.out.println("SHA128: " + encode(inputObj.takeInput(option)));
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
