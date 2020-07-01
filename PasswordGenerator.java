//PasswordGenerator By Fawaz
import java.util.Random;
public class PasswordGenerator 
{
    public static void main(String[] args)
    {
        int length = 8; // password length
        System.out.println(gnrtpswd(length));
    }
    static char[] gnrtpswd(int len)
    {
        System.out.println("Generated Password:");
        String charscaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String nums = "0123456789";
        String sym = "!@#$&?.<>_-()/*+";

        String pass = charscaps + chars + nums + sym;
        Random rnd = new Random();
        
        char[] password = new char[len];
     for (int i = 0; i < len; i++) 
        {
            password[i] = pass.charAt(rnd.nextInt(pass.length()));
            
        }
        return password;
    }
}
