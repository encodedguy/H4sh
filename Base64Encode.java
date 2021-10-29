import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;

class Base64Encode {

    private static String base64Encode(String value) {
        try {
            return Base64.getEncoder()
                        .encodeToString(value.getBytes(StandardCharsets.UTF_8.toString()));        
        } catch(UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }
        
    public static void main(String[] args) {
        System.out.println("Enter a value to Encode : ");
        Scanner keyboard = new Scanner(System.in);

        String input = keyboard.nextLine();
        System.out.println(base64Encode(input));

        keyboard.close();
    }
}