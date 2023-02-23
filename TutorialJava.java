
/**
 * Write a description of class Anagrams here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Anagrams
{
    public static void main(String[]  args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        String word1;
        String word2;
        System.out.println("Enter first word");
        word1 = input.nextLine();
        System.out.println("Enter the second word");
        word2 = input.nextLine();
        
        System.out.println("Pineapple is great!");
        for (int i=0; i<= word1.length()-1; i++) {
            for (int j = 0; j <= word2.length()-1; j++) {
                if (word1.charAt(i) == word2.charAt(j)){
                    count++;
                    break;
                }
                
            }
        }
        
        if (count != word1.length() && count != word2.length() ) {
            System.out.println("These words are not anagrams!");
        }
        else {
            System.out.println("These words are anagrams!");
        }
        }
    }
