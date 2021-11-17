import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class sha256{
	public sha256(){
                System.out.print("\033[H\033[2J");
		System.out.flush();
		System.out.println("SHA256 ENCRYPTION MODE");
	}

	public String encode(String password){
		final byte[] defaultBytes = password.getBytes();
		try{
			final MessageDigest sha256Digest = MessageDigest.getInstance("SHA256");
			sha256Digest.reset();
			sha256Digest.update(defaultBytes);
			final byte digest[] = sha256Digest.digest();

			final StringBuffer hexString = new StringBuffer();
			for(final byte element : digest){
				final String hex = Integer.toHexString(0xFF & element);
				if(hex.length() == 1)
					hexString.append('0');
				hexString.append(hex);
			}

			password = hexString + "";
		}catch(final NoSuchAlgorithmException nsae){
			nsae.printStackTrace();
		}

		return password;
	}

	public void printHash(int option){
		Input inputObj = new Input();
		System.out.println("SHA256: " + encode(inputObj.takeInput(option)));
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
