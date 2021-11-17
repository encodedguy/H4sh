import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

class MD2{
    public MD2(){
        System.out.print("\033[H\033[2J");  
		System.out.flush(); 
		System.out.println("BASE64 MODE");
		encode();
    }

    public String takeInput(){
        System.out.printf("Enter a string: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public String encode(){
        String password = takeInput();
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

    public void printHash(){
        System.out.println("MD2: " + encode());
    }
}