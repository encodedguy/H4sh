import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class sha256{
	public sha256(){
                System.out.print("\033[H\033[2J");
		System.out.flush();
		System.out.println("SHA256 ENCRYPTION MODE");
	}

	public String takeInput(){
		System.out.printf("Enter a string: ");
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}

	public String encode(){
		String password = takeInput();
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

	public void printHash(){
		System.out.println("SHA256: " + encode());
	}
}
