// Java program to demonstrate Morse code
import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Morse_Code {
    public Morse_Code(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("SHA512 ENCRYPTION MODE");
    }

    public static String takeInput(){
        System.out.printf("Enter a string: ");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    // function to encode a alphabet as Morse code
    static String morseEncode(char x)
    {
     
        switch (x)
        {
            case 'a':
                return ".-";
            case 'b':
                return "-...";
            case 'c':
                return "-.-.";
            case 'd':
                return "-..";
            case 'e':
                return ".";
            case 'f':
                return "..-.";
            case 'g':
                return "--.";
            case 'h':
                return "....";
            case 'i':
                return "..";
            case 'j':
                return ".---";
            case 'k':
                return "-.-";
            case 'l':
                return ".-..";
            case 'm':
                return "--";
            case 'n':
                return "-.";
            case 'o':
                return "---";
            case 'p':
                return ".--.";
            case 'q':
                return "--.-";
            case 'r':
                return ".-.";
            case 's':
                return "...";
            case 't':
                return "-";
            case 'u':
                return "..-";
            case 'v':
                return "...-";
            case 'w':
                return ".--";
            case 'x':
                return "-..-";
            case 'y':
                return "-.--";
            case 'z':
                return "--..";
            case '1':
                return ".----";
            case '2':
                return "..---";
            case '3':
                return "...--";
            case '4':
                return "....-";
            case '5':
                return ".....";
            case '6':
                return "-....";
            case '7':
                return "--...";
            case '8':
                return "---..";
            case '9':
                return "----.";
           case '0':
                return "-----";
        }
        return "";
    }
     
    static String morseCode(String s)
    {
        // character by character print
        // Morse code
        
        for (int i = 0;i<s.length(); i++)
            System.out.print(morseEncode(s.charAt(i)));
            System.out.println();
            return s;
    }
    

    public String readFile(){
		System.out.printf("Enter filename: ");
		Scanner input = new Scanner(System.in);
		String filename = new String(input.nextLine());
		String fileData = new String();

		try{
			File file = new File(filename);
			Scanner data = new Scanner(file);

			while(data.hasNextLine()){
				fileData = data.nextLine();	
			}
			
			input.close();
		}catch(FileNotFoundException fnfe){
		System.out.println("Unexpected error occured!");
		fnfe.printStackTrace();
		}
		
		return fileData;
	}

	public String encodeFile(String fileData){
		return morseCode(fileData);
	}
	
	public void printHashFromFile(){
		System.out.println("MorseCode : " + encodeFile(readFile()));
	}

	public void printHash(){
		System.out.println("Morse_Code: " + morseCode(takeInput()));
	}
}

    
    

  