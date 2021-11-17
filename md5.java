import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class md5{
	public md5(){
		System.out.print("\033[H\033[2J");
		System.out.flush();
		System.out.println("MD5 ENCRYPTION MODE");
	}

	public String encode(String password){
		final byte[] defaultBytes = password.getBytes();
		
		try{
			final MessageDigest md5MsgDigest = MessageDigest.getInstance("MD5");

			md5MsgDigest.reset();
			md5MsgDigest.update(defaultBytes);

			final byte messageDigest[] = md5MsgDigest.digest();
			final StringBuffer hexString = new StringBuffer();

			for(final byte element : messageDigest){
				final String hex = Integer.toHexString(0xFF & element);
				if (hex.length() == 1)
					hexString.append('0');
				hexString.append(hex);
			}

			password = hexString + "";
		
		}catch (final NoSuchAlgorithmException nsae){
			nsae.printStackTrace();
		}

		return password;
	}

	public void printHash(int option){
		Input input = new Input();
		System.out.println("MD5: " + encode(input.takeInput(option)));
	}
}
