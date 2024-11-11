import java.util.*;

public class GeneratePass {
    public static String generatePass()
    {
        
        String password = "";
        String str = "ABCDEFGHabcdef0123456789";

        for(int i=0;i<6;i++)
        {
            int idx = (int)Math.floor(Math.random()*(str.length())+1);
            char ch = str.charAt(idx);

            password += ch;
        }

        return password;


    }
    public static void main(String args[]) 
    {
        System.out.println("Your PassWord: " + generatePass());
    }
}
