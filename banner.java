import java.util.Scanner;


class banner{
	public banner(){
		System.out.println("--->> 1. Encrypt String");
		System.out.println("--->> 2. Encrypt Strings (File)");
		System.out.println("--->> 3. Encrypt Whole File");
// 		System.out.println("--->> 4. Decrypt String");
// 		System.out.println("--->> 5. Decrypt Whole File");
// 		System.out.println("--->> 6. Decrypt Strings in a File");
	}

	public int numInput(){
		Scanner input = new Scanner(System.in);
		System.out.printf("--->> Choose an option : ");
		return input.nextInt();
	}

	public void banner1(){
		System.out.print("\033[H\033[2J");
		System.out.flush();

		System.out.println("ENCRYPT STRING MODE");

		System.out.println("--->> A. Binary");
		System.out.println("--->> B. Caesar Cipher");
		System.out.println("--->> C. Hexadecimal");
		System.out.println("--->> D. MD5");
		System.out.println("--->> E. Octal");
		System.out.println("--->> F. Morse Code");
		System.out.println("--->> G. Sha128");
		System.out.println("--->> H. Sha256");
		System.out.println("--->> I. Sha512");
		System.out.println("--->> J. Whirlpool");
		System.out.println("--->> K. XOR Cipher");
		System.out.println("--->> L. Caesar Cipher");
		System.out.println("--->> M. MD2");
	}

	public String banner1Input(){
		Scanner input = new Scanner(System.in);
		System.out.printf("--->> Choose an option : ");
		return input.nextLine();
	}

}
