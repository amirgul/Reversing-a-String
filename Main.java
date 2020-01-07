import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("this program will reverse the given string");
        System.out.println("please enter the string");
        String sentence = keyboard.nextLine();
        String reverse = "";
        for(int i = sentence.length()-1; i>=0; i--)
        {
            reverse = reverse + sentence.charAt(i);

        }
        System.out.println("reverse string is: " + reverse.trim());
    }
}
