import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Benjamin Ehlers on 1/1/2019.
 */
public class main {
    public static void main(String[] args) {

        System.out.println("Enter a word to be checked if it follows 'i before e, except after c'. ");
        System.out.println("Enter '!' to quit.");
        while(true) {
            String input;
            ArrayList<Integer> arr = new ArrayList<>();
            Scanner scan = new Scanner(System.in);
            input = scan.nextLine();
            if(input.equals("!")) break;
            for(int i = 0; i < input.length(); i++) {
                arr.add(Integer.parseInt(input.substring(i, i + 1)));
            }
            QueenCheck queenCheck = new QueenCheck(arr);
            System.out.println(input + " => " + queenCheck.check());
        }
    }
}
