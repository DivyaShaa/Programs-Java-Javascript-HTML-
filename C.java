package p1;
import java.util.*;

public class C {

	public static void
    allAlphabets(String str)
    {
        
       str = str.toLowerCase();
        boolean allLetter = true;
 
        for (char ch = 'a'; ch <= 'z'; ch++) {
 
            if (!str.contains(String.valueOf(ch))) {
                allLetter = false;
                break;
            }
        }
        if (allLetter)
            System.out.println("Yes the entered string is pangram");
        else
            System.out.println("No,the entered string is not pangram");
    }
 
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
 
        // Function call
        allAlphabets(str);
    }
	
}
