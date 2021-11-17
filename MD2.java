import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;

class MD2{
    public MD2(){
        System.out.print("\033[H\033[2J");  
		System.out.flush(); 
		System.out.println("MD2 ENCRYPTION MODE");
    }

    public String encode(String password){
        final byte[] defaultBytes = password.getBytes();
        try {
            MessageDigest md = MessageDigest.getInstance("MD2");
            byte[] messageDigest = md.digest(defaultBytes);
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);

            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public void printHash(int option){
		Input input = new Input();
		System.out.println("MD5: " + encode(input.takeInput(option)));
	}
}