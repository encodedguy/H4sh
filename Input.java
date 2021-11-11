import java.util.*;
import java.io.*;

public class Input
{
	`
	public String takeInput(option){

	switch(option){
		case 1:
			System.out.printf("Enter a string: ");

			Scanner input = new Scanner(System.in);

			return input.nextLine();

			break;



		case 2:
			//read file //
			break;



		case 3:
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
			break;


		default:
			//some statement//
			return null ;
			break;
	}


	}
}