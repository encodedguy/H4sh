

import java.util.*;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Binary {
    public Binary(){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Binary ENCRYPTION MODE");
        }

        public static String takeInput(){
            System.out.printf("Enter a string: ");
            Scanner input = new Scanner(System.in);
            return input.nextLine();
        }

        static String reverse(String input)
        {
            char[] a = input.toCharArray();
            int l, r = 0;
            r = a.length - 1;

            for (l = 0; l < r; l++, r--)
            {

                char temp = a[l];
                a[l] = a[r];
                a[r] = temp;
            }
            return String.valueOf(a);
        }

        public static String encode(String text){
            String s = text;
            String binary = "";
                int n = s.length();

                for (int i = 0; i < n; i++)
                {

                    int val = Integer.valueOf(s.charAt(i));


                    String bin = "";
                    while (val > 0)
                    {
                        if (val % 2 == 1)
                        {
                            bin += '1';
                        }
                        else
                            bin += '0';
                        val /= 2;
                    }
                    bin = reverse(bin);

                    binary += bin + " ";
                }

                return binary;
        }

        public static void printHash(int option){
            Input inputObj = new Input();
            System.out.println("Binary: " + encode(inputObj.takeInput(option)));
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
      				System.out.println("Binary: " + line + " : " + encode(line));
      			}

      			file.close();
      			input.close();

      		}catch(IOException ioe){
      			System.out.println("Unexpected error occured!");
      			ioe.printStackTrace();
      		}
      	}
    }
