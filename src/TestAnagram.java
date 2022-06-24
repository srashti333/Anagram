import java.util.Scanner;

public class TestAnagram
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        IsAnagram obj=new IsAnagram();
        char choice = 'y';
        while(choice=='y'|| choice=='Y')
        {
            System.out.println("Enter First String : ");
            String String1 = sc.next();
            System.out.println("Enter Second String : ");
            String String2 = sc.next();
            System.out.println();
            System.out.println("Lets check whether pair of strings are anagrams or not!");
            if (obj.isAnagram(String1, String2))
            {
                System.out.println("The pair of " + String1 + " and " + String2 + " are anagrams.");
            }
            else
            {
                System.out.println("The provided pair are not anagrams");
            }
            System.out.println();
            System.out.println("Press Y to repeat this operation on other strings. ");
            choice=sc.next().charAt(0);
            System.out.println("---------------------------------------------------------------------");
        }
    }
}
