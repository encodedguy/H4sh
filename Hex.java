import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class Hex{
    public Hex(){
        System.out.print("\033[H\033[2J");
		System.out.flush();
		System.out.println("HEX MODE");
    }

    public String encode(String password){
        final byte[] defaultBytes = password.getBytes();
        StringBuilder result = new StringBuilder();
        try {
            for(byte aByte: defaultBytes){
                result.append(String.format("%02x", aByte));
            }
            return result.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void printHash(int option){
		Input input = new Input();
		System.out.println("Hexadecimal: " + encode(input.takeInput(option)));
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
        System.out.println("Hexadecimal: " + line + " : " + encode(line));
      }

      file.close();
      input.close();

    }catch(IOException ioe){
      System.out.println("Unexpected error occured!");
      ioe.printStackTrace();
    }
  }
}
