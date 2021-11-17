import java.util.*;
import java.io.*;

public class Input{
	public String takeInput(int option){

	switch(option){
		case 1:
			System.out.printf("Enter a string: ");
			Scanner lineInput = new Scanner(System.in);
			return lineInput.nextLine();
		case 2:
			//read file //
			break;
		case 3:
			System.out.printf("Enter filename: ");
			Scanner input = new Scanner(System.in);
			String filename = new String(input.nextLine());
			String fileData = new String();

			try{
				FileReader file = new FileReader(filename);
				
				int i;
				while ((i = file.read()) != -1){
					fileData += (char)i;
				}
				
				file.close();
				input.close();

			}catch(IOException ioe){
				System.out.println("Unexpected error occured!");
				ioe.printStackTrace();
			}
		
			return fileData;
		default:
			//some statement//
			return null ;
	}
	return "";
	}
}
